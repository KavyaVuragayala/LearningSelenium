package com.kavya.C7_ActionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P2_PageUP_DOWN {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/in/");
        driver.manage().window().maximize();


        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

        driver.close();


    }
}
