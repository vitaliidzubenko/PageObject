package Selenium_Options;

import PO_Selenium.TestClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class AnnotationsTest extends DriverInit {

    public static Logger log = LogManager.getLogger(TestClass.class);

    @BeforeTest
    public void setUp() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
    }

    @AfterTest
    public void closeTest() {
        getDriver().manage().deleteAllCookies();
        getDriver().close();
    }
}
