package com.Cybertek.tests.d4_basic_locators;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkTextTest {


    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // Link text
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        WebElement link = driver.findElement(By.linkText("Example 6: Loading overlay that disappears and disappears again"));
        System.out.println(link.getText());

        WebElement cbt = driver.findElement(By.linkText("Cybertek School"));
        System.out.println(cbt.getText());

        // partial link text
        WebElement link6Again = driver.findElement(By.partialLinkText("Example "));
        System.out.println(link6Again.getText());

    }

    }

