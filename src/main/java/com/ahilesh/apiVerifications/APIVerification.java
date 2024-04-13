package com.ahilesh.apiVerifications;

import com.ahilesh.reports.ExtentLogger;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

public class APIVerification  {

    public static void responsecodeValidation(Response response,int statusCode){
        try{
            Assert.assertEquals(statusCode,response.getStatusCode());
            System.out.println("\"validated status code\" = " + response.getStatusCode());
            //  ExtentLogger.info("validated status code"+String.valueOf(response.getStatusCode()));
        }
        catch(AssertionError e) {
            ExtentLogger.info("Exception is"+ e.fillInStackTrace());
            ExtentLogger.info("Expected status code is"+String.valueOf(statusCode));

        }catch (Exception e){
            ExtentLogger.info("Exception is"+ e.fillInStackTrace());
        }
    }
    public static void responsekeyValidationfromarray(Response response, String key){
        try{
            JSONArray array=new JSONArray(response.getBody().asString());
            for (int i=0;i<array.length();i++){
                //  System.out.println("array.get(i) = " + array.get(i));
                JSONObject obj=array.getJSONObject(i);
         //       ExtentLogger.info(String.valueOf(obj.get(key)));
                System.out.println("obj.get(\"title\") = " + obj.get(key));

            }

        }
        catch (Exception e){
            ExtentLogger.info("Exception is"+ e.fillInStackTrace());
        }



    }
    public static void responsekeyValidationfromJSONObject(Response response, String key) {
        try {
            JSONObject json = new JSONObject(response.getBody().asString());
            if (json.has(key) && json.get(key) != null) {

               // ExtentLogger.info(String.valueOf(key));
                System.out.println("String.valueOf(key) = " + String.valueOf(key));
            } else {
                ExtentLogger.info("Key is not available");
            }

            ;

        } catch (Exception e) {
            ExtentLogger.info("Exception is" + e.fillInStackTrace());
            {

            }
        }
    }

    public static void responsetimeValidation(Response response) {
        try {
            long time = response.time();
           // ExtentLogger.info("The response time is " + String.valueOf(time));
            System.out.println("\"The response time is \" = " + String.valueOf(time));

        } catch (Exception e) {
            ExtentLogger.info("Exception is" + e.fillInStackTrace());
        }
    }

}
