package com.kavya.C7_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_FileUpload {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement uploadFileInput = driver.findElement(By.id("FileToUpload"));
        String user_dir = System.getProperty("user.dir");
        //user.dir = C:\Users\pc\IdeaProjects\LearningSelenium
        String path = user_dir + "/src/test/java/com.kavya/C7_FileUpload/testdata.txt";
        uploadFileInput.sendKeys(path);
        driver.findElement(By.name("submit")).click();


    }
}
