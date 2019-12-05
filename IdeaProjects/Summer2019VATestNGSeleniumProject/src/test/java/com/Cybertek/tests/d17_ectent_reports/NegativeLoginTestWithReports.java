package com.Cybertek.tests.d17_ectent_reports;

import com.Cybertek.pages.LoginPage;
import com.Cybertek.tests.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestWithReports  extends TestBase {

    @Test
    public void wrongPasswordTest(){
        // if we dont add extentLogger = report.createTest ,this test will not be in the html report
        extentLogger = report.createTest("Wrong password test");
        LoginPage loginPage = new LoginPage();
        extentLogger.info("Enter username: salesmanager101");
        loginPage.userName.sendKeys("salesmanager101");
        extentLogger.info("Enter password: greatpassword");
        loginPage.password.sendKeys("greatpassword");
        extentLogger.info("Click submit");
        loginPage.submit.click();
        extentLogger.info("Verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
        extentLogger.pass("PASS: Wrong password test");
    }

    // this test will fail
    @Test
    public void wrongUsernameTest(){
        // if we dont add extentLogger = report.createTest ,this test will not be in the html report
        extentLogger = report.createTest("Wrong username test");
        LoginPage loginPage = new LoginPage();
        extentLogger.info("Enter username: salesmanager101");
        loginPage.userName.sendKeys("salesmanager101");
        extentLogger.info("Enter password: greatpassword");
        loginPage.password.sendKeys("greatpassword");
        extentLogger.info("Click submit");
        loginPage.submit.click();
        extentLogger.info("Verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://google.com/");
        extentLogger.pass("PASS: Wrong username test");
    }
}
