package com.skyfactor.StepDefs;

import com.qait.automation.TestSessionInitiator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs_SkyfactorStaticListsPage {
	TestSessionInitiator test = CucumberHooks.test;
	
	@Then("I see Static Lists page")
	public void verify_static_list_page()
	{
		test.skyfactorStaticListsPage.verifyStaticListsPage();
	}
	
	@When("I click on Create New List button on static lists page")
	public void click_create_new_list_button()
	{
		test.skyfactorStaticListsPage.clickCreateNewListButton();
	}
	
	@Then("I see create a new list modal window")
	public void verify_new_list_modal_window()
	{
		test.skyfactorStaticListsPage.verifyCreateNewListModalWindow();
	}
	
	@When("I enter text TestUser in name textbox")
	public void enter_text_in_name_textbox()
	{
		test.skyfactorStaticListsPage.typeNewStaticLisName("TestUser");
	}
	
	@When("I enter text ABCDE in description textbox")
	public void enter_text_in_description()
	{
		test.skyfactorStaticListsPage.typeNewStaticListDescription("ABCDE");
	}
	
	@When("I click Create List button in create a new list modal window")
	public void click_create_list_button()
	{
		test.skyfactorStaticListsPage.clickCreateListButtonInModalWindow();
	}
	
	@Then("I see TestUser static list in static list table")
	public void verify_newly_created_static_list()
	{
		test.skyfactorStaticListsPage.verifyNewlyCreatedStaticList("TestUser");
	}
	
	@Given("^I am on Static list page$")
	public void verify_user_is_on_Static_Page(){
		test.skyfactorStaticListsPage.verifyStaticListsPage();
		
	}	
	
	@When("I delete Static List")
	public void click_delete_static_list()
	{
		test.skyfactorStaticListsPage.verifyNewlyCreatedStaticListIsDeleted("TestUser");
	}
	
	@Then("I am not able to view TestUser static list on static list page")
	public void verify_staticList_is_deleted(){
		test.skyfactorStaticListsPage.verifyNewlyCreatedIsNotDisplaying("TestUser");
	}

}
