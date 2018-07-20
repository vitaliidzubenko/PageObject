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
  "duration": 9963595400,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_Enter_cabinet()"
});
formatter.result({
  "duration": 8019945513,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_Register()"
});
formatter.result({
  "duration": 15717966962,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.click_Enter_with_Google()"
});
formatter.result({
  "duration": 5307628338,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTests.enter_email_and_password(DataTable)"
});
