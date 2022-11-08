package com.mycompany.app;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.firefox.FirefoxDriver;




public class AppTest {
    public String link = "https://www.youtube.com/watch?v=76ZUiOxFcgs";

    @Parameters("BrowserType")
    @Test
    public void invokeBrowser(String BrowserType) {

        if (BrowserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get(link);
        } else if (BrowserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get(link);
        }



    }
}