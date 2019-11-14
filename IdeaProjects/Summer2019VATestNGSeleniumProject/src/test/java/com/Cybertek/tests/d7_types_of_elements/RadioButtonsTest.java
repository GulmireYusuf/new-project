package com.Cybertek.tests.d7_types_of_elements;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTest {
    @Test
    public void test1() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue = driver.findElement(By.id("blue"));
        WebElement red = driver.findElement(By.id("red"));

        System.out.println("is blue selected:" + blue.isSelected());
        System.out.println("is red selected:" + red.isSelected());

        //verify if blue is selected
        Assert.assertTrue(blue.isSelected());
        // verify red is not selected
        Assert.assertFalse(red.isSelected());

        System.out.println("Clicking on red");
        System.out.println("is blue selected:" + blue.isSelected());
        System.out.println("is red selected:" + red.isSelected());

        // verify blue is NOT selected
        Assert.assertFalse(blue.isSelected());
        // verify red is NOT selected
        Assert.assertFalse(red.isSelected());

    }
}