package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;

@Test
public class MyFirstTestClass extends DriverSetup {
    public void testpagetitle() {

        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");

        //driver.getTitle();
    }
}
