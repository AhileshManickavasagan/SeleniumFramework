package com.ahilesh;

import com.ahilesh.apiConfigs.APIPAth;
import com.ahilesh.apiConfigs.HeaderConfigs;
import com.ahilesh.pojo.PostAPIPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class SerializationTest extends APIBaseTest{

    @Test
    public void SerializationTest(){
        HeaderConfigs head=new HeaderConfigs();
        PostAPIPojo pojo=new PostAPIPojo(22,"abcd","qwerty");
        Response response=RestAssured.given().when().headers(head.defaultHeaders()).body(pojo).post(APIPAth.apiPath.CREATE_POSTS);
        System.out.println("response.getBody().asString() = " + response.getBody().asString());

        System.out.println("pojo.getId() = " + pojo.getId());
        System.out.println("pojo.getAuthor() = " + pojo.getAuthor());
        System.out.println("pojo.getTitle() = " + pojo.getTitle());

    }
}
