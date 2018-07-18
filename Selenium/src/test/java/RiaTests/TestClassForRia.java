package RiaTests;

import Selenium_Options.AnnotationsTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassForRia extends AnnotationsTest {
    private MainPageRia mainPageRia = new MainPageRia();
    private DetailResPageRia detailResPageRia = new DetailResPageRia();
    private ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
    private ResPageRia resPageRia = new ResPageRia();
    private CTOpage ctoPage = new CTOpage();
    private QuestionsPage questionsPage = new QuestionsPage();//TODO objects of pages in tests
    private OtherRiaSites otherRiaSites = new OtherRiaSites();

    @Description("This test is checking the login with Google account")
    @Test(priority = 1)
    public void firstTestCase() {
        mainPageRia.clickCabinet();
        LoginPageRia loginPageRia = new LoginPageRia();
        loginPageRia
                .clickRegister()
                .clickEnterGoogle()
                .fillPopUpGoogle("test.for.ria@gmail.com", "test.for.ria123");
        loginPageRia.checkForEnabledGoogle();
        Assert.assertFalse((getDriver().findElement(loginPageRia.getAfterLoginField()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking the search results from the Home Page using parameters")
    @Test(priority = 2)
    public void secondTestCase() {
        ResPageRia resPageRia = mainPageRia
                .fillBrand()
                .fillModel()
                .fillRegion()
                .fillYear()
                .clickSubmitButton();
        DetailResPageRia detailResPageRia = resPageRia.resultSearchHomePage();
        detailResPageRia.detailedInfoElement();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking search results by extended search form using parameters")
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
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking new auto results/ Chevrolet Suburban")
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
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getProposeContent()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking special vehicle results with parameters")
    @Test(priority = 5)
    public void fifthTestCase() {
        mainPageRia
                .fillRegion()
                .clickSpecialVehicle()
                .clickBuldozer();
        extendSearchPageRia
                .priceBuldozer("40000", "70000");
        detailResPageRia.detailsBuldozer();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking service station page, using Home Page headers menu")
    @Test(priority = 6)
    public void sixthTestCase() {
        mainPageRia.hoverClickCars();
        ctoPage
                .chooseCity()
                .chooseOfficial()
                .showHiddenPhone();
        Assert.assertTrue((getDriver().findElement(ctoPage.getPhoneShown()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking help page, entering text for answer")
    @Test(priority = 7)
    public void seventhTestCase() {
        mainPageRia
                .clickQuestionsFooter()
                .swithcToNewWindow();
        questionsPage
                .enterQuestion()
                .clickAndView();
        Assert.assertTrue((getDriver().findElement(questionsPage.getAnswerContent()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking all links of Ria services")
    @Test(priority = 8)
    public void eighthTestCase() {
        mainPageRia.clickRiaCom();
        otherRiaSites.checkRiaCom();

        mainPageRia.clickRealty();
        otherRiaSites.checkRealty();

        mainPageRia.clickCarGoods();
        otherRiaSites.checkCarGoods();

        mainPageRia.clickAutoParts();
        otherRiaSites.checkAutoParts();
        Assert.assertTrue((getDriver().findElement(otherRiaSites.getContentHeaderLinks()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking car from abroad search results")
    @Test(priority = 9)
    public void ninethTestCase() throws InterruptedException {
        mainPageRia.clickAbroadCar();
        detailResPageRia
                .clickLithuania()
                .clickVehicleType()
                .clickVehicleType()
                .clickBrandType()
                .clickModelOfCar()
                .clickFilteredCar();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking detailed search from previously entered parameter")
    @Test(priority = 10)
    public void tenthTestCase() {
        mainPageRia.clickTruck();
        extendSearchPageRia
                .fillBrandTruck()
                .fillYearstruck();
        Assert.assertFalse((getDriver().findElement(extendSearchPageRia.getEmptyResultsBlock()).isDisplayed()), "***Verification Failed!***");
    }
}
