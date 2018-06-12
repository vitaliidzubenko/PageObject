package PO_Selenide;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        //TODO init driver here // then -> https://github.com/bonigarcia/webdrivermanager
        driver = new ChromeDriver();//TODO singleton here
        return driver;
    }
}
