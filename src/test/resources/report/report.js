$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Multitrip.feature");
formatter.feature({
  "name": "Title of the project SkyTransAirlineProject",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "open a skyairline webpage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "click mutitrip page",
  "keyword": "Given "
});
formatter.match({
  "location": "multitripsteps.click_mutitrip_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usershould in select a arrival place",
  "keyword": "And "
});
formatter.match({
  "location": "multitripsteps.usershould_in_select_a_arrival_place()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usershould in select depature place",
  "keyword": "When "
});
formatter.match({
  "location": "multitripsteps.usershould_in_select_depature_place()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usershould in select a date",
  "keyword": "And "
});
formatter.match({
  "location": "multitripsteps.usershould_in_select_a_date()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.multitripsteps.usershould_in_select_a_date(multitripsteps.java:222)\r\n\tat ✽.usershould in select a date(src/test/resources/Features/Multitrip.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "multitripsteps.i_validate_the_outcomes()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "check more outcomes",
  "keyword": "And "
});
formatter.match({
  "location": "multitripsteps.check_more_outcomes()"
});
formatter.result({
  "status": "skipped"
});
});