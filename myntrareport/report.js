$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login.feature");
formatter.feature({
  "name": "To Validate the login functonilty of myntra application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "User has to login the myntra page using invalid mobile number",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberTest.userHasToLaunchTheBrowserAndMaximizeTheWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to launch the url",
  "keyword": "When "
});
formatter.match({
  "location": "CucumberTest.userHasToLaunchTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the profile button",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberTest.userHitTheProfileButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberTest.toClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the mobile number in mobile field",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberTest.userHasToPassTheMobileNumberInMobileField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberTest.userHasToClickTheContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTest.closeTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/icici.feature");
formatter.feature({
  "name": "To validate login functiolity of icici login page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To login to the icici applicaton",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "IciciLogin.toLaunchTheBrowserAndMaximizeTheWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url",
  "keyword": "When "
});
formatter.match({
  "location": "IciciLogin.toLaunchTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the loggin button",
  "keyword": "And "
});
formatter.match({
  "location": "IciciLogin.toClickTheLogginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the user id",
  "keyword": "And "
});
formatter.match({
  "location": "IciciLogin.toPassTheUserId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the password",
  "keyword": "And "
});
formatter.match({
  "location": "IciciLogin.toPassThePassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "IciciLogin.toCloseTheBrowser()"
});
formatter.result({
  "status": "passed"
});
});