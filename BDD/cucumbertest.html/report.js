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
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click Enter with Google",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter \u0027test.for.ria@gmail.com\u0027 and \u0027test.for.ria123\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify bug for First Test",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTests.get_the_Home_Page()"
});
formatter.result({
  "duration": 10158137812,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_Enter_cabinet()"
});
formatter.result({
  "duration": 2437556299,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_Register()"
});
