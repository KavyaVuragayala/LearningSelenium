package com.kavya.C1_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class P12_OptionClass {

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
//        chromeOptions.addArguments("--window-size=800,600");
//        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
       // chromeOptions.addArguments("--guest");


        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getCurrentUrl());

        driver.quit();


    }
}
