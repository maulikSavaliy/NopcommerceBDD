package org.example;

import org.openqa.selenium.By;

public class RegistrationDetail extends Utils
{
    // create a object of loadproap class to access a detail of testdataconfig file
    LoadProap loadProap=new LoadProap();
    // put all locater on top becouse if any change in locater dont touch code
    private  By _firstNameLo=By.cssSelector("input#FirstName");

    //locater for lastname box
    private By _lastnameLo=By.cssSelector("input#LastName");
    //locater of email box
    private By _emailboclo=By.cssSelector("input#Email");
    // locater for compsny name box
    private By _companynamelo=By.cssSelector("input#Company");
    // locater for password box
    private By _passwordlo=By.cssSelector("input#Password");
    //locater for confrim password
    private By _confrimPasswordlo=By.cssSelector("input#ConfirmPassword");
    public void userEnterDetailOfRegistration()
    {
        // enter valur of first name through reusable mrthod and get value from TestDataConfig file
        EntervalueInElement(_firstNameLo, loadProap.getProperty("Firstname"));
        // enter valur of last name  through reusable mrthod and get value from TestDataConfig file
        EntervalueInElement(_lastnameLo, loadProap.getProperty("Lastname"));
        // enter valur of Email through reusable mrthod and get value from TestDataConfig file
        EntervalueInElement(_emailboclo, loadProap.getProperty("Email")+timeStamp()+"@gmail.com");
        // enter valur of company name through reusable mrthod and get value from TestDataConfig file
        EntervalueInElement(_companynamelo, loadProap.getProperty("Company"));
        // enter valur of Password through reusable mrthod and get value from TestDataConfig file
        EntervalueInElement(_passwordlo, loadProap.getProperty("Password"));
        // enter valur of confrim password through reusable mrthod and get value from TestDataConfig file
        EntervalueInElement(_confrimPasswordlo, loadProap.getProperty("Password"));



    }
}
