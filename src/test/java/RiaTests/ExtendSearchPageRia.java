package RiaTests;

import Selenium_Options.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ExtendSearchPageRia extends DriverInit {

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

    public void fillBodyType() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(bodyTypeExtendedSearch));
        getDriver().findElement(bodyTypeExtendedSearch).click();
    }

    public void fillBrand() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(enterBrandExtendedSearch));
        getDriver().findElement(enterBrandExtendedSearch).click();
    }

    public void fillYear(String yearF, String yearT) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(yearFromExtendedSearch));
        getDriver().findElement(yearFromExtendedSearch).sendKeys(yearF);

        getWait().until(ExpectedConditions.visibilityOfElementLocated(yearToExtendedSearch));
        getDriver().findElement(yearToExtendedSearch).clear();
        getDriver().findElement(yearToExtendedSearch).sendKeys(yearT);
    }

    public void fillregion() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(regionExtendedSearch));
        getDriver().findElement(regionExtendedSearch).click();
    }

    public void fillFuelType() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(fuelTypeExtendedSearch));
        getDriver().findElement(fuelTypeExtendedSearch).click();
    }

    public void clickShowResultsButton() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(showResultsExtendedSearch));
        getDriver().findElement(showResultsExtendedSearch).click();
    }

    public void clickChevrolet() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(chevroletIcon));
        getDriver().findElement(chevroletIcon).click();
    }

    public void clickSuburban() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(suburbanModel));
        getDriver().findElement(suburbanModel).click();
    }

    public void firstGenModel() {
        getWait().until(ExpectedConditions.elementToBeClickable(firstImageSuburban));
        getDriver().findElement(firstImageSuburban).click();
    }

    public void offersForModel() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(offersForElement));
        getDriver().findElement(offersForElement).click();
    }

    public void modelInfo() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(allPageContent));
    }

    public void fillBuldozerBrand(String brandBuldozer) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(buldozerBrandSearch));
        Select dropBrandBuldozer = new Select(getDriver().findElement(buldozerBrandSearch));
        dropBrandBuldozer.selectByVisibleText(brandBuldozer);
    }

    public void priceBuldozer(String priceF, String priceT) {
        getDriver().findElement(priceFrom).sendKeys(String.valueOf(priceF));
        getDriver().findElement(priceTo).sendKeys(String.valueOf(priceT));
        getDriver().findElement(searchButtonSearch).click();
    }

}
