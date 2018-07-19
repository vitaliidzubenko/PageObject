package BDDTests;

import RiaTests.*;
import Selenium_Options.AnnotationsTest;
import Selenium_Options.DriverInit;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class CucumberTests extends DriverInit {
    private MainPageRia mainPageRia = new MainPageRia();
    private LoginPageRia loginPageRia = new LoginPageRia();
    private DetailResPageRia detailResPageRia = new DetailResPageRia();
    private ExtendSearchPageRia extendSearchPageRia = new ExtendSearchPageRia();
    private ResPageRia resPageRia = new ResPageRia();
    private CTOpage ctoPage = new CTOpage();
    private QuestionsPage questionsPage = new QuestionsPage();
    private OtherRiaSites otherRiaSites = new OtherRiaSites();

    //First Test

    @Given("^Get the Home Page$")
    public void get_the_Home_Page() {
        //It works by default
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

    @Then("^See bug for First Test$")
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

    @Then("^See result for Second Test$")
    public void see_result_for_Test() {
        detailResPageRia.detailedInfoElement();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    //Third Test

    @When("^Click Advanced Search button at Search Field$")
    public void click_Advanced_Search_button_at_Search_Field() {
        mainPageRia.clickExtendedSearch();
    }

    @And("^At Advanced Search Form enter detailed parameters$")
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

    @Then("^See result for Third Test$")
    public void see_result() {
        detailResPageRia.detailedInfoElement();
        Assert.assertTrue((getDriver().findElement(detailResPageRia.getContentDisplayed()).isDisplayed()), "***Verification Failed!***");
    }

    //Fourth Test

    @When("^Click at header’s link New cars$")
    public void click_at_header_s_link_New_cars() {
    }

    @Then("^Choose Chevrolet brand at Catalog of new cars$")
    public void choose_Chevrolet_brand_at_Catalog_of_new_cars() {
    }

    @And("^Choose Suburban model at Lineup block$")
    public void choose_Suburban_model_at_Lineup_block() {

    }

    @When("^Click at the image$")
    public void click_at_the_image(int arg1, int arg2) {

    }

    @Then("^Click at Offers, where to buy$")
    public void click_at_Offers_where_to_buy() {

    }

    @And("^See result for Fourth Test$")
    public void click_Search_btt() {
    }

    //Fifth Test

    @When("^Search Form enter parameter$")
    public void search_Form_enter_parameter() {

    }

    @Then("^Click on Special equipment at types of vehicles block$")
    public void click_on_Special_equipment_at_types_of_vehicles_block() {

    }

    @And("^Choose Bulldozer at drop down list$")
    public void choose_Bulldozer_at_drop_down_list() {

    }

    @And("^Enter parameters in search block$")
    public void enter_parameters_in_search_block(DataTable arg1) {

    }

    @When("^Click Search button fifth test$")
    public void click_Search_b() {

    }

    @Then("^Click at the first element at the list$")
    public void click_at_the_first_element_at_the_list() {
    }

    @And("^See result for Fifth Test$")
    public void click_Search_tt() {
    }

    //Sixth test

    @When("^Hover the link All for cars$")
    public void hover_the_link_All_for_cars() {

    }

    @And("^Click at drop down list at link Service station catalog$")
    public void click_at_drop_down_list_at_link_Service_station_catalog() {

    }

    @Then("^Enter parameters at search field$")
    public void enter_parameters_at_search_field(DataTable arg1) {

    }

    @And("^Click Search button sixth test$")
    public void click_Search_button() {

    }

    @When("^Click on tick Official at options block$")
    public void click_on_tick_Official_at_options_block() {

    }

    @And("^Click Submit button$")
    public void click_S_button() {

    }

    @And("^Click on Show the phone of first element at the list$")
    public void click_on_Show_the_phone_of_first_element_at_the_list() {

    }

    @Then("^Copy the phone to clipboard$")
    public void copy_the_phone_to_clipboard() {

    }

    //Seventh test

    @When("^Scroll down the page to the end$")
    public void scroll_down_the_page_to_the_end() {

    }

    @And("^Click at link Any questions\\?$")
    public void click_at_link_Any_questions() {

    }

    @Then("^Enter How to register at input search field$")
    public void enter_How_to_register_at_input_search_filed() {

    }

    @And("^Click Search button seventh test$")
    public void click_s_butt() {

    }

    @When("^Click at second link of the list$")
    public void click_at_nd_link_of_the_list(int arg1) {

    }

    @Then("^See result for Seventh Test$")
    public void res_page() {

    }

    //Eighth test

    @When("^Click at link Ria\\.com at headers menu$")
    public void click_at_link_Ria_com_at_headers_menu() {

    }

    @Then("^Check the address of URL Ria, copy it$")
    public void check_the_address_of_URL_copy_it() {

    }

    @And("^Get back to the Home Page$")
    public void get_back_to_the_Home_Page() {

    }

    @When("^Click at link Realty at headers menu$")
    public void click_at_link_Realty_at_headers_menu() {

    }

    @Then("^Check the address of URL Realty, copy it$")
    public void check_the_address_of_URL() {

    }

    @And("^Get back to Home Page$")
    public void get_back_to_Home_Page() {

    }

    @When("^Click at link Car goods at headers menu$")
    public void click_at_link_Car_goods_at_headers_menu() {

    }

    @Then("^Check the address of URL Car goods, copy it$")
    public void check_the_address() {

    }

    @And("^Get back to Home Page$")
    public void get_back_to_Ho_Page() {

    }

    @When("^Click at link Auto parts at headers menu$")
    public void click_at_link_Auto_parts_at_headers_menu() {

    }

    @Then("^Check the address of URL Auto parts, copy it$")
    public void check_the_add() {

    }

    //Nineth test

    @When("^Scroll down to see the AutoRia recommends you$")
    public void scroll_down_to_see_the_Auto_ria_recommends_you() {

    }

    @And("^Click at link Car from abroad$")
    public void click_at_link_Car_from_abroad() {

    }

    @Then("^Scroll down to see the block Cars from Europe$")
    public void scroll_down_to_see_the_block_Cars_from_Europe() {

    }

    @And("^Click at link Cars from Lithuania$")
    public void click_at_link_Cars_from_Lithuania() {

    }

    @When("^At the left filters panel enter parameters:$")
    public void at_the_left_filters_panel_enter_parameters(DataTable arg1) {

    }

    @Then("^Scroll down to see filtered results$")
    public void scroll_down_to_see_filtered_results() {

    }

    @And("^See result for Nineth Test$")
    public void see_results() {

    }

    //Tenth Test

    @When("^Click at Tractor car at types of vehicle block$")
    public void click_at_Tractor_car_at_types_of_vehicle_block() {

    }

    @And("^Choose a Tank type from drop down list$")
    public void choose_a_Tank_type_from_drop_down_list() {

    }

    @Then("^Enter parameters at Search block$")
    public void enter_parameters_at_Search_block(DataTable arg1) {

    }

    @When("^Click Search button tenth test$")
    public void click_res_tenth() {

    }

    @Then("^Check for results for Tenth Test$")
    public void check_for_results_for_Test() {

    }

}
