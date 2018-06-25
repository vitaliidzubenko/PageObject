package RiaTests;

import Selenium_Options.AnnotationsTest;
import org.testng.annotations.Test;

public class TestClassForRia extends AnnotationsTest {

    private MainPageRia mainPageRia = new MainPageRia();
    private LoginPageRia loginPageRia = new LoginPageRia();
    private DetailResPageRia detailResPageRia = new DetailResPageRia();
    private ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
    private ResPageRia resPageRia = new ResPageRia();
    private String MainUrl = "https://auto.ria.com/";

    @Test(priority = 1) //TODO add asserts for all
    public void firstTestCase() {
        getDriver().get(MainUrl);
        log.error("Start of 1th TestCase/ Opening Browser");
        mainPageRia.clickCabinet();
        loginPageRia.clickRegister();
        loginPageRia.clickEnterGoogle();
        loginPageRia.fillPopUpGoogle("test.for.ria@gmail.com", "test.for.ria123");
        log.error("Finish of 1th TestCase/ Closing Browser");

    }

    @Test(priority = 2) //TODO Element should have been "select" but was "div"
    public void secondTestCase() {
        getDriver().get(MainUrl);
        log.error("Start of 2th TestCase/ Opening Browser");
        mainPageRia.fillBrand("Skoda");
        mainPageRia.fillModel("Octavia A5");
        mainPageRia.fillRegion("Винница");
        mainPageRia.fillYear("2010", "2015");
        mainPageRia.clickSubmitButton();
        resPageRia.resultSearchHomePage();
        detailResPageRia.detailedInfoElement();
        log.error("Finish of 2th TestCase/ Closing Browser");
    }

    @Test(priority = 3) //TODO year 2010-2010 ?? (2010-2015)
    public void thirdTestCase() {
        getDriver().get(MainUrl);
        log.error("Start of 3th TestCase/ Opening Browser");
        mainPageRia.clickExtendedSearch();
        extendSearchPageRia.fillBodyType();
        extendSearchPageRia.fillBrand();
        extendSearchPageRia.fillYear("2010", "2015");
        extendSearchPageRia.fillregion();
        extendSearchPageRia.fillFuelType();
        extendSearchPageRia.clickShowResultsButton();
        resPageRia.clickFirstElementSearch();
        log.error("Finish of 3th TestCase/ Closing Browser");
    }

    @Test(priority = 4) //TODO
    public void fourthTestCase() {
        getDriver().get(MainUrl);
        log.error("Start of 4th TestCase/ Opening Browser");
        mainPageRia.clickNewCarsHeader();
        extendSearchPageRia.clickChevrolet();
        extendSearchPageRia.clickSuburban();
        extendSearchPageRia.firstGenModel();
        extendSearchPageRia.offersForModel();
        extendSearchPageRia.modelInfo();
        log.error("Finish of 4th TestCase/ Closing Browser");
    }

    @Test(priority = 5) //TODO Element should have been "select" but was "input"
    public void fifthTestCase() {
        getDriver().get(MainUrl);
        log.error("Start of 5th TestCase/ Opening Browser");
        mainPageRia.clickSpecialVehicle();
        mainPageRia.clickBuldozer();
        extendSearchPageRia.fillBuldozerBrand("Caterpillar");
        extendSearchPageRia.priceBuldozer("50000", "60000");
        detailResPageRia.detailsBuldozer();
        log.error("Finish of 5th TestCase/ Closing Browser");
    }

    @Test(priority = 6) //TODO
    public void sixthTestCase() {
        getDriver().get(MainUrl);
        log.error("Start of 6th TestCase/ Opening Browser");
        mainPageRia.fillBrand("Skoda");
        mainPageRia.fillModel("Octavia A5");
        mainPageRia.fillRegion("Винница");
        mainPageRia.fillYear("2010", "2015");
        mainPageRia.clickSubmitButton();
        resPageRia.resultSearchHomePage();
        detailResPageRia.detailedInfoElement();
        log.error("Finish of 6th TestCase/ Closing Browser");
    }

    @Test(priority = 7) //TODO
    public void seventhTestCase() {
        getDriver().get(MainUrl);
        log.error("Start of 7th TestCase/ Opening Browser");
        log.error("Finish of 7th TestCase/ Closing Browser");

    }

    @Test(priority = 8) //TODO
    public void eighthTestCase() {
        getDriver().get(MainUrl);
        log.error("Start of 8th TestCase/ Opening Browser");
        log.error("Finish of 8th TestCase/ Closing Browser");

    }

    @Test(priority = 9) //TODO
    public void ninethTestCase() {
        getDriver().get(MainUrl);
        log.error("Start of 9th TestCase/ Opening Browser");
        log.error("Finish of 9th TestCase/ Closing Browser");

    }

    @Test(priority = 10) //TODO
    public void tenthTestCase() {
        getDriver().get(MainUrl);
        log.error("Start of 10th TestCase/ Opening Browser");
        log.error("Finish of 10th TestCase/ Closing Browser");

    }
}
