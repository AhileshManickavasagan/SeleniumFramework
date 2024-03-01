package com.ahilesh.driver;

import com.ahilesh.config.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteDriverFactory {

    private RemoteDriverFactory(){}

    public static WebDriver getRemoteDriver(String browser) throws MalformedURLException {
        WebDriver driver = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (browser.equalsIgnoreCase("chrome")) {
            capabilities.setBrowserName("chrome");

        } else if (browser == "edge") {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return new RemoteWebDriver(new URL(ConfigFactory.getconfig().remoteURL()), capabilities);
    }
}
