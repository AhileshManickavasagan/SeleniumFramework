package com.ahilesh.pages.pagecompnent;

import com.ahilesh.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class topmenucomponent {

public static By AritclesMenu= By.xpath("//*[@id='articles']");
    public static void  validate_MainComponent(){

        DriverManager.getDriver().findElement(AritclesMenu).click();
    }
}
