package com.kavya.C1_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_CloseVSQuit {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        // write some code

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

      //  driver.close(); // will close the current tab but not the session   , session id != null


       driver.quit(); // will close all the tabs , session id == null
        // once the tab is opened try to open new tabs , after 5 sec all the tabs will be closed
    }
}
