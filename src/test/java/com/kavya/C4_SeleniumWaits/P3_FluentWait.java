package com.kavya.C4_SeleniumWaits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class P3_FluentWait {

    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Kavya")
    @Test
    public void text_validation() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
        driver.findElement(By.name("password")).sendKeys("12345");
        driver.findElement(By.id("js-login-btn")).click();


        // ********** Fluent Wait ***************
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        WebElement error_msg = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.id("js-notification-box-msg"));
            }
        });


//        WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
//        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        driver.quit();
    }
}
