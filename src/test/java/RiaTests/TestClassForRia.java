package RiaTests;

import Selenium_Options.AnnotationsTest;
import org.testng.annotations.Test;

public class TestClassForRia extends AnnotationsTest {
    private MainPageRia mainPageRia = new MainPageRia();
    private DetailResPageRia detailResPageRia = new DetailResPageRia();
    private ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
    private ResPageRia resPageRia = new ResPageRia();

    @Test(priority = 1)
    public void firstTestCase() {
        mainPageRia.clickCabinet();
        LoginPageRia loginPageRia = new LoginPageRia();
        loginPageRia
                .clickRegister()
                .clickEnterGoogle()
                .fillPopUpGoogle("test.for.ria@gmail.com", "test.for.ria123");
        loginPageRia.checkForEnabledGoogle();
    }

    @Test(priority = 2)
    public void secondTestCase() {
        mainPageRia
                .fillBrand()
                .fillModel()
                .fillRegion()
                .fillYear()
                .clickSubmitButton();
        resPageRia.resultSearchHomePage();
        detailResPageRia.detailedInfoElement();
    }

    @Test(priority = 3)
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
        detailResPageRia.detailedInfoElement();
    }

    @Test(priority = 4)
    public void fourthTestCase() {
        mainPageRia.clickNewCarsHeader();
        extendSearchPageRia
                .clickChevrolet()
                .clickSuburban()
                .firstGenModel()
                .offersForModel()
                .modelInfo();
        detailResPageRia.proposeChevy();
    }

    @Test(priority = 5)
    public void fifthTestCase() {
        mainPageRia
                .fillRegion()
                .clickSpecialVehicle()
                .clickBuldozer();
        extendSearchPageRia
                .priceBuldozer("40000", "70000");
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
