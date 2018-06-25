package RiaTests;

import Selenium_Options.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class MainPageRia extends DriverInit {

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

    public void clickCabinet() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(enterCabinet));
        getDriver().findElement(enterCabinet).click();
    }

    public void fillBrand(String brand) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(brandSearchBlock));
        Select dropBrand = new Select(getDriver().findElement(brandSearchBlock));
        dropBrand.selectByVisibleText(brand);
    }

    public void fillModel(String model) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(modelSearchBlock));
        Select dropModel = new Select(getDriver().findElement(modelSearchBlock));
        dropModel.selectByValue(model);
    }

    public void fillRegion(String region) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(regionSearchBlock));
        Select dropRegion = new Select(getDriver().findElement(regionSearchBlock));
        dropRegion.selectByValue(region);
    }

    public void fillYear(String yearF, String yearT) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(yearFromSearchBlock));
        Select dropYearFrom = new Select(getDriver().findElement(yearFromSearchBlock));
        dropYearFrom.selectByValue(String.valueOf(yearF));

        getWait().until(ExpectedConditions.visibilityOfElementLocated(yearToSearchBlock));
        Select dropYearTo = new Select(getDriver().findElement(yearToSearchBlock));
        dropYearTo.selectByValue(String.valueOf(yearT));
    }

    public void clickSubmitButton() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(yearToSearchBlock));
        getDriver().findElement(submitButtonSearchBlock).click();
    }

    public void clickExtendedSearch() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(extendedSearchButton));
        getDriver().findElement(extendedSearchButton).click();
    }

    public void clickNewCarsHeader() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(newCarsHeader));
        getDriver().findElement(newCarsHeader).click();
    }

    public void clickSpecialVehicle() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(specialVehicleHome));
        getDriver().findElement(specialVehicleHome).click();
    }

    public void clickBuldozer() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(buldozerIconHome));
        getDriver().findElement(buldozerIconHome).click();
    }
}
