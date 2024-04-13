package com.ahilesh;

import com.ahilesh.annotation.FrameworkAnnotations;
import com.ahilesh.pages.LoginPage;
import com.ahilesh.testdata.TestData;
import com.ahilesh.utilities.DataProviderUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class HomePageTest extends  BaseTest{


    @FrameworkAnnotations
    @Test(description = "TO check something",dataProvider = "getData",dataProviderClass = DataProviderUtils.class)
    public void HomePageTest(TestData testdata) throws MalformedURLException {
        //   WebDriverManager.chromedriver().setup();


        System.out.println("Test 2 Home page test");
        LoginPage loginpage=new LoginPage();
        loginpage.logintoApplication("Admin","admin123");


    }

}
