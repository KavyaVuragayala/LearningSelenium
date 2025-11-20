package com.kavya.C6_SVG_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class P2_SVG_Map {


    @Test
    public static void test_india_map_svg(){

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        String Xpath= "//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']";

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));

        List<WebElement> states = driver.findElements(By.xpath(Xpath));
        for(WebElement state : states){
            System.out.println(state.getDomAttribute("aria-label"));
            if(state.getDomAttribute("aria-label").contains("Tripura")){
                state.click();
            }
        }
    }
}
