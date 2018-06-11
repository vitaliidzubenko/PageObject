package NewPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends DriverInit {

    @FindBy(xpath = "//*[@class = 'section-first']//a[@title = 'Open account']")
    private WebElement openButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(openButton));
        openButton.click();
    }
}
