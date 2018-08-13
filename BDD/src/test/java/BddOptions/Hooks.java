package BddOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterSuite;

import java.util.concurrent.TimeUnit;

public class Hooks extends DriverInit {
    private static Logger log = LogManager.getLogger(Hooks.class);

    @Before
    public void setUp() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().window().fullscreen();
        getDriver().manage().deleteAllCookies();
        System.out.println("==================================================================================");
        System.out.println("******************************====START_OF_TEST====*******************************");
        System.out.println("==================================================================================");
        log.info("Start of Test/ Opening Browser");
    }

    @After
    public void closeTest() {
        getDriver().manage().deleteAllCookies();
        log.info("Finish of Test/ Closing Browser");
        System.out.println("==================================================================================");
        System.out.println("******************************====FINISH_OF_TEST===*******************************");
        System.out.println("==================================================================================");
    }

}
