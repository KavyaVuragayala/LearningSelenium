package com.kavya.C1_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P8_ChangeBrowserDriver {
    public static void main(String[] args) {

        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();

    }
}
