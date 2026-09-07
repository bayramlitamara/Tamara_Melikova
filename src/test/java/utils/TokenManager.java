package utils;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TokenManager {

    private static final String EMAIL = "admin@test.com";
    private static final String PASSWORD = "Admin1234";

    private static String token;

    public static String login() {
        if (token != null) {
            return token;
        }

        Map<String, String> credentials = new HashMap<>();
        credentials.put("email", EMAIL);
        credentials.put("password", PASSWORD);

        Response response = given()
                .contentType("application/json")
                .body(credentials)
                .when()
                .post("/auth/login");

        response.then().statusCode(200);

        token = response.jsonPath().getString("token");
        if (token == null || token.isEmpty()) {
            throw new RuntimeException("Login cavabında 'token' sahəsi tapılmadı");
        }
        return token;
    }
}