package TestOptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

public class TestAnnotation extends DriverInit {
    protected final Logger log = LogManager.getLogger(TestAnnotation.class);
    protected final String MainUrl = "https://auto.ria.com/";

    @BeforeMethod
    public void setUp() {
        System.out.println("==================================================================================");
        System.out.println("******************************====START_OF_TEST====*******************************");
        System.out.println("==================================================================================");
        log.error("Start of Test/ Opening Browser");
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
        getDriver().get(MainUrl);
    }

    @AfterMethod
    public void tearDown() {
        log.error("Closing Browser");
        System.out.println("==================================================================================");
        System.out.println("******************************====FINISH_OF_TEST===*******************************");
        System.out.println("==================================================================================");
    }

    @AfterTest
    public void finish() {
        log.error("Closing session");
        getDriver().manage().deleteAllCookies();
        getDriver().close();
        System.out.println("==================================================================================");
        System.out.println("******************************====END_OF_SESSION===*******************************");
        System.out.println("==================================================================================");
    }

    @DataProvider(name = "CredentialsForLogin")
    public static Object[][] login() {
        return new Object[][]{{"test.for.ria@gmail.com", "test.for.ria123"}, {"test.for.ria@gmail.com", "test.for.ria123"}};
    }

    @DataProvider(name = "DataYear")
    public static Object[][] year() {
        return new Object[][]{{"2003", "2006"}, {"2008", "2012"}, {"2012", "2016"}};
    }

    @DataProvider(name = "DataPrice")
    public static Object[][] price() {
        return new Object[][]{{"40000", "70000"}, {"50000", "80000"}, {"60000", "90000"}};
    }

}
