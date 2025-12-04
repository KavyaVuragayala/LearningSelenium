package com.kavya.C12_SeleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_NoSuchElementException {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");

        driver.findElement(By.id("hello"));

        // Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#hello"}
        //  (Session info: chrome=142.0.7444.176)
    }
}
