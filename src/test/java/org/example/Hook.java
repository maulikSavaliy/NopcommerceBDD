package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends BrowserManager
   {
       @Before
     public void setup()
     {
         openBrowser();
     }
     @After
       public void endup(Scenario scenario)
     {
         if(scenario.isFailed()){
             TakesScreenshot ts = (TakesScreenshot) driver;
             byte[] src = ts.getScreenshotAs(OutputType.BYTES);
             scenario.attach(src, "image/png", "screenshot");
         }
         closeBrowser();

     }

   }
