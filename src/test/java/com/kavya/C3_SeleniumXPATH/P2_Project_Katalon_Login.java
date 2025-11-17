package com.kavya.C3_SeleniumXPATH;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P2_Project_Katalon_Login {

    @Description("Making an appointment and checking the header of next page ")
    @Test
    public static void makeappointment() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Thread.sleep(3000);

        driver.findElement(By.id("btn-make-appointment")).click();

        driver.findElement(By.cssSelector("input[id=\"txt-username\"]")).sendKeys("John Doe");
        driver.findElement(By.cssSelector("input[id=\"txt-password\"]")).sendKeys("ThisIsNotAPassword");

        driver.findElement(By.xpath("//button[@id='btn-login']")).click();

        Thread.sleep(3000);

        WebElement verifyMessage = driver.findElement(By.xpath("//h2[normalize-space()='Make Appointment']"));
        Assert.assertEquals(verifyMessage.getText(),"Make Appointment");


        driver.quit();

    }
}
