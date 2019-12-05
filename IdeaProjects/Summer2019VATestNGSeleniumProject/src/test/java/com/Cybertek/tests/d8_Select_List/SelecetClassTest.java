package com.Cybertek.tests.d8_Select_List;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelecetClassTest {
    @Test
    public void printAllOptions() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
     //locate the element with the select tag
        WebElement element=driver.findElement(By.id(""));

        //
        Select statelist =new  Select(element);
       // returns all the available options from the dropdown list
        List<WebElement> options = statelist.getOptions();

       String actualSelection=statelist.getFirstSelectedOption().getText();
        System.out.println("actualSelections=" +actualSelection);
        Assert.assertEquals(actualSelection,"Select a state");

        Thread.sleep(1000);
        //select using visible text
        //selectByVisibleText()-->


        }

    }

