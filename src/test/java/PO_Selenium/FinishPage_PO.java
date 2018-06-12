package PO_Selenium;

import Selenium_Options.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FinishPage_PO extends DriverInit {

    private By cashier = By.xpath("//div[@class = 'wrap-content-pandats']");

    public void waitForFinish() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(cashier));
    }

}
