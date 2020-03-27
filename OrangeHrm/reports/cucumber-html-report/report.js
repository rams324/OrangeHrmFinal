$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/hp/Downloads/845070/OrangeHrm/src/main/resources/features/OrangeFeatures.feature");
formatter.feature({
  "line": 2,
  "name": "OrangeHRM Website",
  "description": "",
  "id": "orangehrm-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Orangehrm_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Log in to OrangeHRM with valid Cradentials",
  "description": "",
  "id": "orangehrm-website;log-in-to-orangehrm-with-valid-cradentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enter the username and password with valid data",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginValidstep.user_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 14540790200,
  "status": "passed"
});
formatter.match({
  "location": "LoginValidstep.user_enter_the_username_and_password_with_valid_data()"
});
formatter.result({
  "duration": 790991600,
  "status": "passed"
});
formatter.match({
  "location": "LoginValidstep.user_click_the_Login_button()"
});
formatter.result({
  "duration": 5163329200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Log in to OrangeHRM with invalid Cradentials",
  "description": "",
  "id": "orangehrm-website;log-in-to-orangehrm-with-invalid-cradentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@tc_02"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "the user launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user enter the username and password with invalid data",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the user click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginInvalidStep.the_user_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 14243602500,
  "status": "passed"
});
formatter.match({
  "location": "LoginInvalidStep.user_enter_the_username_and_password_with_invalid_data()"
});
formatter.result({
  "duration": 227778700,
  "status": "passed"
});
formatter.match({
  "location": "LoginInvalidStep.the_user_click_the_Login_button()"
});
formatter.result({
  "duration": 1392155200,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "To check if the dashboard page is present when user log into the website",
  "description": "",
  "id": "orangehrm-website;to-check-if-the-dashboard-page-is-present-when-user-log-into-the-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@tc_03"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user launch the Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "the user enter the username and password with valid data",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "take the screenshot of the dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "DashBoradStep.user_launch_the_Chrome_browser()"
});
formatter.result({
  "duration": 14016689700,
  "status": "passed"
});
formatter.match({
  "location": "DashBoradStep.the_user_enter_the_username_and_password_with_valid_data()"
});
formatter.result({
  "duration": 4530264100,
  "status": "passed"
});
formatter.match({
  "location": "DashBoradStep.take_the_screenshot_of_the_dashboard_page()"
});
formatter.result({
  "duration": 441020100,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "To check the footer of the dash borad contains OrangeHRM",
  "description": "",
  "id": "orangehrm-website;to-check-the-footer-of-the-dash-borad-contains-orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@tc_04"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user Launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "User enter the username and password with valid data",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User click the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "compare the footer content",
  "keyword": "Then "
});
formatter.match({
  "location": "FooterStep.user_Launch_the_chrome_browser()"
});
formatter.result({
  "duration": 13733381400,
  "status": "passed"
});
formatter.match({
  "location": "FooterStep.user_enter_the_username_and_password_with_valid_data()"
});
formatter.result({
  "duration": 157408700,
  "status": "passed"
});
formatter.match({
  "location": "FooterStep.user_click_the_Login_button()"
});
formatter.result({
  "duration": 5223848500,
  "status": "passed"
});
formatter.match({
  "location": "FooterStep.compare_the_footer_content()"
});
formatter.result({
  "duration": 34355600,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Leave link is working in properly or not in the dashborad page",
  "description": "",
  "id": "orangehrm-website;leave-link-is-working-in-properly-or-not-in-the-dashborad-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@tc_05"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "user launch the chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "user enter the username and password with Valid data",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "user click the Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user click Leave link in the dash borad page",
  "keyword": "Then "
});
formatter.match({
  "location": "LinkStep.user_launch_the_chrome_Browser()"
});
formatter.result({
  "duration": 15460426400,
  "status": "passed"
});
formatter.match({
  "location": "LinkStep.user_enter_the_username_and_password_with_Valid_data()"
});
formatter.result({
  "duration": 157815400,
  "status": "passed"
});
formatter.match({
  "location": "LinkStep.user_click_the_Login_Button()"
});
formatter.result({
  "duration": 5274064000,
  "status": "passed"
});
formatter.match({
  "location": "LinkStep.user_click_Leave_link_in_the_dash_borad_page()"
});
formatter.result({
  "duration": 2126059100,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "LogOut the application",
  "description": "",
  "id": "orangehrm-website;logout-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@tc_06"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "user launch the Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "user open the orangehrm login Page",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "user enter the username and password with valid Data",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "user click on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user click the logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "LogOutStep.user_launch_the_Chrome_Browser()"
});
formatter.result({
  "duration": 15238060000,
  "status": "passed"
});
formatter.match({
  "location": "LogOutStep.user_open_the_orangehrm_login_Page()"
});
formatter.result({
  "duration": 30400,
  "status": "passed"
});
formatter.match({
  "location": "LogOutStep.user_enter_the_username_and_password_with_valid_Data()"
});
formatter.result({
  "duration": 167199000,
  "status": "passed"
});
formatter.match({
  "location": "LogOutStep.user_click_on_the_Login_button()"
});
formatter.result({
  "duration": 4682538000,
  "status": "passed"
});
formatter.match({
  "location": "LogOutStep.user_click_the_logout_button()"
});
formatter.result({
  "duration": 251633000,
  "status": "passed"
});
});