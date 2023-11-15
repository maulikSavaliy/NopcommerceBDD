package org.example;

import org.openqa.selenium.By;

public class ClickOnRegisterButton extends Utils
{
    //declare a locater as variable in globle
    private By _registrationButtonlo=By.cssSelector("button#register-button");
    public void userShoulBeClickOnRegidterButton()
    {
      clickOnElement(_registrationButtonlo);
    }
}
