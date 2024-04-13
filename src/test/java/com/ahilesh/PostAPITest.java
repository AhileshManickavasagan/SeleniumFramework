package com.ahilesh;

import com.ahilesh.annotation.FrameworkAnnotations;
import com.ahilesh.apiConfigs.APIPAth;
import com.ahilesh.apiConfigs.HeaderConfigs;
import com.ahilesh.apiVerifications.APIVerification;
import com.ahilesh.apibuilders.POSTAPIBuilders;
import com.ahilesh.utilities.JavaUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import java.util.Random;

public class PostAPITest extends APIBaseTest{

    @FrameworkAnnotations(author = "Ahilesh")
    @Test(description = "To validate Post API TEST")
    public void validatepostTest(){


        // ExtentLogger.info("My test has started");
        HeaderConfigs header= new HeaderConfigs();
        POSTAPIBuilders builders=new POSTAPIBuilders();


       Response response= RestAssured.given().when().headers(header.defaultHeaders()).body(POSTAPIBuilders.postrequestBody(JavaUtils.randomnumber(),JavaUtils.randomName(),JavaUtils.randomName())).when().post(APIPAth.apiPath.CREATE_POSTS);
        APIVerification.responsekeyValidationfromJSONObject(response,"title");
        APIVerification.responsetimeValidation(response);
        System.out.println("response = " + response.getBody().asString());
        System.out.println("response = " + response.statusCode());    }
    //ExtentLogger.info("My test has ended");

}
