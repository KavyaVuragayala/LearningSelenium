package com.kavya.C1_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_NoHTTPMethod {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // driver.get("google.com");  doesn't work without HTTP Method

        driver.get("https://google.com");
    }
}
