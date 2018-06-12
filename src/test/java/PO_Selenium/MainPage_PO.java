package PO_Selenium;

import Selenium_Options.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage_PO extends DriverInit {

    private By openButton = By.xpath("//*[@class = 'section-first']//a[@title = 'Open account']");

    public void clickMainButton() {
        getWait().until(ExpectedConditions.elementToBeClickable(openButton));
        getDriver().findElement(openButton).click();
    }

}
