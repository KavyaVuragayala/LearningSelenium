package com.kavya.C12_SeleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_StaleElementExceptionFIX {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("Start of program");

        WebElement search_input_box  = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        driver.navigate().refresh();

        //Start of program
        //Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
        //  (Session info: chrome=142.0.7444.176)

        //If you try to interact with an element after page reload, Google refreshes the page when the search results appear, so the previous reference becomes stale.
        //Using the correct locator avoids this.

        try {
            search_input_box.sendKeys("w3 schools"+ Keys.ENTER);
        } catch (Exception e) {
            System.out.println("Stale Element Exception");
        }

        WebElement search_input_box1  = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search_input_box1.sendKeys("w3 schools"+ Keys.ENTER);

    }
}
