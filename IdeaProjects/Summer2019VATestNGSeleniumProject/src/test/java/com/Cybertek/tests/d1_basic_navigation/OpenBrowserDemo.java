package com.Cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowserDemo {
    public static void main(String[] args) throws InterruptedException {
        // option+enter MAC
        //we HAVE TO enter this line every time we want to open chrome
        //without we have exception
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://cybertekschool.com");
        //this part is selenium
        //WebDriver--> represent browser
        //new ChromeDriver() --> this line opens chrome
        Thread.sleep(2000);
        driver.close();

    }
}

