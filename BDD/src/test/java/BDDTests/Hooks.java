package BDDTests;

import Selenium_Options.DriverInit;
import cucumber.api.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends DriverInit {
    private static Logger log = LogManager.getLogger(Hooks.class);

    @Before
    public void setUp() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
        System.out.println("==================================================================================");
        System.out.println("******************************====START_OF_TEST====*******************************");
        System.out.println("==================================================================================");
        log.error("Start of Test/ Opening Browser");
    }

    @After
    public void closeTest() {
        getDriver().manage().deleteAllCookies();
        getDriver().quit();
        log.error("Finish of Test/ Closing Browser");
        System.out.println("==================================================================================");
        System.out.println("******************************====FINISH_OF_TEST===*******************************");
        System.out.println("==================================================================================");
    }

}
