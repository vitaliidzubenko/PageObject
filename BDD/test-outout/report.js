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
  "name": "Verify bug for First Test",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.get_the_Home_Page()"
});
formatter.result({
  "duration": 1183062664,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_Enter_cabinet()"
});
formatter.result({
  "duration": 18311915,
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
  "name": "Verify result for Second Test",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.get_the_Home_Page()"
});
formatter.result({
  "duration": 147753,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.at_Search_Form_enter_parameters()"
});
formatter.result({
  "duration": 340148,
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
  "name": "Verify result for Third Test",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.get_the_Home_Page()"
});
formatter.result({
  "duration": 108247,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_Advanced_Search_button_at_Search_Field()"
});
formatter.result({
  "duration": 311308,
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
  "name": "Verify result for Fourth Test",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberTests.get_the_Home_Page()"
});
formatter.result({
  "duration": 136296,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_at_header_s_link_New_cars()"
});
formatter.result({
  "duration": 313679,
  "error_message": "java.lang.NullPointerException\r\n\tat RiaTests.MainPageRia.clickNewCarsHeader(MainPageRia.java:95)\r\n\tat BDDTests.CucumberTests.click_at_header_s_link_New_cars(CucumberTests.java:123)\r\n\tat ✽.When Click at header’s link New cars(RiaUI.feature:32)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CucumberTests.choose_Chevrolet_brand_at_Catalog_of_new_cars()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.choose_Suburban_model_at_Lineup_block()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_at_the_image()"
});
formatter.result({
  "status": "skipped"
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
  "name": "Enter parameters in search block and submit it",
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
  "name": "Click at the first element at the list",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "Verify result for Fifth Test",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.search_Form_enter_parameter()"
});
formatter.result({
  "duration": 1469236,
  "error_message": "java.lang.NullPointerException\r\n\tat RiaTests.MainPageRia.fillRegion(MainPageRia.java:66)\r\n\tat BDDTests.CucumberTests.search_Form_enter_parameter(CucumberTests.java:157)\r\n\tat ✽.When Search Form enter parameter(RiaUI.feature:40)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CucumberTests.click_on_Special_equipment_at_types_of_vehicles_block()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.choose_Bulldozer_at_drop_down_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.enter_parameters_in_search_block(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_at_the_first_element_at_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_Search_tt()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 49,
  "name": "№6 Searching Service station from Home Page header’s menu",
  "description": "",
  "id": ":-testing-ui-autoria;№6-searching-service-station-from-home-page-header’s-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 50,
  "name": "Hover and click the link All for cars",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "Enter parameters at search field and submit it",
  "rows": [
    {
      "cells": [
        "Vinnitsa"
      ],
      "line": 52
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "Click on tick Official at options block and submit it",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "Click on Show the phone of first element at the list",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "Verify the phone is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.hover_the_link_All_for_cars()"
});
formatter.result({
  "duration": 15269528707,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //li[@class\u003d \u0027nav-list_item has-dropdown\u0027] (tried for 10 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat RiaTests.MainPageRia.hoverClickCars(MainPageRia.java:114)\r\n\tat BDDTests.CucumberTests.hover_the_link_All_for_cars(CucumberTests.java:190)\r\n\tat ✽.When Hover and click the link All for cars(RiaUI.feature:50)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //li[@class\u003d \u0027nav-list_item has-dropdown\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-TT2TUFE\u0027, ip: \u0027192.168.31.198\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:206)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:202)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat RiaTests.MainPageRia.hoverClickCars(MainPageRia.java:114)\r\n\tat BDDTests.CucumberTests.hover_the_link_All_for_cars(CucumberTests.java:190)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CucumberTests.enter_parameters_at_search_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_on_tick_Official_at_options_block()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_on_Show_the_phone_of_first_element_at_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.copy_the_phone_to_clipboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 57,
  "name": "№7 Asking questions from footer menu Any questions?",
  "description": "",
  "id": ":-testing-ui-autoria;№7-asking-questions-from-footer-menu-any-questions?",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 58,
  "name": "Scroll down the page to the end, Click at link questions",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "Enter How to register at input search field and submit it",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "Click at second link of the list",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "Verify result for Seventh Test",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.scroll_down_the_page_to_the_end()"
});
formatter.result({
  "duration": 13051290905,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-TT2TUFE\u0027, ip: \u0027192.168.31.198\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Rogmax\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: b914d660516856d4b80d437ac74e710b\n*** Element info: {Using\u003dxpath, value\u003d//div[@class \u003d \u0027support-app-footer\u0027]//a[@class \u003d \u0027button button-primary\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:346)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:425)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:307)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:206)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:202)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat RiaTests.MainPageRia.clickQuestionsFooter(MainPageRia.java:124)\r\n\tat BDDTests.CucumberTests.scroll_down_the_page_to_the_end(CucumberTests.java:218)\r\n\tat ✽.When Scroll down the page to the end, Click at link questions(RiaUI.feature:58)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CucumberTests.enter_How_to_register_at_input_search_filed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_at_nd_link_of_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.res_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 63,
  "name": "№8 Checking other sites of Ria company, using headers menu",
  "description": "",
  "id": ":-testing-ui-autoria;№8-checking-other-sites-of-ria-company,-using-headers-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 64,
  "name": "Click at link Ria.com at headers menu",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "Check the address of URL Ria, Get back to Main page",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "Click at link Realty at headers menu",
  "keyword": "When "
});
formatter.step({
  "line": 67,
  "name": "Check the address of URL Realty, Get back to Main page",
  "keyword": "Then "
});
formatter.step({
  "line": 68,
  "name": "Click at link Car goods at headers menu",
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "Check the address of URL Car goods, Get back to Main page",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "Click at link Auto parts at headers menu",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "Check the address of URL Auto parts, Get back to Main page",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "Verify that the last website is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberTests.click_at_link_Ria_com_at_headers_menu()"
});
formatter.result({
  "duration": 6069863562,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-TT2TUFE\u0027, ip: \u0027192.168.31.198\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Rogmax\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: b914d660516856d4b80d437ac74e710b\n*** Element info: {Using\u003dxpath, value\u003d//nav[@class \u003d \u0027nav-head\u0027]//a[text() \u003d \u0027RIA.com\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:346)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:425)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:307)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:206)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:202)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat RiaTests.MainPageRia.clickRiaCom(MainPageRia.java:142)\r\n\tat BDDTests.CucumberTests.click_at_link_Ria_com_at_headers_menu(CucumberTests.java:246)\r\n\tat ✽.When Click at link Ria.com at headers menu(RiaUI.feature:64)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CucumberTests.check_the_address_of_URL_copy_it()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_at_link_Realty_at_headers_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.check_the_address_of_URL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_at_link_Car_goods_at_headers_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.check_the_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.click_at_link_Auto_parts_at_headers_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.check_the_add()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTests.verify_last()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 74,
  "name": "№9 Searching Car from abroad",
  "description": "",
  "id": ":-testing-ui-autoria;№9-searching-car-from-abroad",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 75,
  "name": "Scroll down to click the Car from abroad",
  "keyword": "When "
});
formatter.step({
  "line": 76,
  "name": "Scroll down to Click at link Cars from Lithuania",
  "keyword": "Then "
});
formatter.step({
  "line": 77,
  "name": "At the left filters panel enter parameters and submit it",
  "rows": [
    {
      "cells": [
        "Passenger car"
      ],
      "line": 78
    },
    {
      "cells": [
        "BMW"
      ],
      "line": 79
    },
    {
      "cells": [
        "X5M"
      ],
      "line": 80
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 81,
  "name": "Click at one of filtered results",
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "Verify result for Nineth Test",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberTests.scroll_down_to_see_the_Auto_ria_recommends_you()"
});
