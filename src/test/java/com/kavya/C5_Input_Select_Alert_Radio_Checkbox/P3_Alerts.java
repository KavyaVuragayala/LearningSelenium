package com.kavya.C5_Input_Select_Alert_Radio_Checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class P3_Alerts {

    @Test
    public static void alerts(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

   //     driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

     //   Alert alert = driver.switchTo().alert();
       // alert.accept();

      //  String result = driver.findElement(By.id("result")).getText();
      //  Assert.assertEquals(result,"You successfully clicked an alert");

        //*******************************************************************************************

     //   driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        alert.dismiss();

     //   String result = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result,"You clicked: Ok");
//        Assert.assertEquals(result,"You clicked: Cancel");  // if clicked cancel

        //*********************************************************************************************

        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String name = "Alice";
        alert.sendKeys(name);
        alert.accept();
        //alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You entered: "+name);


        driver.quit();

    }
}
