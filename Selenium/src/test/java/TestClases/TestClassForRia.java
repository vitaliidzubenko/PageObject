package TestClases;

import RiaPages.*;
import TestOptions.TestAnnotation;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassForRia extends TestAnnotation {
    private MainPageRia mainPage = new MainPageRia();
    private DetailResPageRia detResPage = new DetailResPageRia();
    private ExtendSearchPageRia extSearch = new ExtendSearchPageRia();

    @Description("This test is checking the login with Google account")
    @Test(priority = 1)
    public void firstTestCase() {
        mainPage.clickCabinet();
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
        mainPage
                .fillBrand()
                .fillModel()
                .fillRegion()
                .fillYear()
                .clickSubmitButton();
        ResPageRia resPageRia = new ResPageRia();
        resPageRia.resultSearchHomePage();
        detResPage.detailedInfoElement();
        Assert.assertTrue((getDriver().findElement(detResPage.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking search results by extended search form using parameters")
    @Test(priority = 3)
    public void thirdTestCase() {
        ResPageRia resPageRia = new ResPageRia();
        mainPage.clickExtendedSearch();
        extSearch
                .fillBodyType()
                .fillBrand()
                .fillYear("2010", "2015")
                .fillregion()
                .fillFuelType()
                .clickShowResultsButton();
        resPageRia.clickFirstElementSearch();
        detResPage.detailedInfoElement();
        Assert.assertTrue((getDriver().findElement(detResPage.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking new auto results/ Chevrolet Suburban")
    @Test(priority = 4)
    public void fourthTestCase() {
        mainPage.clickNewCarsHeader();
        extSearch
                .clickChevrolet()
                .clickSuburban()
                .firstGenModel()
                .offersForModel()
                .modelInfo();
        detResPage.proposeChevy();
        Assert.assertTrue((getDriver().findElement(detResPage.getProposeContent()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking special vehicle results with parameters")
    @Test(priority = 5)
    public void fifthTestCase() {
        mainPage
                .fillRegion()
                .clickSpecialVehicle()
                .clickBuldozer();
        extSearch
                .priceBuldozer("40000", "70000");
        detResPage.detailsBuldozer();
        Assert.assertTrue((getDriver().findElement(detResPage.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking service station page, using Home Page headers menu")
    @Test(priority = 6)
    public void sixthTestCase() {
        mainPage.hoverClickCars();
        CTOpage ctoPage = new CTOpage()
                .chooseCity()
                .chooseOfficial()
                .showHiddenPhone();
        Assert.assertTrue((getDriver().findElement(ctoPage.getPhoneShown()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking help page, entering text for answer")
    @Test(priority = 7)
    public void seventhTestCase() {
        mainPage
                .clickQuestionsFooter()
                .swithcToNewWindow();
        QuestionsPage questPage = new QuestionsPage()
                .enterQuestion()
                .clickLink()
                .viewLink();
        Assert.assertTrue((getDriver().findElement(questPage.getAnswerContent()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking all links of Ria services")
    @Test(priority = 8)
    public void eighthTestCase() {
        OtherRiaSites otherSites = new OtherRiaSites();
        mainPage.clickRiaCom();
        otherSites.checkRiaCom();

        mainPage.clickRealty();
        otherSites.checkRealty();

        mainPage.clickCarGoods();
        otherSites.checkCarGoods();

        mainPage.clickAutoParts();
        otherSites.checkAutoParts();
        Assert.assertTrue((getDriver().findElement(otherSites.getContentHeaderLinks()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking car from abroad search results")
    @Test(priority = 9)
    public void ninethTestCase() throws InterruptedException {
        mainPage.clickAbroadCar();
        detResPage
                .clickLithuania()
                .clickVehicleType()
                .clickBrandType()
                .clickModelOfCar()
                .clickFilteredCar();
        Assert.assertTrue((getDriver().findElement(detResPage.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    @Description("This test is checking detailed search from previously entered parameter")
    @Test(priority = 10)
    public void tenthTestCase() {
        mainPage.clickTruck();
        extSearch
                .fillBrandTruck()
                .fillYearstruck();
        Assert.assertFalse((getDriver().findElement(extSearch.getEmptyResultsBlock()).isDisplayed()), "***Verification Failed!***");
    }
}