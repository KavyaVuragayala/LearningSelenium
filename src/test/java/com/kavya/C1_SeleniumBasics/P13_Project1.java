package com.kavya.C1_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P13_Project1 {

    @Description("TC#1 - Verify that a particular text exists on the Katalon website ")
    @Test
    public void test_verify_text_katalon(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");

        //driver.getTitle();
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        //driver.getPageSource();
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test Case Passed !");
            Assert.assertTrue(true);
        }else {
            System.out.println("Test Case Failed");
            Assert.fail();
        }

        driver.quit();
    }

}
