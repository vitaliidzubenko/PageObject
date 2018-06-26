package RiaTests;

import Selenium_Options.DriverInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DetailResPageRia extends DriverInit {
    private final Logger log = LogManager.getLogger(DetailResPageRia.class);
    private final By contentDisplayed = By.xpath("//*[@id= 'brandTooltipBrandAutocompleteInput-model']");
    private final By firstResultBuldozer = By.xpath("//*[@class = 'item ticket-title']");
    private final By contentPageBuldozer = By.xpath("//*[@class = 'app-content']");

    public DetailResPageRia detailedInfoElement() {
        log.error("detailedInfoElement");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(contentDisplayed));
        return this;
    }

    public DetailResPageRia detailsBuldozer() {
        log.error("detailsBuldozer");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(firstResultBuldozer));
        getDriver().findElement(firstResultBuldozer).click();
        getWait().until(ExpectedConditions.visibilityOfElementLocated(contentPageBuldozer));
        return this;
    }
}
