package Selenium_Options;

import io.qameta.allure.Attachment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IHookCallBack;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class AnnotationsTest extends DriverInit {

    protected static Logger log = LogManager.getLogger(AnnotationsTest.class);
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
        getDriver().quit();
        log.error("Finish of Test/ Closing Browser");
        System.out.println("==================================================================================");
        System.out.println("******************************====FINISH_OF_TEST===*******************************");
        System.out.println("==================================================================================");
        s.assertAll();
    }

    @Attachment(value = "Screenshot of {0}", type = "image/png")
    public byte[] saveScreenshot(String name, WebDriver driver) {
        return (byte[]) ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
    }

    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {
        iHookCallBack.runTestMethod(iTestResult);
        if (iTestResult.getThrowable() != null) {
            this.saveScreenshot(iTestResult.getName(), getDriver());
        }
    }
}
