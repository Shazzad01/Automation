package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.DriverSetup;

@Test
public class TC08_select extends DriverSetup {

    public void selectElement() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(dropdown);
        select.selectByIndex(3);
        softAssert.assertEquals(select.getFirstSelectedOption().getText(),"Option3");
        Thread.sleep(5000);
        select.selectByValue("option1");
        softAssert.assertEquals(select.getFirstSelectedOption().getText(),"Option1");
        Thread.sleep(5000);
        select.selectByVisibleText("Option2");
        Thread.sleep(5000);
        softAssert.assertEquals(select.getFirstSelectedOption().getText(),"Option2");
        softAssert.assertAll();

    }
    @Test
    public void testMultiSelect() throws InterruptedException {
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        Actions actions = new Actions(driver);
        driver.switchTo().frame("iframeResult");
        Select select = new Select(driver.findElement(By.id("cars")));
        select.selectByVisibleText("Volvo");
        actions.keyDown(Keys.CONTROL).click(select.getOptions().get(2)).click(select.getOptions().get(1)).click(select.getOptions().get(3)).keyUp(Keys.CONTROL).build().perform();
        driver.findElement(By.cssSelector("input[value='Submit']")).click();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
    }
}
