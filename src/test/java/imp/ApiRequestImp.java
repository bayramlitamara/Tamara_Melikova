package imp;

import com.thoughtworks.gauge.Step;
import helper.ApiHelper;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiRequestImp {

    private static Response response;
    private String endpoint;
    private ApiHelper apiHelper = ApiHelper.getInstance();


    // Deyerleri saxlamaga

    private static Map<String, String> savedValues = new HashMap<>();

    // Helper methodlar

    private void displayResponse(String method) {
        System.out.println("Response Body : ");
        System.out.println("Response Body : " + method);
        System.out.println("Status Code : " + response.getStatusCode());
        System.out.println("Response Time : " + response.getTime() + "ms");
    }


    @Step("Set base Url to <url>")
    public void setBaseUrl(String url) {
        apiHelper.setBaseUrl(url);
    }

    @Step("Api e GET request gönder <url>")
    public void sendGetRequest(String url) {
        response =
                given()
                        .when()
                        .get(url)
                        .then()
                        .log().all()
                        .extract().response();
    }

    @Step("Status kodunu <statusCode> olmalıdır")
    public void validateStatusCode(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @Step("Json cavabında <key> deyeri boş olmamlıdır")
    public void jsonKeyShouldBeNotEmpty(String key) {
        response.then().body(key, not(isEmptyOrNullString()));
    }

    @Step("Json cavabında <key> deyeri <expectedValue> beraberdir")
    public void jsonKeyEqualsString(String key, String expectedValue) {
        response.then().body(key, equalTo(expectedValue));
        System.out.println("Jsondakı expectedValue yoxlanıldı: " + key + expectedValue);
    }

    @Step("Header <headerKey> movcud olmalıdır")
    public void headerShouldBeNotEmpty(String headerKey) {
        response.then().header(headerKey, notNullValue());
    }

    @Step("Initalize request spesification")
    public void initalizeRequest() {
        apiHelper.resetRequestSpecification();
        System.out.println("Initialize request spesification");
    }

    @Step("Add Endpoint <endpoint>")
    public void addEndpoint(String endpoint) {
        this.endpoint = endpoint;
        apiHelper.addEndpoint(endpoint);
    }


    @Step("Response cavab müddeti <maxMillis> milliSaniyeden az olmalıdır")
    public void responseTimeLessThan(String maxMillis) {
        long max = Long.parseLong(maxMillis);
        response.then().time(lessThan(max), TimeUnit.MILLISECONDS);
    }
    @Step("Cavab array boş olmamalıdır")
    public void responseArrayShouldNotBeEmpty() {
        java.util.List<Object> list = response.jsonPath().getList("");
        org.assertj.core.api.Assertions.assertThat(list).isNotNull();
        org.assertj.core.api.Assertions.assertThat(list).isNotEmpty();
    }

    @Step("Cavab <key> array boş olmamalıdır")
    public void responseArrayShouldNotBeEmptyByKey(String key) {
        java.util.List<Object> list = response.jsonPath().getList(key);
        org.assertj.core.api.Assertions.assertThat(list).isNotNull();
        org.assertj.core.api.Assertions.assertThat(list).isNotEmpty();
    }

    @Step("Bütün elementlerin <key> sahesi boş olmamalıdır")
    public void allElementsFieldShouldNotBeEmpty(String key) {
        java.util.List<Object> values = response.jsonPath().getList(key);
        org.assertj.core.api.Assertions.assertThat(values).isNotNull();
        for (int i = 0; i < values.size(); i++) {
            Object value = values.get(i);
            org.assertj.core.api.Assertions.assertThat(value)
                    .as("Field '" + key + "' is null at index " + i)
                    .isNotNull();
            if (value instanceof String) {
                org.assertj.core.api.Assertions.assertThat(((String) value).trim())
                        .as("Field '" + key + "' is empty at index " + i)
                        .isNotEmpty();
            }
        }
    }
}

