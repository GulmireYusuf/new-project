package com.Cybertek.tests.noveber06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFormTest {

    public static void main(String[] args) {
        // to set up webdriver,without webdriver out test will not run,we cannaot connect with a browser
        WebDriverManager.chromedriver().setup();
        // we must create webdriver object first,before any interaction
        WebDriver driver =new ChromeDriver();
        // to open website
        driver.get("http://practice.cybertekschool.com");
       //<a href="/registration_form">Registration Form</a>
        //a-its a tag name,that is used to create hyperlinks
        //href--its a an attribute that describe destination page
        //whatever is in bettween
        driver.findElement(By.linkText("Registration Form")).click();
        //enter first name
        driver.findElement(By.name("First name")).sendKeys("some test name");
        // //*[text()='Home']
        // //tag[text()=' ']

        //contanis is for partial text/value,its useful for dynamic elements,when some values are partially change

        // //tag[contains(text(),'Text')] or //*
        driver.findElement(By.xpath("//"));
        driver.findElement(By.cssSelector("")).sendKeys("last name");


        driver.quit();


    }
}
