package com.ahilesh.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {
    private ExtentManager(){}

    static final ThreadLocal<ExtentTest> threadlocal=new ThreadLocal<>();

    static ExtentTest getExtentTest(){
        return threadlocal.get();
    }

    static void setExtentTest(ExtentTest test){
        threadlocal.set(test);
    }
}
