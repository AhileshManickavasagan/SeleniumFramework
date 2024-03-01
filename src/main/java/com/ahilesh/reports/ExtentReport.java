package com.ahilesh.reports;

import com.ahilesh.constant.FrameworkConstants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public final class ExtentReport {

    private ExtentReport(){}

    static ExtentReports extent;
    static ExtentTest extentTest;

    public static void initReports(){
        extent=new ExtentReports();
       // System.out.println(FrameworkConstants.getReportPath());
        ExtentSparkReporter spark=new ExtentSparkReporter(FrameworkConstants.getReportPath());
        extent.attachReporter(spark);

    }

    public static void flushReports(){
        extent.flush();
    }

    public static void createTest(String TestCaseName){

        extentTest=extent.createTest(TestCaseName);
        ExtentManager.setExtentTest(extentTest);

    }

    public static void assignAuthor(String Author){
        ExtentManager.getExtentTest().assignAuthor(Author);

    }
}

