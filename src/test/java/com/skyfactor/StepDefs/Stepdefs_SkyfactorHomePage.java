package com.skyfactor.StepDefs;

import com.qait.automation.TestSessionInitiator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs_SkyfactorHomePage {
	TestSessionInitiator test = CucumberHooks.test;
	
	@Given("I am on overview page")
	public void verify_user_is_on_overview_page()
	{
		test.skyfactorHomePage.verifyUserIsOnHomePage();
	}
	
	@When("I click on Static Lists tab")
	public void click_on_static_list_tab()
	{
		test.skyfactorHomePage.clickOnStaticListsTab();
	}
	
	}
