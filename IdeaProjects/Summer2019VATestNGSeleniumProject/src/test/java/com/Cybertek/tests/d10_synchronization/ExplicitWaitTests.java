package com.Cybertek.tests.d10_synchronization;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitTests {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1WaitForVisible() {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        //click on start
        driver.findElement(By.tagName("button"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // enter username
        driver.findElement(By.id("username")).sendKeys("Bibish");

        WebElement username = driver.findElement(By.id("username"));
        // create explict wait object

        WebDriverWait wait = new WebDriverWait(driver, 10);
        // actually waits
        // waiting for the specific element to be visible
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys("Luis");
    }
        @Test
                public void test2TobeEnabled(){
            driver.get("http://practice.cybertekschool.com/dynamic_controls");
            // click enable
            driver.findElement(By.cssSelector("button[onclick=‘swapInput()’]")).click();
            // find the input field
            WebElement input=driver.findElement(By.cssSelector("input[type=‘text’]"));

            WebDriverWait wait=new WebDriverWait(driver,10);

            // wait for element to be clickable/enabled
            wait.until(ExpectedConditions.elementToBeClickable(input));
            input.sendKeys("Mira Mila");
    }
}