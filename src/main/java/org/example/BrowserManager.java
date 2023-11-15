package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserManager extends Utils
     {
        public void openBrowser()
        {
            System.setProperty("WebDriver.Chrome.driver","src/test/Resources/driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
        }

        public void closeBrowser()
        {
            driver.close();
        }




     }



