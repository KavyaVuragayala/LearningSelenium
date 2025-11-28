package com.kavya.C8_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class P2_HeatMapsAPP_VWO {

    @Test
    //HeatMaps will show where the people are clicking most of the time
    public static void heatMaps_appvwo(){

        WebDriver driver = new ChromeDriver();
        // this should be a shared url
        driver.get("https://app.vwo.com/#/analyze/heatmap/3/reports?token=eyJhY2NvdW50X2lkIjoxMTM0NTkxLCJleHBlcmltZW50X2lkIjozLCJjcmVhdGVkX29uIjoxNzU2MDA4MDkyLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiZTlmNmY0ZGZlMGJhMGIxNmQxMjZmMGJlOTUyMDQ3MmEiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&accountId=1134591");
        driver.manage().window().maximize();

        // wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("primaryUrl")));

        // parent window id
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent -> " + parentWindowHandle);

        //clear the url and enter the url
        WebElement url_input = driver.findElement(By.name("primaryUrl"));
        url_input.clear();
        url_input.sendKeys("https://thetestingacademy.com");

        //click view heatmap button
        WebElement view_heatmap = driver.findElement(By.xpath("//button[text()=\" View Heatmap \"]"));
        view_heatmap.click();

        //wait

        // will print parent and child tab ids
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println(allHandles);

        for(String handle : allHandles){
            if(!(handle.equals(parentWindowHandle))){

                // move to child window
                driver.switchTo().window(handle);
                // in child window move to iframe
                driver.switchTo().frame("heatmap-frame");

                // wait
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Compare\"]")));

                // click on compare button
                WebElement navigate_button = driver.findElement(By.xpath("//span[text()=\"Compare\"]"));
                Actions actions = new Actions(driver);
                actions.moveToElement(navigate_button).click().build().perform();
            }
        }

        driver.quit();

    }
}
