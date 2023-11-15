package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccessfully extends Utils
{
    //declare a locater of success msg as a variable
    private By _SuccsessMsglo= By.cssSelector("div.result");
    // create a object of loadprop class for use a data
    LoadProap loadProap=new LoadProap();

    public void verifyUserShuoldBeRegisterSuccessfully()
    {
        Assert.assertEquals(getTextFromElemet(_SuccsessMsglo),loadProap.getProperty("ExpectedResultForRegistration"));
    }
}
