package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class MyFirstTestClass {
   public void testpagetitle(){
       WebDriver driver=new ChromeDriver();
       driver.manage().window().fullscreen();
       driver.get("https://www.google.com/");
       Assert.assertEquals(driver.getTitle(),"Google");
       driver.close();
       //driver.getTitle();
   }
}
