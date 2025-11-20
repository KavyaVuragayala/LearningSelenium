package com.kavya.C6_SVG_Elements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class P1_SVG {

    @Description("Handling Search SVG element from slipcart website")
    @Test
    public static  void svg_elements(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.flipkart.com/search");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

        driver.findElement(By.name("q")).sendKeys("mobiles");

        // will fetch all the svg elements
        List<WebElement> search =driver.findElements(By.xpath("//*[name()='svg']"));
        search.get(0).click();
       // driver.findElement(By.xpath("//*[name()='svg'][1]")).click();


        String URL = "//div[contains(@data-id,'MOB')]/div[1]/a[1]/div[2]/div[1]/div[1]";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(URL)));

        // Printing list of all the titles
        List<WebElement> titlesResults = driver.findElements(By.xpath(URL));

        for (WebElement title : titlesResults) {
                System.out.println(title.getText());
            }


        // until Next button is visible, for loop
        WebElement next_button = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
        while(next_button.isDisplayed()){

            WebElement next_button_page2 = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
            next_button_page2.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(URL)));



            List<WebElement> titlesResults2 = driver.findElements(By.xpath(URL));

            for (WebElement title :  titlesResults2){
                if(title.getText()!= null){
                    System.out.println(title.getText());
                }

            }
        }



        driver.quit();


    }
}
