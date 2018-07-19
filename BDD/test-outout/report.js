$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RiaUI.feature");
formatter.feature({
  "line": 1,
  "name": ": Testing UI AutoRia",
  "description": "",
  "id": ":-testing-ui-autoria",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "№1 Registration",
  "description": "",
  "id": ":-testing-ui-autoria;№1-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Get the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click Enter cabinet",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click Register",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click Enter with Google",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter email and password",
  "rows": [
    {
      "cells": [
        "test.for.ria@gmail.com"
      ],
      "line": 9
    },
    {
      "cells": [
        "test.for.ria123"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "See bug for First Test",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.get_the_Home_Page()"
});
formatter.result({
  "duration": 1088743577,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_Enter_cabinet()"
});
formatter.result({
  "duration": 14792308,
  "error_message": "java.lang.NullPointerException\r\n\tat RiaTests.MainPageRia.clickCabinet(MainPageRia.java:45)\r\n\tat BDDTests.CucumberTests.click_Enter_cabinet(CucumberTests.java:35)\r\n\tat ✽.When Click Enter cabinet(RiaUI.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CucumberTests.click_Register()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_Enter_with_Google()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.enter_email_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.see_bug_for_Test()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "№2 Default search by Search Field at Home Page",
  "description": "",
  "id": ":-testing-ui-autoria;№2-default-search-by-search-field-at-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Get the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "At Search Form enter parameters",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Click Search button second test",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click at fifth result on page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "See result for Second Test",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.get_the_Home_Page()"
});
formatter.result({
  "duration": 195161,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.at_Search_Form_enter_parameters()"
});
formatter.result({
  "duration": 342519,
  "error_message": "java.lang.NullPointerException\r\n\tat RiaTests.MainPageRia.fillBrand(MainPageRia.java:52)\r\n\tat BDDTests.CucumberTests.at_Search_Form_enter_parameters(CucumberTests.java:64)\r\n\tat ✽.When At Search Form enter parameters(RiaUI.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CucumberTests.click_Search()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_at_fifth_result_on_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.see_result_for_Test()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "№3 Extended search from Home Page",
  "description": "",
  "id": ":-testing-ui-autoria;№3-extended-search-from-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "Get the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Click Advanced Search button at Search Field",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "At Advanced Search Form enter detailed parameters",
  "rows": [
    {
      "cells": [
        "2010"
      ],
      "line": 24
    },
    {
      "cells": [
        "2015"
      ],
      "line": 25
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click Search button third test",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Click at First result on page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "See result for Third Test",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.get_the_Home_Page()"
});
formatter.result({
  "duration": 139852,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_Advanced_Search_button_at_Search_Field()"
});
formatter.result({
  "duration": 284445,
  "error_message": "java.lang.NullPointerException\r\n\tat RiaTests.MainPageRia.clickExtendedSearch(MainPageRia.java:89)\r\n\tat BDDTests.CucumberTests.click_Advanced_Search_button_at_Search_Field(CucumberTests.java:90)\r\n\tat ✽.When Click Advanced Search button at Search Field(RiaUI.feature:22)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CucumberTests.at_Advanced_Search_Form_enter_detailed_parameters(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_Search_butt()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_at_First_result_on_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.see_result()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 30,
  "name": "№4 New car Search",
  "description": "",
  "id": ":-testing-ui-autoria;№4-new-car-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "Get the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "Click at header’s link New cars",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Choose Chevrolet brand at Catalog of new cars",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Choose Suburban model at Lineup block",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Click at the image",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Click at Offers, where to buy",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "See result for Fourth Test",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberTests.get_the_Home_Page()"
});
formatter.result({
  "duration": 135111,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_at_header_s_link_New_cars()"
});
formatter.result({
  "duration": 24889,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.choose_Chevrolet_brand_at_Catalog_of_new_cars()"
});
formatter.result({
  "duration": 25284,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.choose_Suburban_model_at_Lineup_block()"
});
formatter.result({
  "duration": 19358,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_at_the_image(int,int)"
});
formatter.result({
  "duration": 698865,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027BDDTests.CucumberTests.click_at_the_image(int,int) in file:/C:/SeleniumTests/BDD/target/test-classes/\u0027 with pattern [^Click at the image$] is declared with 2 parameters. However, the gherkin step has 0 arguments []. \nStep: When Click at the image\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CucumberTests.click_at_Offers_where_to_buy()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_Search_btt()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 39,
  "name": "№5 Searching Bulldozer with search adjustment",
  "description": "",
  "id": ":-testing-ui-autoria;№5-searching-bulldozer-with-search-adjustment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "Search Form enter parameter",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Click on Special equipment at types of vehicles block",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Choose Bulldozer at drop down list",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Enter parameters in search block",
  "rows": [
    {
      "cells": [
        "40000"
      ],
      "line": 44
    },
    {
      "cells": [
        "70000"
      ],
      "line": 45
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Click Search button fifth test",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "Click at the first element at the list",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "See result for Fifth Test",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberTests.search_Form_enter_parameter()"
});
formatter.result({
  "duration": 149334,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_on_Special_equipment_at_types_of_vehicles_block()"
});
formatter.result({
  "duration": 21728,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.choose_Bulldozer_at_drop_down_list()"
});
formatter.result({
  "duration": 15803,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.enter_parameters_in_search_block(DataTable)"
});
formatter.result({
  "duration": 1441187,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_Search_b()"
});
formatter.result({
  "duration": 42667,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_at_the_first_element_at_the_list()"
});
formatter.result({
  "duration": 21728,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_Search_tt()"
});
formatter.result({
  "duration": 24889,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "№6 Searching Service station from Home Page header’s menu",
  "description": "",
  "id": ":-testing-ui-autoria;№6-searching-service-station-from-home-page-header’s-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 51,
  "name": "Hover the link All for cars",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "Click at drop down list at link Service station catalog",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "Enter parameters at search field",
  "rows": [
    {
      "cells": [
        "Vinnitsa"
      ],
      "line": 54
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "Click Search button sixth test",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Click on tick Official at options block",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "Click Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Click on Show the phone of first element at the list",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "Copy the phone to clipboard",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.hover_the_link_All_for_cars()"
});
formatter.result({
  "duration": 160000,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_at_drop_down_list_at_link_Service_station_catalog()"
});
formatter.result({
  "duration": 15012,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.enter_parameters_at_search_field(DataTable)"
});
formatter.result({
  "duration": 22914,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_Search_button()"
});
formatter.result({
  "duration": 9481,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_on_tick_Official_at_options_block()"
});
formatter.result({
  "duration": 9481,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_S_button()"
});
formatter.result({
  "duration": 9086,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_on_Show_the_phone_of_first_element_at_the_list()"
});
formatter.result({
  "duration": 10667,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.copy_the_phone_to_clipboard()"
});
formatter.result({
  "duration": 10667,
  "status": "passed"
});
formatter.scenario({
  "line": 61,
  "name": "№7 Asking questions from footer menu Any questions?",
  "description": "",
  "id": ":-testing-ui-autoria;№7-asking-questions-from-footer-menu-any-questions?",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 62,
  "name": "Scroll down the page to the end",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "Click at link Any questions?",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "Enter How to register at input search field",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "Click Search button seventh test",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "Click at second link of the list",
  "keyword": "When "
});
formatter.step({
  "line": 67,
  "name": "See result for Seventh Test",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.scroll_down_the_page_to_the_end()"
});
formatter.result({
  "duration": 350815,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_at_link_Any_questions()"
});
formatter.result({
  "duration": 26074,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.enter_How_to_register_at_input_search_filed()"
});
formatter.result({
  "duration": 19358,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_s_butt()"
});
formatter.result({
  "duration": 21728,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_at_nd_link_of_the_list(int)"
});
formatter.result({
  "duration": 304988,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027BDDTests.CucumberTests.click_at_nd_link_of_the_list(int) in file:/C:/SeleniumTests/BDD/target/test-classes/\u0027 with pattern [^Click at second link of the list$] is declared with 1 parameters. However, the gherkin step has 0 arguments []. \nStep: When Click at second link of the list\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CucumberTests.res_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 69,
  "name": "№8 Checking other sites of Ria company, using headers menu",
  "description": "",
  "id": ":-testing-ui-autoria;№8-checking-other-sites-of-ria-company,-using-headers-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 70,
  "name": "Click at link Ria.com at headers menu",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "Check the address of URL Ria, copy it",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "Get back to the Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "Click at link Realty at headers menu",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "Check the address of URL Realty, copy it",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "Get back to Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Click at link Car goods at headers menu",
  "keyword": "When "
});
formatter.step({
  "line": 77,
  "name": "Check the address of URL Car goods, copy it",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "Get back to Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "Click at link Auto parts at headers menu",
  "keyword": "When "
});
formatter.step({
  "line": 80,
  "name": "Check the address of URL Auto parts, copy it",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.click_at_link_Ria_com_at_headers_menu()"
});
formatter.result({
  "duration": 185679,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.check_the_address_of_URL_copy_it()"
});
formatter.result({
  "duration": 140642,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.get_back_to_the_Home_Page()"
});
formatter.result({
  "duration": 19753,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_at_link_Realty_at_headers_menu()"
});
formatter.result({
  "duration": 13432,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.check_the_address_of_URL()"
});
formatter.result({
  "duration": 302617,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.get_back_to_Home_Page()"
});
formatter.result({
  "duration": 23703,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_at_link_Car_goods_at_headers_menu()"
});
formatter.result({
  "duration": 16198,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.check_the_address()"
});
formatter.result({
  "duration": 249284,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.get_back_to_Home_Page()"
});
formatter.result({
  "duration": 14617,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_at_link_Auto_parts_at_headers_menu()"
});
formatter.result({
  "duration": 17778,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.check_the_add()"
});
formatter.result({
  "duration": 19753,
  "status": "passed"
});
formatter.scenario({
  "line": 82,
  "name": "№9 Searching Car from abroad",
  "description": "",
  "id": ":-testing-ui-autoria;№9-searching-car-from-abroad",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 83,
  "name": "Scroll down to see the AutoRia recommends you",
  "keyword": "When "
});
formatter.step({
  "line": 84,
  "name": "Click at link Car from abroad",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "Scroll down to see the block Cars from Europe",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "Click at link Cars from Lithuania",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "At the left filters panel enter parameters:",
  "rows": [
    {
      "cells": [
        "Passenger car"
      ],
      "line": 88
    },
    {
      "cells": [
        "BMW"
      ],
      "line": 89
    },
    {
      "cells": [
        "X5M"
      ],
      "line": 90
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 91,
  "name": "Scroll down to see filtered results",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "See result for Nineth Test",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberTests.scroll_down_to_see_the_Auto_ria_recommends_you()"
});
formatter.result({
  "duration": 118123,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_at_link_Car_from_abroad()"
});
formatter.result({
  "duration": 15013,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.scroll_down_to_see_the_block_Cars_from_Europe()"
});
formatter.result({
  "duration": 15012,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_at_link_Cars_from_Lithuania()"
});
formatter.result({
  "duration": 26469,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.at_the_left_filters_panel_enter_parameters(DataTable)"
});
formatter.result({
  "duration": 42272,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.scroll_down_to_see_filtered_results()"
});
formatter.result({
  "duration": 15407,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.see_results()"
});
formatter.result({
  "duration": 18568,
  "status": "passed"
});
formatter.scenario({
  "line": 94,
  "name": "№10 Searching car with some parameters, then changing parameters for other car type",
  "description": "",
  "id": ":-testing-ui-autoria;№10-searching-car-with-some-parameters,-then-changing-parameters-for-other-car-type",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 95,
  "name": "Click at Tractor car at types of vehicle block",
  "keyword": "When "
});
formatter.step({
  "line": 96,
  "name": "Choose a Tank type from drop down list",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "Enter parameters at Search block",
  "rows": [
    {
      "cells": [
        "MAN"
      ],
      "line": 98
    },
    {
      "cells": [
        "2015"
      ],
      "line": 99
    },
    {
      "cells": [
        "2018"
      ],
      "line": 100
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 101,
  "name": "Click Search button tenth test",
  "keyword": "When "
});
formatter.step({
  "line": 102,
  "name": "Check for results for Tenth Test",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.click_at_Tractor_car_at_types_of_vehicle_block()"
});
formatter.result({
  "duration": 111408,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.choose_a_Tank_type_from_drop_down_list()"
});
formatter.result({
  "duration": 14222,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.enter_parameters_at_Search_block(DataTable)"
});
formatter.result({
  "duration": 22518,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_res_tenth()"
});
formatter.result({
  "duration": 9876,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.check_for_results_for_Test()"
});
formatter.result({
  "duration": 19358,
  "status": "passed"
});
});