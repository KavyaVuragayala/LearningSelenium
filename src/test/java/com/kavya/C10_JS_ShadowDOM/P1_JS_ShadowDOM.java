package com.kavya.C10_JS_ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P1_JS_ShadowDOM {

    @Test
    public static void jsShadowDOM(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

     //   driver.findElement(By.id("pizza")).sendKeys("farmhouse");  this is a shadow dom element so this shows error

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement inputPizzabox = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
        inputPizzabox.sendKeys("farmhouse");

        driver.quit();


    }
}
