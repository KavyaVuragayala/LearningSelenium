package com.kavya.C12_SeleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P5_TimeOutException {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        System.out.println("Start of program");
        driver.get("https://google.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));

        //Start of program
        //Exception in thread "main" org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //textarea[@id='abc'] (tried for 10 second(s) with 500 milliseconds interval)
        //Build info: version: '4.35.0', revision: '1c58e5028b'

        WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search_inputbox.sendKeys("w3 schools");

    }
}
