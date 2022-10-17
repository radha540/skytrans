package org.runner;
import org.junit.runner.RunWith;
import org.junit.AfterClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition",dryRun=false,tags={"@smoke"},
plugin= {"pretty",
"json:src\\test\\resources\\report\\JsonReport\\jsonreport.json",
"html:src\\test\\resources\\report",
"junit:src\\test\\resources\\report\\JunitReport\\report.xml"})
public class TestRunner {
@AfterClass
public static void report() {
	JVMReport.genarateJVMReport("src\\test\\resources\\report\\JsonReport\\jsonreport.json");
     System.out.println("----done----");
}
}
 