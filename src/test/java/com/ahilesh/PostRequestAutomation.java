package com.ahilesh;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PostRequestAutomation
{
    @Test
    public static void postrequestAutomation(){
        RestAssured.baseURI="https://reqres.in/api/users";

        String json="{\n"+
                "    \"name\": \"ahilesh\",\n"+
                "    \"job\": \"leader\"\n"+
                "}";
        RestAssured.given().body(json).post().then()
                .log()
                .all()
                .assertThat()
                .statusCode(201);



    }
}
