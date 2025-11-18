package com.kavya.C5_Input_Select_Alert_Radio_Checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class P1_Input_Checkbox_Radio {

    @Description("Handling Input, CheckBox, Radio Buttons")
    @Test
    public static void handlingPlaceholders() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://awesomeqa.com/practice.html");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        //Placeholder
        driver.findElement(By.name("firstname")).sendKeys("Alice");

        //RadioBox
        driver.findElement(By.xpath("//input[@value='Female']")).click();

        //CheckBox
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();

        driver.quit();


    }
}
