package com.Cybertek.tests.d14_properties_driver_class_test_base_class;

import com.Cybertek.tests.utilities.ConfigurationReader;
import com.Cybertek.tests.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void login(){
        String url = ConfigurationReader.get("url");
        driver.get(url);
        driver.findElement(By.id("prependedInput")).sendKeys("user1");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);
    }

}
