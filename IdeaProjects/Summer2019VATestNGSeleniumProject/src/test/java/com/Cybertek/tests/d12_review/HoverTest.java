package com.Cybertek.tests.d12_review;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HoverTest {
    // creating new variable
    // open browser
    WebDriver driver;

    Actions actions;

    @BeforeMethod

    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        actions = new Actions(driver);

        driver.get("http://practice.cybertekschool.com/hovers");

    }
    @Test
    public void test() {
        // find all images outside the loop
        List<WebElement> images = driver.findElements(By.tagName("img"));
        for (int i = 0; i < 3; i++) {

            // hover over the each image
            // verify text user1, user2, user3
            System.out.println(i);

            WebElement image = images.get(i);
            actions.moveToElement(image).perform();
            // this is like calling thread.sleep
            actions.pause(2000);
            String xpath = "//h5[.='name: user"+(i+1)+"']";
            System.out.println(xpath);
            //    "//h5[.='name: user1']"

//            "//h5[.='name: user2']"

//            "//h5[.='name: user3']"

            WebElement text = driver.findElement(By.xpath(xpath));
            System.out.println("Verify element: " + i);
            Assert.assertTrue(text.isDisplayed());

        }



    }





    @AfterMethod

    public void tearDown() {
        driver.quit();

    }
}
