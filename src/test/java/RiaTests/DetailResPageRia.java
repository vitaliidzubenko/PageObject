package RiaTests;

import Selenium_Options.DriverInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DetailResPageRia extends DriverInit {
    private final Logger log = LogManager.getLogger(DetailResPageRia.class);
    private final By contentDisplayed = By.xpath("//div[@class = 'app-content']");
    private final By firstResultBuldozer = By.xpath("//*[@class = 'item ticket-title']");
    private final By contentPageBuldozer = By.xpath("//*[@class = 'app-content']");
    private final By proposeContent = By.xpath("//*[@class = 'na-card-item']");

    public DetailResPageRia detailedInfoElement() {
        log.error("detailedInfoElement");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(contentDisplayed));
        Assert.assertTrue(getDriver().findElement(contentDisplayed).isDisplayed());
        return this;
    }

    public DetailResPageRia detailsBuldozer() {
        log.error("detailsBuldozer");
        getWait().until(ExpectedConditions.elementToBeClickable(firstResultBuldozer));
        getDriver().findElement(firstResultBuldozer).click();
        getWait().until(ExpectedConditions.elementToBeClickable(contentPageBuldozer));
        Assert.assertTrue(getDriver().findElement(contentPageBuldozer).isDisplayed());
        return this;
    }

    public DetailResPageRia proposeChevy() {
        log.error("proposeChevrolet");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(proposeContent));
        Assert.assertTrue(getDriver().findElement(proposeContent).isDisplayed());
        return this;
    }
}
