package com.Cybertek.tests.d3_webelement_class;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 open browser
 * go to http://practice.cybertekschool.com/forgot_password
 * enter any email
 * click on Retrieve password
 * verify that url changed to http://practice.cybertekschool.com/email_sent
 */

public class VerifyURLChanged {

    public static void main(String[] args) throws InterruptedException {
        // open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //go to http:// practice.cybertekschool.com/forget_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // eneter any email
        WebElement emailInput=driver.findElement(By.name("email"));

        // sendKeys--> enters given text
        emailInput.sendKeys("ajhjdhdn@gmail.com");

        // click on Retrive password

        WebElement retrievePasseord=driver.findElement((By.id("form_submit")));
        retrievePasseord.click();

        String expected="http://practice.cybertekschool.com/forgot_password";
        String actual=driver.getCurrentUrl();
        Thread.sleep(3000);
        if(expected.equals(actual)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");

        }
       Thread.sleep(3000);
        driver.close();

    }
}
