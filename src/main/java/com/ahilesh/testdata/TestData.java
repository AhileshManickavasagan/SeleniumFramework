package com.ahilesh.testdata;


import io.github.sskorol.data.Column;


public class TestData {

    @Column(name="testcasename")

    public String testCaseName;

    @Column(name="username")
    public String userName;
    @Column(name="password")
    public String passWord;

}
