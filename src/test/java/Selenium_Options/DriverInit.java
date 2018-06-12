package Selenium_Options;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class DriverInit {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public WebDriver getDriver(String... browser) {
        if (driver == null) {
            setDriver(browser);
        }
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void setDriver(String... browser) {
        String brLoc = browser.length > 0 ? browser[0] : "firefox";
        switch (brLoc) {
            case "chrome":
                WebDriverManager.chromedriver().setup();//.version("2.26").setup();
                driver = new ChromeDriver();
                break;
            default:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
        }
        wait = new WebDriverWait(driver, 10);
    }
}
