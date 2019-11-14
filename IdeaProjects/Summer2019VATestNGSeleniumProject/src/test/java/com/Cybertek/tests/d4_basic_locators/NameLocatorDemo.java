package com.Cybertek.tests.d4_basic_locators;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorDemo {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
         driver.manage().window().maximize();
         driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName=driver.findElement(By.tagName("input"));
        fullName.sendKeys("John Doe");

        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("johndoe@cybertekschook.com");

        WebElement submitbutton=driver.findElement(By.tagName("button"));
        Thread.sleep(5000);
        submitbutton.click();
        Thread.sleep(2000);
        driver.close();



    }
}