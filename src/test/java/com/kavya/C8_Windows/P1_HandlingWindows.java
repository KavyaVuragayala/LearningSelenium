package com.kavya.C8_Windows;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class P1_HandlingWindows {

    @Test
    @Description("Verifying that clicking a link on parent window , should open the child window and verify the PageSource")
    public static void windows(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        // driver.getWindowHandles  -> multiple windows

        String parentId = driver.getWindowHandle(); // single window
        System.out.println(parentId); // prints the 16 digit tab id [ 1782A21FB1B730337A435A5DC60980FF ]
        System.out.println(driver);   // add the debugging point , this prints the session id{always belongs to selenium}

        //click on the link
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click(); //a[text()='Click Here']

        //2nd Window
        // returns set because all the window tab ids are unique
        Set<String> window_handles = driver.getWindowHandles(); // prints 2 ids
        System.out.println(window_handles);

        // How to switch to the child window and verify the text of the new window

        for(String window : window_handles){
            driver.switchTo().window(window);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Case Passed");
            }
        }

       driver.switchTo().window(parentId);


        driver.quit();
    }
}
