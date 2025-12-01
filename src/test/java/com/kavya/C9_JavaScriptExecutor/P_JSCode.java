package com.kavya.C9_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P_JSCode {

    @Test
    public static void jsCode(){

        // JavaScript Executor is an interface
        // JS Exe is used when there are hidden elements in the webpage
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.location='https://www.google.com'");
        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']")); //shadow dom

        js.executeScript("window.scroll(0,500)");
        js.executeScript("window.scroll(0,500)");

        String url = js.executeScript("return document.URL").toString();
        String title = js.executeScript("return document.title").toString();

        System.out.println(url);
        System.out.println(title);




    }
}
