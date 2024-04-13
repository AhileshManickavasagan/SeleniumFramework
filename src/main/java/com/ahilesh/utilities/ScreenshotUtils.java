package com.ahilesh.utilities;

import com.ahilesh.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtils {

    private ScreenshotUtils(){}

    public static String getScreenshot(){
        if (DriverManager.getDriver()==null) {
            return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
        }else{
            return null;
        }
    }
}
