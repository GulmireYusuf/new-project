package com.Cybertek.tests.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;

    protected  String url;
    Actions actions;

    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest extentLogger;

    @BeforeTest
    public  void setUpTest(){
        report=new ExtentReports();
        String path = System.getProperty("user.dir") + "/test-output/report.html";
        htmlReporter = new ExtentHtmlReporter(path);
        htmlReporter.config().setReportName("Vytrack smoke tests");
        report.attachReporter(htmlReporter);

        htmlReporter.config().setReportName("Vytrack smoke tests");

        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("browser", "chrome");
        report.setSystemInfo("OS", System.getProperty("os.name"));
    }


    @BeforeMethod
    public void setupMethod() {
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        url =  ConfigurationReader.get("url");
        driver.get(url);
        actions = new Actions(driver);
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        Driver.closeDriver();
    }

}
