package com.kavya.C11_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class P2 {

    @Test
    public static void RL_codepen(){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        driver.switchTo().frame("result");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement error_msg = driver.findElement(with(By.tagName("small")).below(username));

        String errorText = error_msg.getText();
        Assert.assertEquals(errorText,"Username must be at least 3 characters");

        driver.close();
    }
}
