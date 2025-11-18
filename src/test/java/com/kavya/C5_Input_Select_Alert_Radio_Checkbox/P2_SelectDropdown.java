package com.kavya.C5_Input_Select_Alert_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class P2_SelectDropdown {

    @Test
    public static void select(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);

       // select.selectByIndex(1);
        select.selectByVisibleText("Option 2");
        driver.quit();
    }
}
