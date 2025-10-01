package com.kavya.C1_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P1_SeleniumBasic {

    @Test
    public void test_check(){

        Assert.assertEquals("alice","Alice");
    }

    @Test
    public void open_url(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
