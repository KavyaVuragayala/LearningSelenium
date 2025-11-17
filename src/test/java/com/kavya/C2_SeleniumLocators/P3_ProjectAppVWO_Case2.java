package com.kavya.C2_SeleniumLocators;

import io.qameta.allure.Description;
import org.apache.logging.log4j.core.util.JsonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P3_ProjectAppVWO_Case2 {

    @Description("Click on Start your free trail Case and capture the message for invalid email")
    @Test
    public void start_freeTrail(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");


        // ************ checking start your trail is working or not ***************************

        driver.findElement(By.partialLinkText("trial")).click();
        //driver.findElement(By.linkText("Start your free trial")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        driver.findElement(By.id("page-v1-step1-email")).sendKeys("abc");
        driver.findElement(By.name("gdpr_consent_checkbox")).click();

        // use os tagname is not recommended
        driver.findElement(By.tagName("button")).click();

        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage()); ;
        }

        driver.quit();

    }
}
