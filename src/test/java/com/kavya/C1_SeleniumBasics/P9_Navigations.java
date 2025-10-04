package com.kavya.C1_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P9_Navigations {

    @Test
    public void navigation(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        // navigate.to() is same like get() but navigate has back , forward and refresh methods , get() doesn't have
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        driver.quit();

    }
}
