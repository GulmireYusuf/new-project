package com.Cybertek.tests.d16_pom_2;

import com.Cybertek.pages.DashboardPage;
import com.Cybertek.pages.LoginPage;
import com.Cybertek.tests.utilities.ConfigurationReader;
import com.Cybertek.tests.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitlesTest extends TestBase {

    @Test
    public void verifySubTitleTest(){
        LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.get("");
        String password= ConfigurationReader.get("");
        loginPage.login(username,password);

        DashboardPage dashboardPage=new DashboardPage();
        String actual=dashboardPage.getPageSubTitle();

        Assert.assertEquals(actual,"Quick_");
    }
}
