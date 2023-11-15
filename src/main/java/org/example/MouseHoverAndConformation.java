package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MouseHoverAndConformation extends Utils
{
    LoadProap loadProap=new LoadProap();
    //private By _computer= By.xpath("//ul[@class=\"top-menu notmobile\"]//a[text()='Computers ']");



    public void usershouldBeConfrimAfterMouseHoverOnComputerItsColour()
    {
        // create webelement locater
        WebElement computer=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[text()='Computers ']"));
        //create a Actions object for perform action
        Actions build=new Actions(driver);
        //create action moucehover action
        Action moucehover=build.moveToElement(computer).build();
        //to grt css property for computre manu
        String computrorcolour=(computer).getCssValue("color");
        //sout computre property
        System.out.println(computrorcolour);
        //perform action command
        moucehover.perform();
        //Assert to compair expected and actual result
        Assert.assertEquals(rgbtohex(85,85,85),loadProap.getProperty("color"));

    }
}
