package com.ahilesh;


import com.ahilesh.annotation.FrameworkAnnotations;
import com.ahilesh.pages.LoginPage;
import com.ahilesh.pages.pagecompnent.topmenucomponent;
import com.ahilesh.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class LoginTest extends  BaseTest {

    public LoginTest(){

        topmenucomponent menu=new topmenucomponent();
    }



    @FrameworkAnnotations(author = "Ahilesh")
    @Test(description = "To validate login page",dataProvider = "getData",dataProviderClass = DataProvider.class)
    public void loginTest(TestData testData) throws InterruptedException, MalformedURLException {
     //   WebDriverManager.chromedriver().setup();

         LoginPage loginpage=new LoginPage();
         loginpage.logintoApplication(testData.userName,testData.passWord);


        topmenucomponent.validate_MainComponent();
    }

}
