package com.ahilesh;

import com.ahilesh.annotation.FrameworkAnnotations;
import com.ahilesh.apiConfigs.APIPAth;
import com.ahilesh.apiVerifications.APIVerification;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetAPIStudent extends  APIBaseTest{

   @FrameworkAnnotations(author = "Ahilesh")
    @Test(description = "To validate API TEST")
    public void getAPITest(){
      // ExtentReport.createTest(method.getName());
       // ExtentLogger.info("My test has started");
        Response response= RestAssured.given().when().get(APIPAth.apiPath.GET_LIST_POSTS);
        APIVerification.responsecodeValidation(response,200);
        APIVerification.responsetimeValidation(response);
        APIVerification.responsekeyValidationfromarray(response,"title");
        //ExtentLogger.info("My test has ended");


    }
}
