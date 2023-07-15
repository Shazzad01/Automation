package LocatorLearning;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC02BassicLocator extends DriverSetup {
    @Test
    public void testOption1() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption1")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("checkBoxOption2")).click();
        Thread.sleep(5000);
        String title = driver.findElement(By.tagName("h1")).getText();
        System.out.println(title);
    }

}
