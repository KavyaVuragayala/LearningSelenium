package com.kavya.C11_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class P3 {

    @Test
    public static void aqi() throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        searchBox.sendKeys("india"+ Keys.ENTER);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));

        for(WebElement location : locations){

            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String aqi = driver.findElement(with(By.tagName("p")).toRightOf(location)).getText();

            System.out.println(rank + " | " + location.getText() + " | " + aqi );

        }

    }
}
