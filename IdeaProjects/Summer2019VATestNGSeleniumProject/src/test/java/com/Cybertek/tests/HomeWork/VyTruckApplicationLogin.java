package com.Cybertek.tests.HomeWork;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTruckApplicationLogin {

    public static void main(String[] args) throws InterruptedException {

        // open the browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // Maximize the screen
        driver.manage().window().maximize();
        // open a URL,go to the web
        driver.get("http://qa2.vytrack.com/user/login");
        Thread.sleep(2000);
        //input username
        WebElement username=driver.findElement(By.tagName("input"));
        username.sendKeys("user13");
        Thread.sleep(2000);
        // input password
        WebElement Password=driver.findElement(By.name("_password"));
        Password.sendKeys("UserUser123");
        //click login
        WebElement Login=driver.findElement(By.tagName("button"));
        Thread.sleep(2000);
        Login.click();

        Thread.sleep(4000);
        driver.close();


    }

}
