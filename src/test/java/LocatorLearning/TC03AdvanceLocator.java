package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC03AdvanceLocator extends DriverSetup {
    @Test
    public void testLocator() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // String title = driver.findElement(By.cssSelector("h1")).getText();
        String title = driver.findElement(By.xpath("//h1")).getText();
        System.out.println(title);
    }

    @Test
    public void testClick() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement radiobtn = driver.findElement(By.xpath("//*[@value='radio1']"));
        radiobtn.click();
        Thread.sleep(5000);
    }

    @Test
    public void testWrite() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement inputTextField = driver.findElement(By.id("autocomplete"));
        inputTextField.sendKeys("Test Automation");
        Thread.sleep(5000);
        inputTextField.clear();
        Thread.sleep(5000);
    }

    @Test
    public void getAttributevalue() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement radiobtn = driver.findElement(By.xpath("//*[@value='radio1']"));
        String classValue =radiobtn.getAttribute("class");
        System.out.println(classValue);
        Thread.sleep(2000);
    }
    @Test
    public void getElementText() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement radiobtn = driver.findElement(By.xpath("//label[normalize-space()='Radio2']"));
        String radiobtntext =radiobtn.getText();
        System.out.println(radiobtntext);

    }

    @Test
    public void testDisplay() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement displayTest = driver.findElement(By.id("displayed-text"));
        System.out.println(displayTest.isDisplayed());
        driver.findElement(By.id("hide-textbox")).click();
        System.out.println(displayTest.isDisplayed());

    }
}
