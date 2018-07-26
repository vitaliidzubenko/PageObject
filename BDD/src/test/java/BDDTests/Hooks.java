package BDDTests;

import Selenium_Options.AnnotationsTest;
import Selenium_Options.DriverInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks extends DriverInit {

    private static Logger log = LogManager.getLogger(AnnotationsTest.class);

    @BeforeTest
    public void setUp() {
        System.out.println("==================================================================================");
        System.out.println("******************************====START_OF_TEST====*******************************");
        System.out.println("==================================================================================");
        log.error("Start of Test/ Opening Browser");
    }

    @AfterTest
    public void closeTest() {
        getDriver().manage().deleteAllCookies();
        getDriver().quit();
        log.error("Finish of Test/ Closing Browser");
        System.out.println("==================================================================================");
        System.out.println("******************************====FINISH_OF_TEST===*******************************");
        System.out.println("==================================================================================");
    }
}
