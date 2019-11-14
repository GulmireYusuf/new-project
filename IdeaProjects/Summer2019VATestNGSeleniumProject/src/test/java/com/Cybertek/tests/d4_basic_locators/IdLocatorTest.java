package com.Cybertek.tests.d4_basic_locators;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        driver.manage().window().maximize();

        //driver.manage().window().fullscreen();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement element = driver.findElement(By.id("disappearing_button"));

        String txt=element.getText();
        System.out.println("txt = " + txt);

        element.click();
        Thread.sleep(3000);
        driver.quit();
    }







}
