package PO_Selenium;

import Selenium_Options.AnnotationsTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass extends AnnotationsTest {

    protected MainPage_PO mainPage = new MainPage_PO();
    protected LoginPage_PO loginPage = new LoginPage_PO();
    protected FinishPage_PO finishPage = new FinishPage_PO();

    @Test
    public void start_PO() {
        //Log4j Setup
//        Logger log = Logger.getLogger("TestClass");
//        PropertyConfigurator.configure("Log4j.properties");

//        log.info("Start of Test/ Opening Browser");
        getDriver().get("https://www.cryptomusu.com");
//        log.info("Going to Login Page");
        mainPage.clickMainButton();
//        log.info("Logining");
        loginPage.fillRegForm();
//        log.info("Waiting for successful registration");
        finishPage.waitForFinish();
//        log.info("End of Test/ Closing Browser");

    }
}

