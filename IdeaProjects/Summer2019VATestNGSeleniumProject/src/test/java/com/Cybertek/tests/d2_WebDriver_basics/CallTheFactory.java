package com.Cybertek.tests.d2_WebDriver_basics;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallTheFactory {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
    }
}
