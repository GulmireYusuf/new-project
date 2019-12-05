package com.Cybertek.tests.d9_tabs_frames_alerts_popups;

import com.Cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupAndAlerts {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void htmlPopup() {
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        // bring pop up
        driver.findElement(By.xpath("//span[.='Destroy the World']")).click();
        // click no on the pop up
        driver.findElement(By.xpath("//span[.='No']")).click();
    }


    @Test
    public void jsALerts() {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        // trigger the alert
        driver.findElement(By.xpath("//button[1]")).click();
        // control the alert using alert class
        Alert alert = driver.switchTo().alert();
        // accept alert --> clicking ok in alerts
        alert.accept();

        // trigger the second alert
        driver.findElement(By.xpath("//button[2]")).click();
        // switch to the new alert
        alert = driver.switchTo().alert();
        // dismiss --> clicking x to close, selecting no/cancer
        alert.dismiss();

        // trigger the 3rd alert
        driver.findElement(By.xpath("//button[3]")).click();
        // switch to the new alert
        alert = driver.switchTo().alert();
        // send keys to alert
        alert.sendKeys("red alert");
        // print text of the alert
        System.out.println(alert.getText());
        // close the alert
        alert.accept();


    }
    }

