package com.kavya.C3_SeleniumXPATH;

import io.qameta.allure.Description;
import org.apache.logging.log4j.core.util.JsonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class P1_Project_OHRM_Login {

    @Description("Verify login page")
    @Test

    public void loginPage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // telling java compiler to wait for 3 seconds
        // worst type of using waits
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

       // driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


        WebElement messageHeader = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']"));
        Assert.assertEquals(messageHeader.getText(),"Dashboard");
        System.out.println("Sucessfully logged in!!!");

        driver.quit();


    }
}
