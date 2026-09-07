package tests;

import base.BaseTest;
import io.restassured.response.Response;
import model.UserRequest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class UserTest extends BaseTest {

    // ---------- Tapşırıq 1: GET /users ----------
    @Test(groups = {"smoke", "users"}, description = "Bütün istifadəçilərin siyahısı düzgün formatda qayıdır")
    public void usersListDuzgunFormatdaGelir() {
        Response response = given()
                .when()
                .get("/users");

        response.then().statusCode(200);

        List<Map<String, Object>> users = response.jsonPath().getList("$");
        Assert.assertFalse(users.isEmpty(), "İstifadəçi siyahısı boş olmamalıdır");

        Map<String, Object> ilkIstifadeci = users.get(0);
        Assert.assertNotNull(ilkIstifadeci.get("id"), "'id' sahəsi olmalıdır");
        Assert.assertNotNull(ilkIstifadeci.get("name"), "'name' sahəsi olmalıdır");
        Assert.assertNotNull(ilkIstifadeci.get("email"), "'email' sahəsi olmalıdır");
    }

    // ---------- Tapşırıq 2: GET /users/:id ----------
    @Test(groups = {"smoke", "users"}, description = "Mövcud istifadəçi id ilə düzgün tapılır")
    public void movcudIstifadeciIdIleTapilir() {
        Response listResponse = given().when().get("/users");
        List<Map<String, Object>> users = listResponse.jsonPath().getList("$");
        String movcudId = (String) users.get(0).get("id");

        Response response = given()
                .pathParam("id", movcudId)
                .when()
                .get("/users/{id}");

        response.then().statusCode(200);
        Assert.assertEquals(response.jsonPath().getString("id"), movcudId,
                "Qaytarılan id gözlənilənlə uyğun deyil");
    }

    @Test(groups = {"users"}, description = "Mövcud olmayan id ilə 404 qayıdır")
    public void movcudOlmayanIdIle404Qayidir() {
        given()
                .pathParam("id", "999999999")
                .when()
                .get("/users/{id}")
                .then()
                .statusCode(404);
    }

    // ---------- Tapşırıq 3: POST /users ----------
    @Test(groups = {"smoke", "users"}, description = "Düzgün datayla yeni istifadəçi yaradılır")
    public void yeniIstifadeciYaradilir() {
        String email = "tamara.test+" + System.currentTimeMillis() + "@test.az";

        Response response = given()
                .spec(authSpec(userToken))
                .body(UserRequest.of("Tamara Test", email))
                .when()
                .post("/users");

        response.then().statusCode(201);

        Assert.assertEquals(response.jsonPath().getString("name"), "Tamara Test",
                "Ad gözlənilənlə uyğun deyil");
        Assert.assertEquals(response.jsonPath().getString("email"), email,
                "Email gözlənilənlə uyğun deyil");
    }

    @Test(groups = {"users"}, description = "Email sahəsi olmadan yaratma cəhdi 400 qaytarır")
    public void emailOlmadanYaratmaCehdi400Qaytarir() {
        given()
                .spec(authSpec(userToken))
                .body("{ \"name\": \"Yalniz Ad Var\" }")
                .when()
                .post("/users")
                .then()
                .statusCode(400);
    }

    // ---------- Tapşırıq 4: PUT /users/:id ----------
    @Test(groups = {"users"}, description = "Mövcud istifadəçi yenilənir və dəyişiklik GET ilə təsdiqlənir")
    public void movcudIstifadeciYenilenir() {
        String email = "put.test+" + System.currentTimeMillis() + "@test.az";
        Response createResponse = given()
                .spec(authSpec(userToken))
                .body(UserRequest.of("Ilkin Ad", email))
                .when()
                .post("/users");
        String id = createResponse.jsonPath().getString("id");

        given()
                .spec(authSpec(userToken))
                .pathParam("id", id)
                .body("{ \"name\": \"Yenilenmis Ad\" }")
                .when()
                .put("/users/{id}")
                .then()
                .statusCode(200);

        Response getResponse = given()
                .pathParam("id", id)
                .when()
                .get("/users/{id}");

        Assert.assertEquals(getResponse.jsonPath().getString("name"), "Yenilenmis Ad",
                "Dəyişiklik server tərəfdə görünmür");
    }

    @Test(groups = {"users"}, description = "Mövcud olmayan id-ni yeniləmə cəhdi 404 qaytarır")
    public void movcudOlmayanIdYenilemeCehdi404Qaytarir() {
        given()
                .spec(authSpec(userToken))
                .pathParam("id", "999999999")
                .body("{ \"name\": \"Kimsə\" }")
                .when()
                .put("/users/{id}")
                .then()
                .statusCode(404);
    }

    // ---------- Tapşırıq 5: DELETE /users/:id ----------
    @Test(groups = {"users"}, description = "Mövcud istifadəçi silinir")
    public void movcudIstifadeciSilinir() {
        String email = "delete.test+" + System.currentTimeMillis() + "@test.az";
        Response createResponse = given()
                .spec(authSpec(userToken))
                .body(UserRequest.of("Silinecek Istifadeci", email))
                .when()
                .post("/users");
        String id = createResponse.jsonPath().getString("id");

        given()
                .spec(authSpec(userToken))
                .pathParam("id", id)
                .when()
                .delete("/users/{id}")
                .then()
                .statusCode(200);
    }

    @Test(groups = {"users"}, description = "Silinmiş istifadəçi GET ilə artıq tapılmır")
    public void silinmisIstifadeciTapilmir() {
        String email = "delete.verify+" + System.currentTimeMillis() + "@test.az";
        Response createResponse = given()
                .spec(authSpec(userToken))
                .body(UserRequest.of("Silinecek Istifadeci 2", email))
                .when()
                .post("/users");
        String id = createResponse.jsonPath().getString("id");

        given()
                .spec(authSpec(userToken))
                .pathParam("id", id)
                .when()
                .delete("/users/{id}")
                .then()
                .statusCode(200);

        given()
                .pathParam("id", id)
                .when()
                .get("/users/{id}")
                .then()
                .statusCode(404);
    }

    // ---------- Tapşırıq 6: Bonus — tam axın ----------
    @Test(groups = {"users", "e2e"},
            description = "İstifadəçinin tam həyat dövrü: yarat -> yoxla -> yenilə -> yoxla -> sil -> yoxla")
    public void istifadeciTamHeyatDovru() {
        String email = "e2e+" + System.currentTimeMillis() + "@test.az";

        Response createResponse = given()
                .spec(authSpec(userToken))
                .body(UserRequest.of("E2E Istifadeci", email))
                .when()
                .post("/users");
        createResponse.then().statusCode(201);
        String id = createResponse.jsonPath().getString("id");

        given().pathParam("id", id).when().get("/users/{id}")
                .then().statusCode(200);

        given()
                .spec(authSpec(userToken))
                .pathParam("id", id)
                .body("{ \"name\": \"E2E Istifadeci Yenilendi\" }")
                .when()
                .put("/users/{id}")
                .then()
                .statusCode(200);

        Response getAfterUpdate = given().pathParam("id", id).when().get("/users/{id}");
        Assert.assertEquals(getAfterUpdate.jsonPath().getString("name"), "E2E Istifadeci Yenilendi");

        given()
                .spec(authSpec(userToken))
                .pathParam("id", id)
                .when()
                .delete("/users/{id}")
                .then()
                .statusCode(200);

        given().pathParam("id", id).when().get("/users/{id}")
                .then().statusCode(404);
    }
}