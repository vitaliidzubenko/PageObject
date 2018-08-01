package BddOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class DriverInit {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static String MainUrl = "https://auto.ria.com/";

    public static String getMainUrl() {
        return MainUrl;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            setDriver();
        }
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void setDriver(String... browser) {
        String brLoc = browser.length > 0 ? browser[0] : "chrome";
        switch (brLoc) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
        }
        wait = new WebDriverWait(driver, 10);
    }



}
