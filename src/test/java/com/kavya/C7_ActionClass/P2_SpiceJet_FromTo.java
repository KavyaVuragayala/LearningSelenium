package com.kavya.C7_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P2_SpiceJet_FromTo {

    @Test
    public static void test_actions() throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // //div[@data-testid='to-testID-origin']/div/div/input
        WebElement from_xpath = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));

        // move to element
        // click
        // sendkeys -from ->BLR    to-> HYD

        Actions actions = new Actions(driver);
        actions.moveToElement(from_xpath).click().sendKeys("BLR").build().perform();


        WebElement to_xpath = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div/div/input"));
        actions.moveToElement(to_xpath).click().sendKeys("HYD").build().perform();

        driver.close();


    }
}
