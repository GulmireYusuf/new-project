package com.Cybertek.tests.d12_review;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase6FromTheHomework {

    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        actions = new Actions(driver);
        driver.get("https://google.com");
    }
    @Test
    public void test() {
        // go to google 1st time
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("wooden spoon"+ Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.id("resultStats")).isDisplayed());
        driver.navigate().back();
        // go to google 2nd time
        input = driver.findElement(By.name("q"));
        input.sendKeys("books"+ Keys.ENTER);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
