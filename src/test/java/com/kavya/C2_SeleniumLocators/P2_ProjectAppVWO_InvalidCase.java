package com.kavya.C2_SeleniumLocators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P2_ProjectAppVWO_InvalidCase {
    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Kavya")
    @Test
    public void text_validation() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
        driver.findElement(By.name("password")).sendKeys("12345");
        driver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // System.out.println(driver.findElement(By.id("js-notification-box-msg")).getText());

        WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        driver.quit();
    }
}
