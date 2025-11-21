package com.kavya.C7_ActionClass;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class P3_MMT {

    @Description("Automation for Auto suggestion for from and to destinations")
    @Test
    public static void mmt_suggestion() throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModal.click();

        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("HYD").build().perform();

        Thread.sleep(3000);
        List<WebElement> list_auto_suggested = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));

        try {
            for(WebElement e : list_auto_suggested){
                if(e.getText().contains("Hyderabad")){
                    e.click();
                }
            }
        } catch (Exception e) {
            System.out.println("ok");
        }


        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy='toCity']"));
        actions.moveToElement(toCity).click().sendKeys("VTZ").build().perform();

        driver.close();


    }
}
