package com.Cybertek.tests.d3_webelement_class;

import com.Cybertek.tests.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Verify URL not changed
 * open browser
 * go to http:// practice.cybertekschool.com/forget_password
 *click on Retrieve password
 *verify that url did not change
 */
public class VerifyURLNotChanged {

    public static void main(String[] args) throws InterruptedException {
        // open chrome

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // go to http:// practice.cybertekschool.com/forget_password
       driver.get("http://practice.cybertekschool.com/forgot_password");

       // save the expected url
       String expectedUrl=driver.getCurrentUrl();
       // WebElement -->class that repersents elements from the webPage
        // findElement -->method used to find element on a page
        //returns a webElement
        WebElement retrievePassword=driver.findElement(By.id("form_submit"));

        retrievePassword.click();

        // verify that url did not change to http:// practice.cybertekschool.com/forget_password
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        Thread.sleep(3000);
        //close the browser
        driver.quit();

    }
}
