package com.ahilesh.reports;

import com.ahilesh.utilities.ScreenshotUtils;
import com.aventstack.extentreports.MediaEntityBuilder;

public class ExtentLogger {

    public static void pass(String Message){

        ExtentManager.getExtentTest().pass(Message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

    public static void Fail(String Message){

        ExtentManager.getExtentTest().fail(Message,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());

    }

    public  static void skip(String Message){

        ExtentManager.getExtentTest().skip(Message);
    }

    public  static void info(String Message){

        ExtentManager.getExtentTest().info(Message);
    }

}
