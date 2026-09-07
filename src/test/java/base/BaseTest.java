package base;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeSuite;
import utils.TokenManager;

import static io.restassured.RestAssured.given;

public class BaseTest {

    protected static String userToken;

    @BeforeSuite(alwaysRun = true)
    public void globalSetup() {
        RestAssured.baseURI = "https://api.anarabbas.com";
        userToken = TokenManager.login();
    }

    protected RequestSpecification authSpec(String token) {
        return given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON);
    }
}