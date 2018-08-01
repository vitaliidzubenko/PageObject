package PagesRia;

import BddOptions.DriverInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DetailResPageRia extends DriverInit {
    private final Logger log = LogManager.getLogger(DetailResPageRia.class);
    private final By contentDisplayed = By.xpath("//div[@class = 'app-content']");
    private final By firstResultBuldozer = By.xpath("//div[@class = 'item ticket-title']");
    private final By proposeContent = By.xpath("//a[@class = 'na-card-item']");
    private final By abroadLithuania = By.xpath("//section[@id = 'autoinerCountryDefault']//a[@title = 'Авто из Латвии ']");
    private final By vehicleType = By.xpath("//select[@name = 'vehicleClass_id']");
    private final By passengerType = By.xpath("//select[@name = 'vehicleClass_id']//option[2]");
    private final By brandOfCar = By.xpath("//select[@name = 'make_id']");
    private final By brandBMW = By.xpath("//select[@name = 'make_id']//option[3]");
    private final By modelOfCar = By.xpath("//select[@name = 'model_id']");
    private final By x5mModel = By.xpath("//select[@name = 'model_id']//option[@value = '149']");
    private final By filteredCar = By.xpath("//div[@class = 'ticket-item paid']//a[@title = 'Подробно']");

    public DetailResPageRia detailedInfoElement() {
        log.error("detailedInfoElement");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(contentDisplayed));
        return this;
    }

    public DetailResPageRia detailsBuldozer() {
        log.error("detailsBuldozer");
        getWait().until(ExpectedConditions.elementToBeClickable(firstResultBuldozer)).click();
        getWait().until(ExpectedConditions.elementToBeClickable(contentDisplayed));
        return this;
    }

    public DetailResPageRia proposeChevy() {
        log.error("proposeChevrolet");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(proposeContent));
        return this;
    }

    public DetailResPageRia clickLithuania() {
        log.error("clickLithuania");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(abroadLithuania)).click();
        return this;
    }

    public DetailResPageRia clickVehicleType() {
        log.error("clickVehicleType");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(vehicleType)).click();
        getDriver().findElement(passengerType).click();
        return this;
    }

    public DetailResPageRia clickBrandType() {
        log.error("clickBrandType");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(brandOfCar)).click();
        getDriver().findElement(brandBMW).click();
        return this;
    }

    public DetailResPageRia clickModelOfCar() throws InterruptedException {
        log.error("clickModelOfCar");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(modelOfCar)).click();
        getDriver().findElement(x5mModel).click();
        Thread.sleep(3500);
        return this;
    }

    public DetailResPageRia clickFilteredCar() {
        log.error("waiting for refreshed results");
        log.error("clickFilteredCar");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(filteredCar)).click();
        return this;
    }

    public By getContentDisplayed() {
        return contentDisplayed;
    }

    public By getProposeContent() {
        return proposeContent;
    }
}
