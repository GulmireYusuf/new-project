package com.Cybertek.tests.d7_types_of_elements;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributesTest {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue = driver.findElement(By.id("blue"));

        // get the value of attribute "name"
        System.out.println(blue.getAttribute("name"));

         // we get null if the element does not
        System.out.println(blue.getAttribute("herf"));

        //it gives empty string
        System.out.println(blue.getAttribute("class"));

        //it returns true false
        System.out.println(blue.getAttribute("checked"));

        // returns the text of elemnt (in certain cases)
        System.out.println(blue.getAttribute("outerHTML"));

        //returns the text of element (in certain cases)
        System.out.println(blue.getAttribute("innerHTML"));


    }
}