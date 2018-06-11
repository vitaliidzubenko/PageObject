package NewPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FinishPage extends DriverInit {

    @FindBy(xpath = "//div[@class = 'wrap-content-pandats']")
    private WebElement cashier;

    public FinishPage(WebDriver driver) {
        super(driver);
    }

    public void waitForFinshReg() {
        wait.until(ExpectedConditions.visibilityOf(cashier));

    }
}
