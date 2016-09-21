package com.skyfactor.keywords;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

import org.junit.Assert;

public class SkyfactorStaticListsPageActions extends GetPage{
	
	public SkyfactorStaticListsPageActions(WebDriver driver) {
		super(driver, "SkyfactorStaticListsPage");
	}

	public void verifyStaticListsPage() {
		Assert.assertTrue(isElementDisplayed("lnk_setUp", "Static Lists"));
		logMessage("User is navigated to static list");
	}

	public void clickCreateNewListButton() {
		element("createNewListBtn").click();
		logMessage("Clicked on create new list button");
	}
	
	public void verifyCreateNewListModalWindow() {
		isElementDisplayed("Modalwin");
		logMessage("create new list modal window is displayed");
	}

	public void typeNewStaticLisName(String string) {
		element("NameField").sendKeys(string);
		logMessage("name entered is " + string);
	}

	public void typeNewStaticListDescription(String string) {
		element("DescField").sendKeys(string);
		logMessage("description entered is " + string);
	}

	public void clickCreateListButtonInModalWindow() {
		element("CreateListBtn").click();
		wait.waitForElementToBeVisible(element("successMsg"));
		logMessage("clicked on create list button");
	}

	public void verifyNewlyCreatedStaticList(String string) {
		driver.navigate().refresh();
		wait.waitForPageToLoadCompletely();
		isElementDisplayed("nameInList", string);
		logMessage("newly created list is displayed");
	}
	public void verifyNewlyCreatedStaticListIsDeleted(String string) {
		isElementDisplayed("RemoveList", string);
		element("RemoveList", string).click();
		isElementDisplayed("Modalwin");
		isElementDisplayed("DeleteButton");
		element("DeleteButton").click();
		wait.waitForElementToBeVisible(element("successMsg"));		
		logMessage("newly created list is deleted");
	}
	
	public void verifyNewlyCreatedIsNotDisplaying(String string) {
		driver.navigate().refresh();
		wait.waitForPageToLoadCompletely();
		isElementNotDisplayed("nameInList", string);
	}
	
}
