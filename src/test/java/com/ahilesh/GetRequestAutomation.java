package com.ahilesh;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetRequestAutomation
{
    @Test

    public void getRequestAutomation(){
        RestAssured.baseURI="https://reqres.in/api/users";

        Response res = RestAssured.given().param("page", 2).when().get();

        //System.out.println("res = " + res.getBody().asString());

        System.out.println("res.getStatusCode() = " + res.getStatusCode());
        System.out.println("res.getCookies() = " + res.getCookies());
        System.out.println("res.time() = " + res.getTime());
        System.out.println("res.contentType() = " + res.contentType());
        System.out.println("res.prettyPrint() = " + res.prettyPrint());
       /* RestAssured.given().param("page","2")
                .when()
                .get()
                .then()
                .assertThat()
                .log()
                .all()
                .statusCode(200);*/
    }
}
