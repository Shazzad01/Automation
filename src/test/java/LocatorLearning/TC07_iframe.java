package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC07_iframe extends DriverSetup {

    @Test
    public void testIframeElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0,1400).build().perform();
        driver.switchTo().frame("courses-iframe");
        System.out.println(driver.findElement(By.linkText("Courses")).getText());
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']")).getText());
    }
}
