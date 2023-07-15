package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import javax.swing.*;

public class TC_06_Diff_Action extends DriverSetup {

    @Test
    public void testDifferentAction() throws InterruptedException {
        driver.get("https://www.daraz.com.bd/");
        Actions actions = new Actions(driver);
        WebElement electronic = driver.findElement(By.xpath("//span[normalize-space()='Electronic Accessories']"));
        actions.clickAndHold(electronic).build().perform();
        WebElement camera = driver.findElement(By.xpath("//span[normalize-space()='Camera Accessories']"));
        actions.clickAndHold(camera).build().perform();
        driver.findElement(By.xpath("//span[normalize-space()='Batteries']")).click();
        Thread.sleep(5000);
    }
    @Test
    public void scrollTo() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions actions = new Actions(driver);
        //actions.scrollByAmount(0,1000).build().perform();
        actions.scrollToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        Thread.sleep(5000);
    }
}
