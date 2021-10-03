package com.example.automationpracticeclarov2.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver = null;

    public static void openBrowser() {
        try{
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }catch(Exception E) {
            E.printStackTrace();
        }
    }

    public static void openURL(String URL) {
        try{
            driver.get(URL);
        }catch(Exception E) {
            E.printStackTrace();
        }
    }
    public static void closeBrowser() {
        try{
            driver.quit();
        }catch(Exception E) {
            E.printStackTrace();
        }
    }

}
