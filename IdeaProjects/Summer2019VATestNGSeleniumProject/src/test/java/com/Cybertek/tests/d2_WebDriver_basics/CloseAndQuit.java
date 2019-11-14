package com.Cybertek.tests.d2_WebDriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // TODO close one tab out of one
//        driver.get("http:practice.cybertekschool.com");
//
//        Thread.sleep(1000);
//        // close() --> close the current tab/window
//        driver.close();

        // TODO close one tab out of two tabs
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);
        driver.close();
        driver.quit();

        // TODO close all open tab



    }
}
