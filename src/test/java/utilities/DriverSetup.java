package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    public WebDriver driver;
    @BeforeSuite
    public void setdriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void closedriver() {

        driver.quit();

    }
}
