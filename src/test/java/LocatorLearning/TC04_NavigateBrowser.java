package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import java.util.ArrayList;
import java.util.List;

@Test
public class TC04_NavigateBrowser extends DriverSetup {
    public void navigateApage() throws InterruptedException {
        driver.get("https://www.booking.com/");
        Thread.sleep(5000);
        driver.navigate().to("https://www.yahoo.com/");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
    }

    public void handelBrowserWindow() throws InterruptedException {
        driver.navigate().to("https://www.booking.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.yahoo.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.getTitle());
        Thread.sleep(5000);

    }

    public void browserWindow() throws InterruptedException {
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("openwindow")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.findElement(By.id("opentab")).click();
        System.out.println(driver.getTitle());
        //System.out.println(driver.getWindowHandle());
        List<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(windowHandles.get(0));
        System.out.println(windowHandles.get(1));
        System.out.println(windowHandles.get(2));
        System.out.println("........................");

        driver.switchTo().window(windowHandles.get(2));
        System.out.println("window number 3 " +driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(windowHandles.get(0));
        System.out.println("window number 1 " +driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(windowHandles.get(1));
        System.out.println("window number 2 " +driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
}
