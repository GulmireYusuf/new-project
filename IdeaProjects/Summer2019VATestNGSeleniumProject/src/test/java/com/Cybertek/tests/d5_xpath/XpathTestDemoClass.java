package com.Cybertek.tests.d5_xpath;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTestDemoClass {
    int a;
    String b;

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement link=driver.findElement(By.xpath("//button[@onclick='button1()']"));

        System.out.println(link.getText());
        XpathTestDemoClass xpathTestDemoClass= new XpathTestDemoClass(56,"gulmire");
        System.out.println(xpathTestDemoClass.a);


    }
//    public XpathTestDemoClass(){
//
//    }
    public XpathTestDemoClass(int b, String s){
        this.a=b;
        this.b=s;

    }





    public int mutellip(){
        return 0;
    }
}
