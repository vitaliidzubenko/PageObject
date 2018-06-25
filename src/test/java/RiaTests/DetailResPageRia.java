package RiaTests;

import Selenium_Options.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DetailResPageRia extends DriverInit {

    private final By contentDisplayed = By.xpath("//*[@id= 'brandTooltipBrandAutocompleteInput-model']");
    private final By firstResultBuldozer = By.xpath("//*[@class = 'item ticket-title']");
    private final By contentPageBuldozer = By.xpath("//*[@class = 'app-content']");

    public void detailedInfoElement() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(contentDisplayed));
    }

    public void detailsBuldozer() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(firstResultBuldozer));
        getDriver().findElement(firstResultBuldozer).click();
        getWait().until(ExpectedConditions.visibilityOfElementLocated(contentPageBuldozer));
    }
}
