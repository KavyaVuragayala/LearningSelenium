package com.kavya.C7_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P1_Keys {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        //Keys - Action classes
        WebElement firstname = driver.findElement(By.name("firstname"));
        Actions actions = new Actions(driver);
        actions.moveToElement(firstname)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("John Alice")
                .keyUp(Keys.SHIFT)
                .build().perform();


        Thread.sleep(3000);

        driver.close();
    }
}
