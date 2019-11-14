package com.Cybertek.tests.d6_Testing;

import org.testng.annotations.*;

public class BeforeAfterTests {

    @Test
    public void test2(){
        System.out.println("This is test two");
    }
    @Test
    public void setupMethod(){

    }
    @BeforeMethod
    public void SetUpMethod(){
        System.out.println("BEFORE METHOD");
        System.out.println("OPENING CHROME");
    }
    @AfterMethod
    public void TeardownMethod(){
        System.out.println("AFTER METHOD");
        System.out.println("CLOSING CHROME");
    }
    @BeforeClass
    public void setupClass(){
        System.out.println("BEFORE CLASS:RUNNING ONLY ONE TIME");
    }
    @AfterClass
    public void teardownClass(){
        System.out.println("AFTER CLASS:RUNNING ONLY ONE TIME");
    }

}
