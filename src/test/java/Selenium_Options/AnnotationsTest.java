package Selenium_Options;

import PO_Selenium.TestClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class AnnotationsTest extends DriverInit {

    protected static Logger log = LogManager.getLogger(TestClass.class);
    protected static SoftAssertions s = new SoftAssertions();
    protected static String MainUrl = "https://auto.ria.com/";

    @BeforeTest
    public void setUp() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
        getDriver().get(MainUrl);
        System.out.println("==================================================================================");
        System.out.println("******************************====START_OF_TEST====*******************************");
        System.out.println("==================================================================================");
        log.error("Start of Test/ Opening Browser");
    }

    @AfterTest
    public void closeTest() {
        getDriver().manage().deleteAllCookies();
        getDriver().close();
        System.out.println("==================================================================================");
        System.out.println("******************************====FINISH_OF_TEST===*******************************");
        System.out.println("==================================================================================");
        log.error("Finish of Test/ Closing Browser");
    }
}
