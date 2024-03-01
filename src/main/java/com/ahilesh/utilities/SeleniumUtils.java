package com.ahilesh.utilities;

import com.ahilesh.config.ConfigFactory;
import com.ahilesh.driver.DriverManager;
import com.ahilesh.enums.WaitType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtils {

    public static void click(By by, WaitType waitType){
        WebElement element;
        if (waitType== WaitType.PRESENCE) {
             element = (WebElement) waitElementUntilPresent(by);
        }
        else if(waitType== WaitType.CLICKABLE){

            element = (WebElement) waitElementuntilClickable(by);
        }
        else{
            element=null;
        }
        assert element != null;
        element.click();
    }

    private static WebElement waitElementuntilClickable(By by) {
        WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(ConfigFactory.getconfig().timeout()));
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void sendKeys(By by,String Value){
        WebElement element= (WebElement) waitElementUntilPresent(by);
        element.sendKeys(Value);
    }

    private static WebElement waitElementUntilPresent(By by){
            WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getconfig().timeout()));
           return  wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
