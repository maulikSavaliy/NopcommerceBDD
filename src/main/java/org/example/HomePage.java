package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    public void clickOnRegisterButton()
    {
        clickOnElement(By.className("ico-register"));
    }
//click on new realease detail button
    public void clickOnNopcommerceNewRelease()
    {
          clickOnElement(By.xpath("//div[@class=\"buttons\"]//a[@href=\"/nopcommerce-new-release\"]"));
    }

}
