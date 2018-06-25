package RiaTests;

import Selenium_Options.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Set;

public class LoginPageRia extends DriverInit {

    private final By register = By.xpath("//*[@title= 'Зарегистрироваться на AUTO.RIA']");
    private final By enterWithGoogle = By.xpath("//a[@class = 'item g-social']");
    private final By emailPopUp = By.xpath("//input[@name= 'identifier']");
    private final By next = By.xpath("//*[@id = 'identifierNext']");
    private final By passwordPopUp = By.xpath("//input[@name= 'password']");
    private final By nextButtonPopUp = By.xpath("//div[@id= 'passwordNext']");

    public void clickRegister() {
        getDriver().switchTo().frame("login_frame");
        getWait().until(ExpectedConditions.visibilityOfElementLocated(register));
        getDriver().findElement(register).click();
    }

    public void clickEnterGoogle() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(enterWithGoogle));
        getDriver().findElement(enterWithGoogle).click();
    }

    public void fillPopUpGoogle(String email, String password) {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        String parentWindow = getDriver().getWindowHandle();
        Set<String> handles = getDriver().getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(parentWindow)) {
                getDriver().switchTo().window(windowHandle);
                getWait().until(ExpectedConditions.visibilityOfElementLocated(emailPopUp));
                getDriver().findElement(emailPopUp).sendKeys(email);
                getDriver().findElement(next).click();
                getWait().until(ExpectedConditions.visibilityOfElementLocated(passwordPopUp));
                getDriver().findElement(passwordPopUp).sendKeys(password);
                getDriver().findElement(nextButtonPopUp).click();
                getDriver().close();
                getDriver().switchTo().window(parentWindow);
            }
        }
    }
}
