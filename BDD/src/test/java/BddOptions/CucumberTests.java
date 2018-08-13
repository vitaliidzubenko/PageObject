package BddOptions;

import PagesRia.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CucumberTests extends DriverInit {
    private MainPageRia mainPageRia = new MainPageRia();

    //First Test
    @Given("^Get the Home Page$")
    public void get_the_Home_Page() {
        getDriver().get(getMainUrl());
    }

    @When("^Click Enter cabinet$")
    public void click_Enter_cabinet() {
        mainPageRia.clickCabinet();
    }

    @And("^Click Register$")
    public void click_Register() {
        LoginPageRia loginPageRia = new LoginPageRia();
        loginPageRia.clickRegister();
    }

    @And("^Click Enter with Google$")
    public void click_Enter_with_Google() {
        LoginPageRia loginPageRia = new LoginPageRia();
        loginPageRia.clickEnterGoogle();
    }

    @And("^Enter '(.*)' and '(.*)'$")
    public void enter_email_and_password(String email, String password) {
        LoginPageRia loginPageRia = new LoginPageRia();
        loginPageRia.fillPopUpGoogle(email, password);
    }

    @Then("^Verify bug for First Test$")
    public void see_bug_for_Test() {
        LoginPageRia loginPageRia = new LoginPageRia();
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

    @And("^Click Search button second test$")
    public void click_Search() {
        mainPageRia.clickSubmitButton();
    }

    @And("^Click at fifth result on page$")
    public void click_at_fifth_result_on_page() {
        ResPageRia resPageRia = new ResPageRia();
        resPageRia.resultSearchHomePage();
    }

    @Then("^Verify result for Second Test$")
    public void see_result_for_Test() {
        DetailResPageRia detailResPageRia = new DetailResPageRia();
        detailResPageRia.detailedInfoElement();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    //Third Test

    @When("^Click Advanced Search button at Search Field$")
    public void click_Advanced_Search_button_at_Search_Field() {
        mainPageRia.clickExtendedSearch();
    }

    @And("^At Advanced Search Form enter '(.*?)' and '(.*?)' of vehicle$")
    public void at_Advanced_Search_Form_enter_detailed_parameters(String yearF, String yearT) {
        ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
        extendSearchPageRia.fillBodyType()
                .fillBrand();

        extendSearchPageRia.fillYear(yearF, yearT);
        extendSearchPageRia.fillregion()
                .fillFuelType();

    }

    @And("^Click Search button third test$")
    public void click_Search_butt() {
        ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
        extendSearchPageRia.clickShowResultsButton();
    }

    @And("^Click at First result on page$")
    public void click_at_First_result_on_page() {
        ResPageRia resPageRia = new ResPageRia();
        resPageRia.clickFirstElementSearch();
    }

    @Then("^Verify result for Third Test$")
    public void see_result() {
        DetailResPageRia detailResPageRia = new DetailResPageRia();
        detailResPageRia.detailedInfoElement();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    //Fourth Test

    @When("^Click at header’s link New cars$")
    public void click_at_header_s_link_New_cars() {
        mainPageRia.clickNewCarsHeader();
    }

    @And("^Choose Chevrolet brand at Catalog of new cars$")
    public void choose_Chevrolet_brand_at_Catalog_of_new_cars() {
        ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
        extendSearchPageRia.clickChevrolet();
    }

    @And("^Choose Suburban model at Lineup block$")
    public void choose_Suburban_model_at_Lineup_block() {
        ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
        extendSearchPageRia.clickSuburban();
    }

    @And("^Click at the image$")
    public void click_at_the_image() {
        ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
        extendSearchPageRia.firstGenModel();
    }

    @And("^Click at Offers, where to buy$")
    public void click_at_Offers_where_to_buy() {
        ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
        extendSearchPageRia.offersForModel()
                .modelInfo();
    }

    @Then("^Verify result for Fourth Test$")
    public void click_Search_btt() {
        DetailResPageRia detailResPageRia = new DetailResPageRia();
        detailResPageRia.proposeChevy();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getProposeContent()).isDisplayed()), "***Verification Failed!***");
    }

    //Fifth Test

    @When("^Search Form enter parameter$")
    public void search_Form_enter_parameter() {
        mainPageRia.fillRegion();
    }

    @And("^Click on Special equipment at types of vehicles block$")
    public void click_on_Special_equipment_at_types_of_vehicles_block() {
        mainPageRia.clickSpecialVehicle();
    }

    @And("^Choose Bulldozer at drop down list$")
    public void choose_Bulldozer_at_drop_down_list() {
        mainPageRia.clickBuldozer();
    }

    @And("^Enter parameters of price from '(.*)' and price to '(.*)' and submit it$")
    public void enter_parameters_in_search_block(String yearF, String yearT) {
        ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
        extendSearchPageRia.priceBuldozer(yearF, yearT);
    }

    @And("^Click at the first element at the list$")
    public void click_at_the_first_element_at_the_list() {
        DetailResPageRia detailResPageRia = new DetailResPageRia();
        detailResPageRia.detailsBuldozer();
    }

    @Then("^Verify result for Fifth Test$")
    public void click_Search_tt() {
        DetailResPageRia detailResPageRia = new DetailResPageRia();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    //Sixth test

    @When("^Hover and click the link All for cars$")
    public void hover_the_link_All_for_cars() {
        mainPageRia.hoverClickCars();
    }

    @And("^Enter parameter at search field and submit it$")
    public void enter_parameters_at_search_field() {
        CTOpage ctoPage = new CTOpage();
        ctoPage.chooseCity();
    }

    @And("^Click on tick Official at options block and submit it$")
    public void click_on_tick_Official_at_options_block() {
        CTOpage ctoPage = new CTOpage();
        ctoPage.chooseOfficial();
    }

    @And("^Click on Show the phone of first element at the list$")
    public void click_on_Show_the_phone_of_first_element_at_the_list() {
        CTOpage ctoPage = new CTOpage();
        ctoPage.showHiddenPhone();
    }

    @Then("^Verify the phone is shown$")
    public void copy_the_phone_to_clipboard() {
        CTOpage ctoPage = new CTOpage();
        Assert.assertTrue((getDriver().findElement(ctoPage.getPhoneShown()).isDisplayed()), "***Verification Failed!***");
    }

    //Seventh test

    @When("^Scroll down the page to the end, Click at link questions$")
    public void scroll_down_the_page_to_the_end() {
        mainPageRia
                .clickQuestionsFooter()
                .switchToNewWindow();
    }

    @And("^Enter How to register at input search field and submit it$")
    public void enter_How_to_register_at_input_search_filed() {
        QuestionsPage questionsPage = new QuestionsPage();
        questionsPage.enterQuestion();
    }

    @And("^Click at Link$")
    public void click_s_butt() {
        QuestionsPage questionsPage = new QuestionsPage();
        questionsPage.clickLink();
    }

    @And("^View content of Link$")
    public void click_at_nd_link_of_the_list() {
        QuestionsPage questionsPage = new QuestionsPage();
        questionsPage.viewLink();
    }

    @Then("^Verify result for Seventh Test$")
    public void res_page() {
        QuestionsPage questionsPage = new QuestionsPage();
        Assert.assertTrue((getDriver().findElement(questionsPage.getAnswerContent()).isDisplayed()), "***Verification Failed!***");
    }

    //Eighth test

    @When("^Click at link Ria\\.com at headers menu$")
    public void click_at_link_Ria_com_at_headers_menu() {
        mainPageRia.clickRiaCom();
    }

    @Then("^Check the address of URL Ria, Get back to Main page$")
    public void check_the_address_of_URL_copy_it() {
        OtherRiaSites otherRiaSites = new OtherRiaSites();
        otherRiaSites.checkRiaCom();
    }

    @When("^Click at link Realty at headers menu$")
    public void click_at_link_Realty_at_headers_menu() {
        mainPageRia.clickRealty();
    }

    @Then("^Check the address of URL Realty, Get back to Main page$")
    public void check_the_address_of_URL() {
        OtherRiaSites otherRiaSites = new OtherRiaSites();
        otherRiaSites.checkRealty();
    }

    @When("^Click at link Car goods at headers menu$")
    public void click_at_link_Car_goods_at_headers_menu() {
        mainPageRia.clickCarGoods();
    }

    @Then("^Check the address of URL Car goods, Get back to Main page$")
    public void check_the_address() {
        OtherRiaSites otherRiaSites = new OtherRiaSites();
        otherRiaSites.checkCarGoods();
    }

    @When("^Click at link Auto parts at headers menu$")
    public void click_at_link_Auto_parts_at_headers_menu() {
        mainPageRia.clickAutoParts();
    }

    @Then("^Check the address of URL Auto parts, Get back to Main page$")
    public void check_the_add() {
        OtherRiaSites otherRiaSites = new OtherRiaSites();
        otherRiaSites.checkAutoParts();
    }

    @And("^Verify that the last website is displayed$")
    public void verify_last() {
        OtherRiaSites otherRiaSites = new OtherRiaSites();
        Assert.assertTrue((getDriver().findElement(otherRiaSites.getContentHeaderLinks()).isDisplayed()), "***Verification Failed!***");
    }

    //Nineth test

    @When("^Scroll down to click the Car from abroad$")
    public void scroll_down_to_see_the_Auto_ria_recommends_you() {
        mainPageRia.clickAbroadCar();
    }

    @And("^Scroll down to Click at link Cars from Lithuania$")
    public void scroll_down_to_see_the_block_Cars_from_Europe() {
        DetailResPageRia detailResPageRia = new DetailResPageRia();
        detailResPageRia.clickLithuania();
    }

    @And("^At the left filters panel enter parameters and submit it$")
    public void at_the_left_filters_panel_enter_parameters() {
        DetailResPageRia detailResPageRia = new DetailResPageRia();
        detailResPageRia.clickVehicleType()
                .clickVehicleType()
                .clickBrandType()
                .clickModelOfCar();
    }

    @And("^Click at one of filtered results$")
    public void scroll_down_to_see_filtered_results() {
        DetailResPageRia detailResPageRia = new DetailResPageRia();
        detailResPageRia.clickFilteredCar();
    }

    @Then("^Verify result for Nineth Test$")
    public void see_results() {
        DetailResPageRia detailResPageRia = new DetailResPageRia();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    //Tenth Test

    @When("^Click at Tractor car at types of vehicle block$")
    public void click_at_Tractor_car_at_types_of_vehicle_block() {
        mainPageRia.clickTruck();
    }

    @And("^Choose a Tank type from drop down list$")
    public void choose_a_Tank_type_from_drop_down_list() {
        ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
        extendSearchPageRia.fillBrandTruck();
    }

    @And("^Enter parameters at Search block and submit it$")
    public void enter_parameters_at_Search_block() {
        ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
        extendSearchPageRia.fillYearstruck();
    }

    @Then("^Check for results for Tenth Test$")
    public void check_for_results_for_Test() {
        ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
        Assert.assertFalse((getDriver().findElement(extendSearchPageRia.getEmptyResultsBlock()).isDisplayed()), "***Verification Failed!***");
    }

}
