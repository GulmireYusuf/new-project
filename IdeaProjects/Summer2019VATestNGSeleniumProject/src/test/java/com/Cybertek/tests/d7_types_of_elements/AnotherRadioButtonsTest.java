package com.Cybertek.tests.d7_types_of_elements;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnotherRadioButtonsTest {
    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement basketball = driver.findElement(By.id("basketball"));
        WebElement football = driver.findElement(By.id("football"));

        //verify if both radio buttons Not selected
        Assert.assertFalse(basketball.isSelected());
        //basketball.isSelected()

        Assert.assertFalse(basketball.isSelected());
        //basketball.isSelected
        Assert.assertFalse((football.isSelected()));
    }
}