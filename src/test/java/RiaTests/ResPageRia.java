package RiaTests;

import Selenium_Options.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResPageRia extends DriverInit {

    private final By firstElementSearch = By.xpath("//*[@id = 'regionContainer']//*[@data-index= '1']");
    private final By fifthElementSearch = By.xpath("(//div[@class = 'ticket-photo loaded'])[5]");

    public void resultSearchHomePage() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(fifthElementSearch));
        getDriver().findElement(fifthElementSearch).click();
    }
    public void clickFirstElementSearch() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(firstElementSearch));
        getDriver().findElement(firstElementSearch).click();
    }
}
