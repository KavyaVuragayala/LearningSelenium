package com.kavya.C1_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P2_SeleniumBasic {

    @Test
    public void test_seleniumversion3(){

        // in selenium 3 we have to set the browserdriver using setProperty method

        System.setProperty("webdriver.chrome.driver","C://Users/path/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

    }
}
