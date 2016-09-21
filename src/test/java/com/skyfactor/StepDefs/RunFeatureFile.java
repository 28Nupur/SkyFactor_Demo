package com.skyfactor.StepDefs;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.qait.automation.TestSessionInitiator;
import com.skyfactor.test.ExtendedCucumberRunner;

import cucumber.api.CucumberOptions;

@CucumberOptions(plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json",
		"pretty:target/cucumber-pretty.txt",
		"usage:target/cucumber-usage.json" }, features = "src/test/resources/features")

@RunWith(ExtendedCucumberRunner.class)
public class RunFeatureFile {
	
//	@BeforeClass
//	public static void tearUp()
//	{
//		if(CucumberHooks.test==null)
//			CucumberHooks.test = new TestSessionInitiator(scenario.getName());
//	}
//	
	@AfterClass
	public static void tearDown()
	{
		CucumberHooks.test.closeBrowserSession();
	}
}