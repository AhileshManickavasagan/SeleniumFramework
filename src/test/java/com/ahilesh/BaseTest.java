package com.ahilesh;

import com.ahilesh.config.FrameworkConfig;
import com.ahilesh.driver.Driver;
import com.ahilesh.reports.ExtentReport;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BaseTest  {

   protected static FrameworkConfig config;




    @BeforeMethod
    public static void browsersetup(Method method) throws MalformedURLException {
        ExtentReport.createTest(method.getName());
        Driver.InitDriver();

    }
    @AfterMethod
    public static void closeBrowser(){
            Driver.QuitDriver();
    }
}
