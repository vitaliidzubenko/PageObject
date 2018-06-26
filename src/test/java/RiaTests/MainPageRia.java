package RiaTests;

import Selenium_Options.DriverInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class MainPageRia extends DriverInit {
    private final Logger log = LogManager.getLogger(MainPageRia.class);
    private final By enterCabinet = By.xpath("//span[@class = 'tl']");
    private final By brandSearchBlock = By.xpath("//*[@id= 'brandTooltipBrandAutocomplete-brand']");
    private final By modelSearchBlock = By.xpath("//*[@id= 'brandTooltipBrandAutocompleteInput-model']");
    private final By regionSearchBlock = By.xpath("///*[@id = 'regionAutocompleteAutocompleteInput-1']");
    private final By yearFromSearchBlock = By.xpath("//*[@id = 'yearFrom']");
    private final By yearToSearchBlock = By.xpath("//*[@id = 'yearTo']");
    private final By submitButtonSearchBlock = By.xpath("//*[@class= 'button']");
    private final By extendedSearchButton = By.xpath("//span[text() = 'Расширенный поиск']");
    private final By newCarsHeader = By.xpath("//div[@class = 'container-header']//a[text() = 'Новые авто']");
    private final By specialVehicleHome = By.xpath("//*[@class = 'i-tt-spectex']");
    private final By buldozerIconHome = By.xpath("//*[@title= 'Бульдозер']");

    public MainPageRia clickCabinet() {
        log.error("clickCabinet");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(enterCabinet));
        getDriver().findElement(enterCabinet).click();
        return this;
    }

    public MainPageRia fillBrand(String brand) {
        log.error("fillBrand");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(brandSearchBlock));
        Select dropBrand = new Select(getDriver().findElement(brandSearchBlock));
        dropBrand.selectByVisibleText(brand);
        return this;
    }

    public MainPageRia fillModel(String model) {
        log.error("fillModel");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(modelSearchBlock));
        Select dropModel = new Select(getDriver().findElement(modelSearchBlock));
        dropModel.selectByValue(model);
        return this;
    }

    public MainPageRia fillRegion(String region) {
        log.error("fillRegion");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(regionSearchBlock));
        Select dropRegion = new Select(getDriver().findElement(regionSearchBlock));
        dropRegion.selectByValue(region);
        return this;
    }

    public MainPageRia fillYear(String yearF, String yearT) {
        log.error("fillYear");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(yearFromSearchBlock));
        Select dropYearFrom = new Select(getDriver().findElement(yearFromSearchBlock));
        dropYearFrom.selectByValue(String.valueOf(yearF));

        getWait().until(ExpectedConditions.visibilityOfElementLocated(yearToSearchBlock));
        Select dropYearTo = new Select(getDriver().findElement(yearToSearchBlock));
        dropYearTo.selectByValue(String.valueOf(yearT));
        return this;
    }

    public MainPageRia clickSubmitButton() {
        log.error("clickSubmitButton");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(yearToSearchBlock));
        getDriver().findElement(submitButtonSearchBlock).click();
        return this;
    }

    public MainPageRia clickExtendedSearch() {
        log.error("clickExtendedSearch");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(extendedSearchButton));
        getDriver().findElement(extendedSearchButton).click();
        return this;
    }

    public MainPageRia clickNewCarsHeader() {
        log.error("clickNewCarsHeader");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(newCarsHeader));
        getDriver().findElement(newCarsHeader).click();
        return this;
    }

    public MainPageRia clickSpecialVehicle() {
        log.error("clickSpecialVehicle");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(specialVehicleHome));
        getDriver().findElement(specialVehicleHome).click();
        return this;
    }

    public MainPageRia clickBuldozer() {
        log.error("clickBuldozer");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(buldozerIconHome));
        getDriver().findElement(buldozerIconHome).click();
        return this;
    }
}
