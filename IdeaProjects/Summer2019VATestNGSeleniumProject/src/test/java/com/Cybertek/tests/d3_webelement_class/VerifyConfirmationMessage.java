package com.Cybertek.tests.d3_webelement_class;

import com.Cybertek.tests.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {


    /**
     *open browser
     * go to http://practice.cybertekschool.com/forgot_password
     * enter any email
     * verify that email is displayed in the input box
     * click on Retrieve password
     * verify that confirmation message says 'Your e-mail's been sent!'
     */
    public static void main(String[] args) {
        // open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // go to the http:// practice.cybertekschool.com/forget_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //enter any email
        WebElement emailInput=driver.findElement((By.name("email")));

        // sendKeys--> enters given text
        String expectedEmail="gulmi199056@gmail.com";
        emailInput.sendKeys(expectedEmail);

        // verify that email is displayed in the input box
        //.getAttribute("value"--->get text from the input box
        String actualEmail=emailInput.getText();
        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        // click on retrieve password
        WebElement retrievePassword= driver.findElement(By.id("form_submit"));
        retrievePassword.click();

        // verify that confirmation messege says 'You e-mail's been sent!

        String expectedMessage="You e-mail's been sent!";
        WebElement messageElement=driver.findElement(By.name("confirmation_message"));
        String actualMessage=messageElement.getText();

        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectemessege="+actualMessage);
            System.out.println("actuaMessege="+expectedMessage);

             driver.quit();
        }



    }

}
