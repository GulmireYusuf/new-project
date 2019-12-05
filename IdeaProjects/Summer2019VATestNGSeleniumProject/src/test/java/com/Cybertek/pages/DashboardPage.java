package com.Cybertek.pages;

import com.Cybertek.tests.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {
    // no need to explicitly write costructor,because it will use its parents constructor
    public DashboardPage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
