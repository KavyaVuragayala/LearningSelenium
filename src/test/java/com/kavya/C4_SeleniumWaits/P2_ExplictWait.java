package com.kavya.C4_SeleniumWaits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class P2_ExplictWait {

    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Kavya")
    @Test
    public void text_validation() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
        driver.findElement(By.name("password")).sendKeys("12345");
        driver.findElement(By.id("js-login-btn")).click();

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }

        //********************Explicit Wait***************************
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));


        // System.out.println(driver.findElement(By.id("js-notification-box-msg")).getText());

        WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }

        driver.quit();
    }
}
