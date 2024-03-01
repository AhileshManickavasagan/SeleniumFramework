package com.ahilesh.constant;

public final class FrameworkConstants {
    private static final String REPORT_PATH=System.getProperty("user.dir")+"/index.html";

    public static String getReportPath(){
        System.out.println("in");
        return REPORT_PATH;
    }
}
