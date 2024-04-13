package com.ahilesh;

import com.ahilesh.config.ConfigFactory;
import com.ahilesh.driver.Driver;
import com.ahilesh.reports.ExtentReport;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class APIBaseTest {

    @BeforeClass
    
    public void apibaseTest(){

        RestAssured.baseURI= ConfigFactory.getconfig().serverurl();

    }


}
