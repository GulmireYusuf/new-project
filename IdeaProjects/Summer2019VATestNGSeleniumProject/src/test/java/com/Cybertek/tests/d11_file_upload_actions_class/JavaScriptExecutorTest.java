package com.Cybertek.tests.d11_file_upload_actions_class;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void click() {
        driver.get("http://practice.cybertekschool.com/");
        WebElement element = driver.findElement(By.linkText("Home"));
        // this how the JavascriptExecutor object is created
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // executeScript--> method used to pass
        // frist string argument is the javascript code
        //second argument is the webelement on which the action will be take
        jse.executeScript("", element);
    }

    @Test
    public void type() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement element = driver.findElement(By.cssSelector("button[onclick='swapInput()']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String str = "hello";

        element.sendKeys(str);
        Thread.sleep(2000);
        jse.executeScript("", element);
    }
        @Test
    public void scroll() {
            driver.get("");

            JavascriptExecutor jse = (JavascriptExecutor) driver;

            for (int i = 0; i < 5; i++) {

            }

        }

}