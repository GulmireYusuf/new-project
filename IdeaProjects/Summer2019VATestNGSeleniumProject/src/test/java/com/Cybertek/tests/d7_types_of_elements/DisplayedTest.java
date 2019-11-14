package com.Cybertek.tests.d7_types_of_elements;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedTest {

    @Test
    public void test1() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
       // verify element is displayed
        WebElement home=driver.findElement(By.linkText("Home"));

        // verify element not displaed
        WebElement blue = driver.findElement(By.id("blue"));

        // verify if element is displayed on screen,verify if visible
        Assert.assertTrue(blue.isDisplayed());


    }
}