package PO_Selenium;

import Selenium_Options.AnnotationsTest;
import org.testng.annotations.Test;

public class TestClass extends AnnotationsTest {

    protected MainPage_PO mainPage = new MainPage_PO();
    protected LoginPage_PO loginPage = new LoginPage_PO();
    protected FinishPage_PO finishPage = new FinishPage_PO();

    @Test(priority = 1)
    public void successTest() {
        log.error("Start of Test/ Opening Browser");
        getDriver().get("https://www.cryptomusu.com");
        log.error("Going to Login Page");
        mainPage.clickMainButton();
        log.error("Logining");
        loginPage.fillRegForm();
        log.error("Waiting for successful registration");
        finishPage.waitForFinish();
        log.error("End of Test/ Closing Browser");
    }

    @Test(priority = 2)
    public void failedTest() {
        log.error("Start of FailedTest/ MainPage");
        getDriver().get("https://www.cryptomusu.com");
        log.error("Doing mistake");
        loginPage.fillRegForm();
        finishPage.waitForFinish();
    }
}
