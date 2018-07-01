package RiaTests;

import Selenium_Options.DriverInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPageRia extends DriverInit {
    private final Logger log = LogManager.getLogger(MainPageRia.class);
    private final By enterCabinet = By.xpath("//div[@class = 'app-head-bar']//*[text() = 'Вход в кабинет']");
    private final By brandSearchBlock = By.xpath("//div[@id= 'brandTooltipBrandAutocomplete-brand']/label");
    private final By modelSearchBlock = By.xpath("//*[@id='brandTooltipBrandAutocomplete-model']/label");
    private final By regionSearchBlock = By.xpath("//*[@id= 'regionAutocompleteAutocomplete-1']/label");
    private final By yearFromSearchBlock = By.xpath("//*[@id = 'yearFrom']");
    private final By yearToSearchBlock = By.xpath("//*[@id = 'yearTo']");
    private final By submitButtonSearchBlock = By.xpath("//*[@class= 'button']");
    private final By extendedSearchButton = By.xpath("//span[text() = 'Расширенный поиск']");
    private final By newCarsHeader = By.xpath("//div[@class = 'container-header']//a[text() = 'Новые авто']");
    private final By specialVehicleHome = By.xpath("//*[@class = 'i-tt-spectex']");
    private final By buldozerIconHome = By.xpath("//*[@title= 'Бульдозер']");
    private final By skodaList = By.xpath("//*[@class= 'unstyle scrollbar autocomplete-select']//a[text() = 'Skoda']");
    private final By modelList = By.xpath("//*[@class= 'unstyle scrollbar autocomplete-select']//a[text() = 'Octavia A5']");
    private final By regionList = By.xpath("//*[@id= 'regionAutocompleteAutocomplete-1']/ul/li[3]/a");
    private final By yearFromList = By.xpath("//*[@id= 'yearFrom']/option[10]");
    private final By yearToList = By.xpath("//*[@id= 'yearTo']/option[5]");

    public MainPageRia clickCabinet() {
        log.error("clickCabinet");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(enterCabinet));
        getDriver().findElement(enterCabinet).click();
        return this;
    }

    public MainPageRia fillBrand() {
        log.error("fillBrand");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(brandSearchBlock)).click();
        getDriver().findElement(skodaList).click();
        return this;
    }

    public MainPageRia fillModel() {
        log.error("fillModel");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(modelSearchBlock)).click();
        getDriver().findElement(modelList).click();
        return this;
    }

    public MainPageRia fillRegion() {
        log.error("fillRegion");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(regionSearchBlock)).click();
        getDriver().findElement(regionList).click();
        return this;
    }

    public MainPageRia fillYear() {
        log.error("fillYear");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(yearFromSearchBlock)).click();
        getDriver().findElement(yearFromList).click();

        getWait().until(ExpectedConditions.visibilityOfElementLocated(yearToSearchBlock)).click();
        getDriver().findElement(yearToList).click();
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
