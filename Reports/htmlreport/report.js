$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/Login.feature");
formatter.feature({
  "name": "",
  "description": "  To Validate Login Functionality of Facebook Application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have enter facebook login page through edge browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_enter_facebook_login_page_through_edge_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "   To Validate Login using invalid username and invalid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User enter invalid username and invalid password",
  "rows": [
    {
      "cells": [
        "rajavivek667@gmail.com",
        "vivek143",
        "vivenith143@gmail.com",
        "nithya143"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_invalid_username_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have enter facebook login page through edge browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_enter_facebook_login_page_through_edge_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "   To Validate Login using valid username and invalid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User enter valid username and invalid password",
  "rows": [
    {
      "cells": [
        "selenium",
        "selenium12@gmil.com",
        "selenium12"
      ]
    },
    {
      "cells": [
        "python",
        "python@11566@gmail.com",
        "puthon90"
      ]
    },
    {
      "cells": [
        "vivek",
        "vivenith143@gmail.com",
        "viveknithya143"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_valid_username_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
});