package PO_Selenium;

import Selenium_Options.AnnotationsTest;
import org.testng.annotations.Test;

public class TestClass extends AnnotationsTest {

    protected MainPage_PO mainPage = new MainPage_PO();
    protected LoginPage_PO loginPage = new LoginPage_PO();
    protected FinishPage_PO finishPage = new FinishPage_PO();

    @Test
    public void start_PO() {
        getDriver().get("https://www.cryptomusu.com");
        mainPage.clickMainButton();
        loginPage.fillRegForm();
        finishPage.waitForFinish();
    }
}
