package com.ahilesh.driver;

import com.ahilesh.config.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public final class Driver {

   private Driver(){};

    private final static ThreadLocal<WebDriver> threadLocal=new ThreadLocal<>();


    public static void InitDriver() throws MalformedURLException {
        WebDriver driver;

        String browser= ConfigFactory.getconfig().browser();
        String runmode= ConfigFactory.getconfig().runmode();
        if (DriverManager.getDriver()==null) {
            driver = DriverFactory.getDriver(browser,runmode);
            DriverManager.setDriver(driver);

        }

        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigFactory.getconfig().timeout(),TimeUnit.SECONDS);
        DriverManager.getDriver().get(ConfigFactory.getconfig().url());

    }

        public static void QuitDriver () {
            if (DriverManager.getDriver() != null) {
                DriverManager.getDriver().quit();
                DriverManager.setDriver(null);
            }

        }


}

