package com.kavya.C12_SeleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_NoSuchElementExceptionFIX {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");

        try {
            driver.findElement(By.id("hello"));
        } catch (Exception e) {
            System.out.println("Element not found");
        }

    }
}
