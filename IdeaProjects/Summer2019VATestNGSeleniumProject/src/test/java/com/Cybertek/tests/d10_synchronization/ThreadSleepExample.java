package com.Cybertek.tests.d10_synchronization;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreadSleepExample {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void teardownMethod() throws InterruptedException{
      Thread.sleep(3000);
      driver.quit();
}


@Test

    public void test1() throws InterruptedException{
      driver.get("http://practice.cybertekschool.com/dynamic_loading/3");
      Thread.sleep(3000);
      driver.findElement(By.id("username")).sendKeys("goodusername");
    }
  }
