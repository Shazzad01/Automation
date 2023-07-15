package LocatorLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import java.time.Duration;

@Test
public class TC10_wait extends DriverSetup {
    public void testWaitAlert() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://qavbox.github.io/demo/alerts/");
        driver.get("https://qavbox.github.io/demo/delay/");
        driver.findElement(By.name("commit1")).click();
        //Thread.sleep(5000);
        //Alert alert = driver.switchTo().alert();
        //Assert.assertEquals(alert.getText(), "I appeared after 5 seconds!");
        Assert.assertEquals(driver.findElement(By.id("delay")).getText(), "I appeared after 5 sec");
    }
    public void testWaitAlert01() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://qavbox.github.io/demo/alerts/");
        //driver.get("https://qavbox.github.io/demo/delay/");
        driver.findElement(By.id("delayalert")).click();
        //Thread.sleep(5000);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(alert.getText(), "I appeared after 5 seconds!");
        //Assert.assertEquals(driver.findElement(By.id("delay")).getText(), "I appeared after 5 sec");
    }
}
