package com.kavya.C1_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class P7_TestAssertions {

    // TestNG Assertions
    @Test
    public void test_assertions(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        // AssertJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        // RestAssured in Selenium is not possible because RestAssured is used when there is validatable response

        driver.quit();
    }


}
