package org.example;

import org.openqa.selenium.By;

import java.text.SimpleDateFormat;

public class Utils extends BasePage
 {
     //create a reusable method
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    //create a reusable methode for enter value

    public void EntervalueInElement(By by,String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromElemet(By by)
    {
        return driver.findElement(by).getText();
    }

    public String timeStamp()
    {
       String timeStamp=new SimpleDateFormat("yymmddhhmmss").format(new java.util.Date());
       return timeStamp;
    }
    public String rgbtohex(int r,int g,int b)
    {
        String hex = String.format("#%02x%02x%02x", r, g, b);
        return hex;
    }
 }
