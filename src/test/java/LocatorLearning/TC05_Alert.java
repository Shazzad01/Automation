package LocatorLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC05_Alert extends DriverSetup {
    @Test
    public void handleDifferentTypeAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You successfully clicked an alert");
        Thread.sleep(5000);
    }
    @Test
    public void alert02(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You clicked: Ok");

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();
        String result1 = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result1, "You clicked: Cancel");
    }
    @Test
    public  void alert03(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("i accept");
        alert.accept();
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You entered: i accept");


    }
    @Test
    public  void alert03_0(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("i accept");
        alert.dismiss();
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You entered: null");


    }
}
