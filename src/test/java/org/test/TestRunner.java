package org.test;

import org.junit.After;
import org.junit.runner.RunWith;
import org.stepdefinition.jvmreport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",glue="org.stepdefinition",dryRun=false, strict=true,
plugin= {"html:C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\Reports\\htmlreport", 
		"json:C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\Reports\\jsonreport\\fb.json",
"junit:C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\Reports\\junitreportface.xml"})
public class TestRunner {
	
	
	@After 
	public static void report() {
		
jvmreport.generatejvmreport("C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\Reports\\jsonreport\\fb.json");

	}
	
	
	

}
