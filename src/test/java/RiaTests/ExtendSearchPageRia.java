package RiaTests;

import Selenium_Options.DriverInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ExtendSearchPageRia extends DriverInit {
    private final Logger log = LogManager.getLogger(ExtendSearchPageRia.class);
    private final By bodyTypeExtendedSearch = By.xpath("//div[@class = 'bg-transport__type']//*[@class= 'item-checkbox'][1]");
    private final By enterBrandExtendedSearch = By.xpath("//*[@id = 'brandContainer']//li[@title= 'Skoda']");
    private final By yearFromExtendedSearch = By.xpath("//*[@id = 'yearContainer']//input[@placeholder = 'Год от']");
    private final By yearToExtendedSearch = By.xpath("//*[@id = 'yearContainer']//input[@placeholder = 'до']");
    private final By regionExtendedSearch = By.xpath("//*[@id = 'regionContainer']//*[@data-index= '1']");
    private final By fuelTypeExtendedSearch = By.xpath("//*[@id = 'engineBlock']//*[text()= 'Бензин']");
    private final By showResultsExtendedSearch = By.xpath("//div[@class = 'wrap']//*[text() = 'Показать']");
    private final By chevroletIcon = By.xpath("//a[@title = 'Chevrolet']");
    private final By suburbanModel = By.xpath("//section[@class = 'box-panel m-margin']//a[text() = 'Suburban ']");
    private final By firstImageSuburban = By.xpath("//*[@class = 'photo-294x190']");
    private final By offersForElement = By.xpath("//*[@id = 'offers_count']//a");
    private final By allPageContent = By.xpath("//div[@class = 'app-content page-search']");
    private final By buldozerBrandSearch = By.xpath("//*[@id = 'brandTooltipBrandAutocompleteInput-1']");
    private final By priceFrom = By.xpath("//*[@id = 'priceFrom']");
    private final By priceTo = By.xpath("//*[@id = 'priceTo']");
    private final By searchButtonSearch = By.xpath("//*[@class= 'button-primary']");

    public ExtendSearchPageRia fillBodyType() {
        log.error("fillBodyType");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(bodyTypeExtendedSearch));
        getDriver().findElement(bodyTypeExtendedSearch).click();
        return this;
    }

    public ExtendSearchPageRia fillBrand() {
        log.error("fillBrand");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(enterBrandExtendedSearch));
        getDriver().findElement(enterBrandExtendedSearch).click();
        return this;
    }

    public ExtendSearchPageRia fillYear(String yearF, String yearT) {
        log.error("fillYear");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(yearFromExtendedSearch));
        getDriver().findElement(yearFromExtendedSearch).sendKeys(yearF);

        getWait().until(ExpectedConditions.visibilityOfElementLocated(yearToExtendedSearch));
        getDriver().findElement(yearToExtendedSearch).clear();
        getDriver().findElement(yearToExtendedSearch).sendKeys(yearT);
        return this;
    }

    public ExtendSearchPageRia fillregion() {
        log.error("fillregion");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(regionExtendedSearch));
        getDriver().findElement(regionExtendedSearch).click();
        return this;
    }

    public ExtendSearchPageRia fillFuelType() {
        log.error("fillFuelType");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(fuelTypeExtendedSearch));
        getDriver().findElement(fuelTypeExtendedSearch).click();
        return this;
    }

    public ExtendSearchPageRia clickShowResultsButton() {
        log.error("clickShowResultsButton");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(showResultsExtendedSearch));
        getDriver().findElement(showResultsExtendedSearch).click();
        return this;
    }

    public ExtendSearchPageRia clickChevrolet() {
        log.error("clickChevrolet");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(chevroletIcon));
        getDriver().findElement(chevroletIcon).click();
        return this;
    }

    public ExtendSearchPageRia clickSuburban() {
        log.error("clickSuburban");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(suburbanModel));
        getDriver().findElement(suburbanModel).click();
        return this;
    }

    public ExtendSearchPageRia firstGenModel() {
        log.error("firstGenModel");
        getWait().until(ExpectedConditions.elementToBeClickable(firstImageSuburban));
        getDriver().findElement(firstImageSuburban).click();
        return this;
    }

    public ExtendSearchPageRia offersForModel() {
        log.error("offersForModel");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(offersForElement));
        getDriver().findElement(offersForElement).click();
        return this;
    }

    public ExtendSearchPageRia modelInfo() {
        log.error("modelInfo");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(allPageContent));
        return this;
    }

    public ExtendSearchPageRia fillBuldozerBrand(String brandBuldozer) {
        log.error("fillBuldozerBrand");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(buldozerBrandSearch));
        Select dropBrandBuldozer = new Select(getDriver().findElement(buldozerBrandSearch));
        dropBrandBuldozer.selectByVisibleText(brandBuldozer);
        return this;
    }

    public ExtendSearchPageRia priceBuldozer(String priceF, String priceT) {
        log.error("priceBuldozer");
        getDriver().findElement(priceFrom).sendKeys(String.valueOf(priceF));
        getDriver().findElement(priceTo).sendKeys(String.valueOf(priceT));
        getDriver().findElement(searchButtonSearch).click();
        return this;
    }
}
