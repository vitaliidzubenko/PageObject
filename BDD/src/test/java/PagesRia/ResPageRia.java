package PagesRia;

import BddOptions.DriverInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResPageRia extends DriverInit {
    private final Logger log = LogManager.getLogger(ResPageRia.class);
    private final By firstElementSearch = By.xpath("//div[@class = 'content-bar']//a[@class = 'address']");
    private final By fifthElementSearch = By.xpath("(//div[@class = 'ticket-photo loaded'])[5]");

    public ResPageRia resultSearchHomePage() {
        log.error("resultSearchHomePage");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(fifthElementSearch)).click();
        return this;
    }

    public ResPageRia clickFirstElementSearch() {
        log.error("clickFirstElementSearch");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(firstElementSearch)).click();
        return this;
    }
}
