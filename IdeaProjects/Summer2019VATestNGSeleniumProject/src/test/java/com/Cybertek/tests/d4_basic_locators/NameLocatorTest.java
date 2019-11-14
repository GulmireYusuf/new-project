package com.Cybertek.tests.d4_basic_locators;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullname=driver.findElement(By.name("full_name"));
        fullname.sendKeys("John Doe");

        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("johndoe@cybertekschook.com");
         WebElement submitbutton=driver.findElement(By.name("wooden_spoon"));
         Thread.sleep(3000);
         submitbutton.click();


    }



}
