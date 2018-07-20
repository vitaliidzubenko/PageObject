package BDDTests;

import RiaTests.*;
import Selenium_Options.DriverInit;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CucumberTests extends DriverInit {
    private MainPageRia mainPageRia = new MainPageRia();
    private LoginPageRia loginPageRia = new LoginPageRia();
    private DetailResPageRia detailResPageRia = new DetailResPageRia();
    private ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
    private ResPageRia resPageRia = new ResPageRia();
    private CTOpage ctoPage = new CTOpage();
    private QuestionsPage questionsPage = new QuestionsPage();
    private OtherRiaSites otherRiaSites = new OtherRiaSites();
    private static String MainUrl = "https://auto.ria.com/";

    //First Test

    @Given("^Get the Home Page$")
    public void get_the_Home_Page() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
        getDriver().get(MainUrl);
    }

    @When("^Click Enter cabinet$")
    public void click_Enter_cabinet() {
        mainPageRia.clickCabinet();
    }

    @Then("^Click Register$")
    public void click_Register() {
        loginPageRia.clickRegister();
    }

    @When("^Click Enter with Google$")
    public void click_Enter_with_Google() {
        loginPageRia.clickEnterGoogle();
    }

    @And("^Enter email and password$")
    public void enter_email_and_password(DataTable parameters) {
        List<String> parametersAsList = parameters.asList(String.class);
        loginPageRia.fillPopUpGoogle(parametersAsList.get(0), parametersAsList.get(1));
    }

    @Then("^Verify bug for First Test$")
    public void see_bug_for_Test() {
        loginPageRia.checkForEnabledGoogle();
        Assert.assertFalse((getDriver().findElement(loginPageRia.getAfterLoginField()).isDisplayed()), "***Verification Failed!***");
    }

    //Second Test

    @When("^At Search Form enter parameters$")
    public void at_Search_Form_enter_parameters() {
        mainPageRia.fillBrand()
                .fillModel()
                .fillRegion()
                .fillYear();
    }

    @Then("^Click Search button second test$")
    public void click_Search() {
        mainPageRia.clickSubmitButton();
    }

    @When("^Click at fifth result on page$")
    public void click_at_fifth_result_on_page() {
        resPageRia.resultSearchHomePage();
    }

    @Then("^Verify result for Second Test$")
    public void see_result_for_Test() {
        detailResPageRia.detailedInfoElement();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    //Third Test

    @When("^Click Advanced Search button at Search Field$")
    public void click_Advanced_Search_button_at_Search_Field() {
        mainPageRia.clickExtendedSearch();
    }

    @And("^At Advanced Search Form years of vehicle$")
    public void at_Advanced_Search_Form_enter_detailed_parameters(DataTable parameters) {
        extendSearchPageRia.fillBodyType()
                .fillBrand();
        List<String> parametersAsList = parameters.asList(String.class);
        extendSearchPageRia.fillYear(parametersAsList.get(0), parametersAsList.get(1));
        extendSearchPageRia.fillregion()
                .fillFuelType();
    }

    @Then("^Click Search button third test$")
    public void click_Search_butt() {
        extendSearchPageRia.clickShowResultsButton();
    }

    @When("^Click at First result on page$")
    public void click_at_First_result_on_page() {
        resPageRia.clickFirstElementSearch();
    }

    @Then("^Verify result for Third Test$")
    public void see_result() {
        detailResPageRia.detailedInfoElement();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    //Fourth Test

    @When("^Click at header’s link New cars$")
    public void click_at_header_s_link_New_cars() {
        mainPageRia.clickNewCarsHeader();
    }

    @Then("^Choose Chevrolet brand at Catalog of new cars$")
    public void choose_Chevrolet_brand_at_Catalog_of_new_cars() {
        extendSearchPageRia.clickChevrolet();
    }

    @And("^Choose Suburban model at Lineup block$")
    public void choose_Suburban_model_at_Lineup_block() {
        extendSearchPageRia.clickSuburban();
    }

    @When("^Click at the image$")
    public void click_at_the_image() {
        extendSearchPageRia.firstGenModel();
    }

    @Then("^Click at Offers, where to buy$")
    public void click_at_Offers_where_to_buy() {
        extendSearchPageRia.offersForModel()
                .modelInfo();
    }

    @And("^Verify result for Fourth Test$")
    public void click_Search_btt() {
        detailResPageRia.proposeChevy();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getProposeContent()).isDisplayed()), "***Verification Failed!***");
    }

    //Fifth Test

    @When("^Search Form enter parameter$")
    public void search_Form_enter_parameter() {
        mainPageRia.fillRegion();
    }

    @Then("^Click on Special equipment at types of vehicles block$")
    public void click_on_Special_equipment_at_types_of_vehicles_block() {
        mainPageRia.clickSpecialVehicle();
    }

    @And("^Choose Bulldozer at drop down list$")
    public void choose_Bulldozer_at_drop_down_list() {
        mainPageRia.clickBuldozer();
    }

    @And("^Enter parameters of price in search block and submit it$")
    public void enter_parameters_in_search_block(DataTable parameters) {
        List<String> parametersAsList = parameters.asList(String.class);
        extendSearchPageRia.priceBuldozer(parametersAsList.get(0), parametersAsList.get(1));
    }

    @When("^Click at the first element at the list$")
    public void click_at_the_first_element_at_the_list() {
        detailResPageRia.detailsBuldozer();
    }

    @Then("^Verify result for Fifth Test$")
    public void click_Search_tt() {
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    //Sixth test

    @When("^Hover and click the link All for cars$")
    public void hover_the_link_All_for_cars() {
        mainPageRia.hoverClickCars();
    }

    @Then("^Enter parameter at search field and submit it$")
    public void enter_parameters_at_search_field() {
        ctoPage.chooseCity();
    }

    @When("^Click on tick Official at options block and submit it$")
    public void click_on_tick_Official_at_options_block() {
        ctoPage.chooseOfficial();
    }

    @And("^Click on Show the phone of first element at the list$")
    public void click_on_Show_the_phone_of_first_element_at_the_list() {
        ctoPage.showHiddenPhone();
    }

    @Then("^Verify the phone is shown$")
    public void copy_the_phone_to_clipboard() {
        Assert.assertTrue((getDriver().findElement(ctoPage.getPhoneShown()).isDisplayed()), "***Verification Failed!***");
    }

    //Seventh test

    @When("^Scroll down the page to the end, Click at link questions$")
    public void scroll_down_the_page_to_the_end() {
        mainPageRia
                .clickQuestionsFooter()
                .swithcToNewWindow();
    }

    @Then("^Enter How to register at input search field and submit it$")
    public void enter_How_to_register_at_input_search_filed() {
        questionsPage.enterQuestion();
    }

    @And("^Click Search button seventh test$")
    public void click_s_butt() {
        questionsPage.clickAndView();
    }

    @When("^Click at second link of the list$")
    public void click_at_nd_link_of_the_list() {
        questionsPage.enterQuestion();
    }

    @Then("^Verify result for Seventh Test$")
    public void res_page() {
        Assert.assertTrue((getDriver().findElement(questionsPage.getAnswerContent()).isDisplayed()), "***Verification Failed!***");
    }

    //Eighth test

    @When("^Click at link Ria\\.com at headers menu$")
    public void click_at_link_Ria_com_at_headers_menu() {
        mainPageRia.clickRiaCom();
    }

    @Then("^Check the address of URL Ria, Get back to Main page$")
    public void check_the_address_of_URL_copy_it() {
        otherRiaSites.checkRiaCom();
    }

    @When("^Click at link Realty at headers menu$")
    public void click_at_link_Realty_at_headers_menu() {
        mainPageRia.clickRealty();
    }

    @Then("^Check the address of URL Realty, Get back to Main page$")
    public void check_the_address_of_URL() {
        otherRiaSites.checkRealty();
    }

    @When("^Click at link Car goods at headers menu$")
    public void click_at_link_Car_goods_at_headers_menu() {
        mainPageRia.clickCarGoods();
    }

    @Then("^Check the address of URL Car goods, Get back to Main page$")
    public void check_the_address() {
        otherRiaSites.checkCarGoods();
    }

    @When("^Click at link Auto parts at headers menu$")
    public void click_at_link_Auto_parts_at_headers_menu() {
        mainPageRia.clickAutoParts();
    }

    @Then("^Check the address of URL Auto parts, Get back to Main page$")
    public void check_the_add() {
        otherRiaSites.checkAutoParts();
    }

    @And("^Verify that the last website is displayed$")
    public void verify_last() {
        Assert.assertTrue((getDriver().findElement(otherRiaSites.getContentHeaderLinks()).isDisplayed()), "***Verification Failed!***");
    }

    //Nineth test

    @When("^Scroll down to click the Car from abroad$")
    public void scroll_down_to_see_the_Auto_ria_recommends_you() {
        mainPageRia.clickAbroadCar();
    }

    @Then("^Scroll down to Click at link Cars from Lithuania$")
    public void scroll_down_to_see_the_block_Cars_from_Europe() {
        detailResPageRia.clickLithuania();
    }

    @When("^At the left filters panel enter parameters and submit it$")
    public void at_the_left_filters_panel_enter_parameters() {
        detailResPageRia.clickVehicleType()
                .clickVehicleType()
                .clickBrandType()
                .clickModelOfCar();
    }

    @Then("^Click at one of filtered results$")
    public void scroll_down_to_see_filtered_results() throws InterruptedException {
        detailResPageRia.clickFilteredCar();
    }

    @And("^Verify result for Nineth Test$")
    public void see_results() {
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    //Tenth Test

    @When("^Click at Tractor car at types of vehicle block$")
    public void click_at_Tractor_car_at_types_of_vehicle_block() {
        mainPageRia.clickTruck();
    }

    @And("^Choose a Tank type from drop down list$")
    public void choose_a_Tank_type_from_drop_down_list() {
        extendSearchPageRia.fillBrandTruck();
    }

    @Then("^Enter parameters at Search block and submit it$")
    public void enter_parameters_at_Search_block() {
        extendSearchPageRia.fillYearstruck();
    }

    @And("^Check for results for Tenth Test$")
    public void check_for_results_for_Test() {
        Assert.assertFalse((getDriver().findElement(extendSearchPageRia.getEmptyResultsBlock()).isDisplayed()), "***Verification Failed!***");
    }


}
