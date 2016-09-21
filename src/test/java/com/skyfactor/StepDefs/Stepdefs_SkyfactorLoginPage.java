package com.skyfactor.StepDefs;


import com.qait.automation.TestSessionInitiator;
import com.qait.automation.utils.YamlReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs_SkyfactorLoginPage {
	
	TestSessionInitiator test = CucumberHooks.test;
	
	@Given("^I am on skyfactor login page$")
	public void I_am_on_Service_now_login_Page(){
		test.skyfactorLoginPage.verifyUserIsOnskyfactorLoginPage();
		
	}
	
	@When("^I login into the application with valid credentials$")
	public void I_enter_valid_username_and_password(){
		test.skyfactorLoginPage.enterCredentialsOnSignInForm(YamlReader.getYamlValue("loginPage.validUsername"),
				YamlReader.getYamlValue("loginPage.validPassword"));
		test.skyfactorLoginPage.hitGoButton();
	}
	
	@Then("I land on overview page")
	public void verify_user_is_on_overview_page()
	{
		test.skyfactorHomePage.verifyUserIsOnHomePage();
	}

}
