package com.ahilesh.driver;

import com.ahilesh.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    private DriverManager(){};
    public  static ThreadLocal<WebDriver> threadLocal=new ThreadLocal<>();
    public static WebDriver getDriver(){
        return  threadLocal.get();
    }

    public static void  setDriver(WebDriver driver){
        
        threadLocal.set(driver);
    }



}
