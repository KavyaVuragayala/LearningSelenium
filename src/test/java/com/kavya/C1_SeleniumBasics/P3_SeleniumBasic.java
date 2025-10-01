package com.kavya.C1_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class P3_SeleniumBasic {

    @Test
    public void test_Selenium4Scenarios(){

        // 1. want to run on chrome or edge
        ChromeDriver driver = new ChromeDriver();

        // 2. want to run on chrome then change to edge
        WebDriver driver1 = new ChromeDriver();
        driver1 = new EdgeDriver();

        // 3. Want to un on multiple browsers , aws machine
        RemoteWebDriver driver2 = new ChromeDriver();
    }
}
