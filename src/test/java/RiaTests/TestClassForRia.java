package RiaTests;

import Selenium_Options.AnnotationsTest;
import org.testng.annotations.Test;

public class TestClassForRia extends AnnotationsTest {
    //TODO delete objects of pages (below)
    //TODO add asserts for all tests
    private MainPageRia mainPageRia = new MainPageRia();
    private DetailResPageRia detailResPageRia = new DetailResPageRia();
    private ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
    private ResPageRia resPageRia = new ResPageRia();

    @Test(priority = 1)
    public void firstTestCase() {
        LoginPageRia loginPageRia = new LoginPageRia();
        mainPageRia.clickCabinet();
        loginPageRia
                .clickRegister()
                .clickEnterGoogle()
                .fillPopUpGoogle("test.for.ria@gmail.com", "test.for.ria123");
    }

    @Test(priority = 2) //TODO Error = Element should have been "select" but was "div"
    public void secondTestCase() {
        mainPageRia
                .fillBrand("Skoda")
                .fillModel("Octavia A5")
                .fillRegion("Винница")
                .fillYear("2010", "2015")
                .clickSubmitButton();
        resPageRia.resultSearchHomePage();
        detailResPageRia.detailedInfoElement();
    }

    @Test(priority = 3) //TODO year 2010-2010 ?? (2010-2015)
    public void thirdTestCase() {
        mainPageRia.clickExtendedSearch();
        extendSearchPageRia
                .fillBodyType()
                .fillBrand()
                .fillYear("2010", "2015")
                .fillregion()
                .fillFuelType()
                .clickShowResultsButton();
        resPageRia.clickFirstElementSearch();
    }

    @Test(priority = 4) //TODO
    public void fourthTestCase() {
        mainPageRia.clickNewCarsHeader();
        extendSearchPageRia
                .clickChevrolet()
                .clickSuburban()
                .firstGenModel()
                .offersForModel()
                .modelInfo();
    }

    @Test(priority = 5) //TODO Element should have been "select" but was "input"
    public void fifthTestCase() {
        mainPageRia
                .clickSpecialVehicle()
                .clickBuldozer();
        extendSearchPageRia
                .fillBuldozerBrand("Caterpillar")
                .priceBuldozer("50000", "60000");
        detailResPageRia.detailsBuldozer();
    }

    @Test(priority = 6) //TODO
    public void sixthTestCase() {

    }

    @Test(priority = 7) //TODO
    public void seventhTestCase() {

    }

    @Test(priority = 8) //TODO
    public void eighthTestCase() {

    }

    @Test(priority = 9) //TODO
    public void ninethTestCase() {

    }

    @Test(priority = 10) //TODO
    public void tenthTestCase() {

    }
}
