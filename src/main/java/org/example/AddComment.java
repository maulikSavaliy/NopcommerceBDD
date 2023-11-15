package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class AddComment extends Utils
{
    //create loadprop class object for  use of data from properties file
    LoadProap loadProap =new LoadProap();
    public void userShouldBeEnterTheirsComment()
    {
        //enter comment title  useof lodprop class to enter detail
        EntervalueInElement(By.cssSelector("input#AddNewComment_CommentTitle"),loadProap.getProperty("Commenttitle"));

        //enter a comment
        EntervalueInElement(By.cssSelector("textarea#AddNewComment_CommentText"),loadProap.getProperty("Commentdetail")+timeStamp());

        //click on comment button
        clickOnElement(By.xpath("//button[text()='New comment']"));

        //create list of web element
    }

    public void compaircomment()
    {
        // create a list of web element for coment title
        List <WebElement> Commenttitle = driver.findElements(By.xpath("//div[@class=\"comment news-comment\"]/div[2]/div[2]"));

        // print out size
        //System.out.println(Commenttitle.size());

        //declare variable of web element size
        int commentTitle=Commenttitle.size();

        // compair a comment to a last commn=ent in list of webelement
        Assert.assertEquals(Commenttitle.get(commentTitle-1).getText(),loadProap.getProperty("Commenttitle"));

    }
}
