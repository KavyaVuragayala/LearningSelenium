package com.kavya.C7_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_FileUpload_BrowserStack {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://app-automate.browserstack.com/utilities/app_management");

        Thread.sleep(3000);

        WebElement uploadFileInput = driver.findElement(By.id("file-upload"));
        String user_dir = System.getProperty("user.dir");
        //user.dir = C:\Users\pc\IdeaProjects\LearningSelenium
        System.out.println(user_dir);
        String path = user_dir+"/src/test/java/com.kavya/C7_FileUpload/testdroid-sample-app.apk";

        uploadFileInput.sendKeys(path);
    }
}
