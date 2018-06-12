package PO_Selenium;

import Selenium_Options.DataForInput;
import Selenium_Options.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class LoginPage_PO extends DriverInit {

    DataForInput data = new DataForInput();

    private By regForm = By.xpath("//*[@id = 'user-register-form']");
    private By firstName = By.xpath("//input[@name = 'firstName']");
    private By lastName = By.xpath("//input[@name = 'lastName']");
    private By email = By.xpath("//input[@name = 'email']");
    private By country = By.xpath("//select[@name = 'country']");
    private By phone = By.xpath("//input[@name = 'Phone']");
    private By submitButton = By.xpath("//input[@id = 'edit-submit']");

    public void fillRegForm() {

        getWait().until(ExpectedConditions.visibilityOfElementLocated(regForm));
        getDriver().findElement(firstName).sendKeys(data.randomfirstname);
        getDriver().findElement(lastName).sendKeys(data.randomlastname);
        getDriver().findElement(email).sendKeys(data.randomemail);
        //Selecting the country from dropdown
        WebElement SelCount = getDriver().findElement(country);
        Select dropdown = new Select(SelCount);
        dropdown.selectByVisibleText("Sweden");
        getDriver().findElement(phone).sendKeys(data.randomphone);
        getWait().until(ExpectedConditions.elementToBeClickable(submitButton));
        getDriver().findElement(submitButton).click();
    }
}
