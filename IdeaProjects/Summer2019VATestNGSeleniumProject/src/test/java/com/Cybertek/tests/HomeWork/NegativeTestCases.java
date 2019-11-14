package com.Cybertek.tests.HomeWork;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NegativeTestCases {
    public static void main(String[] args) throws InterruptedException {
        // open the browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // Maximize the screen
        driver.manage().window().maximize();
        // open a URL,go to the web
        driver.get("http://qa2.vytrack.com/user/login");
        Thread.sleep(2000);
        //input username
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("ghnjh");
        Thread.sleep(2000);
        // input password
        WebElement Password = driver.findElement(By.name("_password"));
        Password.sendKeys("56789");
        //click login
        WebElement Login = driver.findElement(By.tagName("button"));
        Thread.sleep(2000);
        Login.click();
        Thread.sleep(4000);
        String actualtext = driver.findElement(By.xpath("//div[contains(text(),'Invalid user name or password.')]")).getText();
        String expectedText ="Invalid user name or password.";
        if (expectedText.equals(actualtext)) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
            System.out.println("expectedText = " + expectedText);
            System.out.println("actualtext = " + actualtext);
        }


    }

}
