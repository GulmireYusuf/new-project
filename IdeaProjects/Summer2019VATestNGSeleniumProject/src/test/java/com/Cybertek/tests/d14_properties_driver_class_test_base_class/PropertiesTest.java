package com.Cybertek.tests.d14_properties_driver_class_test_base_class;

import com.Cybertek.tests.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class PropertiesTest {

    @Test
    public void test1() {
        String browser = ConfigurationReader.get("browser");
        System.out.println(browser);
       // Assert.assertEquals(browser,"firefox");

        System.out.println(ConfigurationReader.get("url"));
        // when we provide a key that does not exist, it returns null
        System.out.println(ConfigurationReader.get("mybrowser"));
    }
}
