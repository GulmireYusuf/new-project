package com.Cybertek.tests.d6_Testing;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {

    @Test
    public void test1() {
        System.out.println("first assertation");
        Assert.assertEquals("one", "one");

        System.out.println("second assertion");
        Assert.assertEquals("one", "two");
    }
    @Test
      public void test3(){
        String expectedTitle="Cbt";
        String actualTitleBEg="C";

        Assert.assertTrue(expectedTitle.startsWith(actualTitleBEg));
        Assert.assertTrue("ma@cbt.com".contains("@"));

        Assert.assertEquals(1,1);

      }
        public void test4(){
        Assert.assertFalse(1<0);
        }



       @Test
       public void test5() {
           Assert.assertEquals("cbt", "c", "title did not match");
       }
       @AfterMethod
       public void teardownMethod() {
           System.out.println("close chrome");

       }
       }

