package com.ahilesh.listeners;

import com.ahilesh.annotation.FrameworkAnnotations;
import com.ahilesh.reports.ExtentLogger;
import com.ahilesh.reports.ExtentReport;
import org.testng.*;

import java.util.Arrays;

public class TestListener implements IExecutionListener , IInvokedMethodListener, ISuiteListener, ITestListener {


    public void onStart(ITestContext context){

        ExtentReport.initReports();
    }

    public void onFinish(ITestContext context){
        ExtentReport.flushReports();

    }

    public void onTestStart(ITestResult result){
        ExtentReport.createTest(result.getName());
        ExtentReport.assignAuthor(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotations.class).author());

    }

    public void onTestFailure(ITestResult result){
       // Commented out to test API test
        // ExtentLogger.Fail(result.getName()+" is failed");
       // ExtentLogger.Fail(result.getThrowable().getMessage());
        Arrays.toString(result.getThrowable().getStackTrace());

    }

    public void onTestSuccess(ITestResult result){
       //commented for API test
        // ExtentLogger.pass(result.getName()+" is passed");

    }

    public void onTestSkipped(ITestResult result){
        ExtentLogger.skip(result.getName()+" is skipped");

    }
}
