package helper;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class ApiHelper {

    // Sıngle pattern

    //Bu paternen bız obyectlerı rahatlıqla cagıra bılırık
    private static  ApiHelper instance;
    private RequestSpecification requestSpecification;
    private String baseUrl;


    private ApiHelper() {
        requestSpecification = given();
    }

    public static ApiHelper getInstance() {
        if (instance == null) {
            instance = new ApiHelper();
        }
        return instance;
    }

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    public void resetRequestSpecification() {
        requestSpecification = given();
        if (baseUrl != null) {
            RestAssured.baseURI = baseUrl;
        }
    }


    //Base url teyın edırık

    public void  setBaseUrl(String url) {
        this.baseUrl = url;
        RestAssured.baseURI = url;
        System.out.println("Base URL: " + url);
    }

    // endpoınt elave edılır

    public  void  addEndpoint(String endpoint) {
        requestSpecification = requestSpecification.basePath(endpoint);
        System.out.println("Add Endpoint: " + endpoint);
    }

}
