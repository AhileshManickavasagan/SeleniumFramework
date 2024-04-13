package com.ahilesh.pages;

import com.ahilesh.config.ConfigFactory;
import com.ahilesh.driver.DriverManager;
import com.ahilesh.enums.WaitType;
import com.ahilesh.reports.ExtentLogger;
import com.ahilesh.reports.ExtentManager;
import com.ahilesh.reports.ExtentReport;
import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.time.Duration;

import static com.ahilesh.driver.Driver.*;
import static com.ahilesh.utilities.SeleniumUtils.*;

public class LoginPage {
    private static final By LABEL_FROM =By.xpath("//label[contains(text(),'From')]");
    private static final By TXTBOX_FROM =By.xpath("//label[contains(text(),'From')]//following-sibling::div");

    private static final By LABEL_TO =By.xpath("//label[contains(text(),'To')]");
    private static final By TXTBOX_TO =By.id("//label[contains(text(),'To')]//following-sibling::div");
    private static final By BTN_SEARCH =By.id("search_button");

    private LoginPage SetFROM(String From) throws MalformedURLException {
        ExtentLogger.pass("Element is clicked");
        ExtentLogger.Fail("Failed Message is sent");
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigFactory.getconfig().timeout()));
        click(TXTBOX_FROM,WaitType.PRESENCE );
        sendKeys(TXTBOX_FROM,From);
        ExtentLogger.pass("Element is clicked");

        InitDriver();
        return this;
    }

        private LoginPage setDestination(String destination) {
        sendKeys(TXTBOX_TO,destination);
        ExtentLogger.Fail("Failed to Click Element");
        return this;
    }
    private void clickSearch(){

        click(BTN_SEARCH, WaitType.PRESENCE);;
        ExtentLogger.skip("Skipped the element");

    }

    public void logintoApplication(String Username,String Password) throws MalformedURLException {
        SetFROM(Username).setDestination(Password); //Method Chaining
        clickSearch();
    }

}
