package com.Cybertek.tests.d4_basic_locators;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement home=driver.findElement((By.className("nav-link")));
        home.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement title=driver.findElement(By.className("h3"));

        System.out.println(title.getText());

        // next line will fail,it is suppose to fail
        // if class has a space in it,we cannot use it
        Thread.sleep(3000);
        WebElement button1=driver.findElement(By.className("btn btn-primary"));





    }

}

