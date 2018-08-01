package PagesRia;

import BddOptions.DriverInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

public class MainPageRia extends DriverInit {
    private final Logger log = LogManager.getLogger(MainPageRia.class);
    private final By enterCabinet = By.xpath("//div[@class = 'app-head-bar']//*[text() = 'Вход в кабинет']");
    private final By brandSearchBlock = By.xpath("//div[@id= 'brandTooltipBrandAutocomplete-brand']/label");
    private final By modelSearchBlock = By.id("brandTooltipBrandAutocomplete-model");
    private final By regionSearchBlock = By.id("regionAutocompleteAutocomplete-1");
    private final By yearFromSearchBlock = By.id("yearFrom");
    private final By yearToSearchBlock = By.id("yearTo");
    private final By submitButtonSearchBlock = By.xpath("//button[@class= 'button']");
    private final By extendedSearchButton = By.xpath("//span[text() = 'Расширенный поиск']");
    private final By newCarsHeader = By.xpath("//div[@class = 'container-header']//a[text() = 'Новые авто']");
    private final By specialVehicleHome = By.xpath("//i[@class = 'i-tt-spectex']");
    private final By buldozerIconHome = By.xpath("//a[@title= 'Бульдозер']");
    private final By skodaList = By.xpath("//ul[@class= 'unstyle scrollbar autocomplete-select']//a[text() = 'Skoda']");
    private final By modelList = By.xpath("//ul[@class= 'unstyle scrollbar autocomplete-select']//a[text() = 'Octavia A5']");
    private final By regionList = By.xpath("//div[@class= 'autocomplete-search mhide']//a[text() = 'Винница']");
    private final By yearFromList = By.xpath("//select[@id= 'yearFrom']/option[10]");
    private final By yearToList = By.xpath("//select[@id= 'yearTo']/option[5]");
    private final By allForAuto = By.xpath("//li[@class= 'nav-list_item has-dropdown']");
    private final By catalogCTO = By.xpath("//li[@class= 'nav-list_item has-dropdown']//a[text() = 'Каталог СТО ']");
    private final By questionsFooter = By.xpath("//div[@class = 'support-app-footer']//a[@class = 'button button-primary']");
    private final By headerLinkRiaCom = By.xpath("//nav[@class = 'nav-head']//a[text() = 'RIA.com']");
    private final By headerLinkRealty = By.xpath("//nav[@class = 'nav-head']//a[text() = 'Недвижимость']");
    private final By headerLinkCarGoods = By.xpath("//nav[@class = 'nav-head']//a[text() = 'Автотовары']");
    private final By headerLinkAutoParts = By.xpath("//nav[@class = 'nav-head']//a[text() = 'Автозапчасти']");
    private final By abroadCar = By.xpath("//section[@id = 'recomended-section']//a[text() = 'Поиск авто из-за рубежа']");
    private final By typeTruck = By.xpath("//section[@class = 'box-panel line']//span[text() = 'Грузовики']");
    private final By truckTypeTank = By.xpath("//nav[@class = 'catalog-referrals open-mobile']//a[text() = 'Цистерна']");


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

    public ResPageRia clickSubmitButton() {
        log.error("clickSubmitButton");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(submitButtonSearchBlock)).click();
        return new ResPageRia();
    }

    public MainPageRia clickExtendedSearch() {
        log.error("clickExtendedSearch");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(extendedSearchButton)).click();
        return this;
    }

    public MainPageRia clickNewCarsHeader() {
        log.error("clickNewCarsHeader");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(newCarsHeader)).click();
        return this;
    }

    public MainPageRia clickSpecialVehicle() {
        log.error("clickSpecialVehicle");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(specialVehicleHome)).click();
        return this;
    }

    public MainPageRia clickBuldozer() {
        log.error("clickBuldozer");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(buldozerIconHome)).click();
        return this;
    }

    public MainPageRia hoverClickCars() {
        log.error("hoverClickCars");
        Actions action = new Actions(getDriver());
        getWait().until(ExpectedConditions.visibilityOfElementLocated(allForAuto));
        action.moveToElement(getDriver().findElement(allForAuto)).build().perform();
        getDriver().findElement(catalogCTO).click();
        return this;
    }

    public MainPageRia clickQuestionsFooter() {
        log.error("clickQuestionsFooter");
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,4000)");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(questionsFooter)).click();
        return this;
    }

    public MainPageRia swithcToNewWindow() {
        log.error("swithcToNewWindow");
        String parentWindow = getDriver().getWindowHandle();
        Set<String> handles = getDriver().getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(parentWindow)) {
                getDriver().switchTo().window(windowHandle);
            }
        }
        return this;
    }

    public MainPageRia clickRiaCom() {
        log.error("clickRiaCom");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(headerLinkRiaCom)).click();
        return this;
    }

    public MainPageRia clickRealty() {
        log.error("clickRealty");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(headerLinkRealty)).click();
        return this;
    }

    public MainPageRia clickCarGoods() {
        log.error("clickCarGoods");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(headerLinkCarGoods)).click();
        return this;
    }

    public MainPageRia clickAutoParts() {
        log.error("clickAutoParts");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(headerLinkAutoParts)).click();
        return this;
    }

    public MainPageRia clickAbroadCar() {
        log.error("clickAbroadCar");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(abroadCar)).click();
        return this;
    }

    public MainPageRia clickTruck() {
        log.error("clickTruck");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(typeTruck)).click();
        getWait().until(ExpectedConditions.visibilityOfElementLocated(truckTypeTank)).click();
        return this;
    }
}
