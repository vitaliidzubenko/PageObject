package RiaTests;

import Selenium_Options.DriverInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassForRia extends DriverInit {
    private MainPageRia mainPageRia = new MainPageRia();
    private DetailResPageRia detailResPageRia = new DetailResPageRia();
    private ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
    private ResPageRia resPageRia = new ResPageRia();
    private CTOpage ctoPage = new CTOpage();
    private QuestionsPage questionsPage = new QuestionsPage();//TODO objects of pages in tests
    private OtherRiaSites otherRiaSites = new OtherRiaSites();

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
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
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
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
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
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getProposeContent()).isDisplayed()), "***Verification Failed!***");
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
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    @Test(priority = 6)
    public void sixthTestCase() {
        mainPageRia.hoverClickCars();
        ctoPage
                .chooseCity()
                .chooseOfficial()
                .showHiddenPhone();
        Assert.assertTrue((getDriver().findElement(ctoPage.getPhoneShown()).isDisplayed()), "***Verification Failed!***");
    }

    @Test(priority = 7)
    public void seventhTestCase() {
        mainPageRia
                .clickQuestionsFooter()
                .swithcToNewWindow();
        questionsPage
                .enterQuestion()
                .clickLink()
                .viewLink();
        Assert.assertTrue((getDriver().findElement(questionsPage.getAnswerContent()).isDisplayed()), "***Verification Failed!***");
    }

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

    @Test(priority = 9)
    public void ninethTestCase() throws InterruptedException {
        mainPageRia.clickAbroadCar();
        detailResPageRia
                .clickLithuania()
                .clickVehicleType()
                .clickBrandType()
                .clickModelOfCar()
                .clickFilteredCar();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    @Test(priority = 10)
    public void tenthTestCase() {
        mainPageRia.clickTruck();
        extendSearchPageRia
                .fillBrandTruck()
                .fillYearstruck();
        Assert.assertFalse((getDriver().findElement(extendSearchPageRia.getEmptyResultsBlock()).isDisplayed()), "***Verification Failed!***");
    }
}
