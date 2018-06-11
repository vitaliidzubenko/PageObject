package NewPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverInit {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public DriverInit(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
