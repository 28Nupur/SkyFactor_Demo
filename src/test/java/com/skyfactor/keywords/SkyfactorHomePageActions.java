package com.skyfactor.keywords;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class SkyfactorHomePageActions extends GetPage{

	private String searchTerm = null;
	public SkyfactorHomePageActions(WebDriver driver) {
		super(driver, "SkyfactorHomePage");
	}
	
	public void verifyUserIsOnHomePage(){
		wait.waitForPageToLoadCompletely();
		isElementDisplayed("lnk_setUp", "Set Up");
		logMessage("User is on Overview page");
	}
	
	public void clickOnStaticListsTab() {
		element("lnk_setUp", "Static Lists").click();
		logMessage("clicked on static lists tab");
	}
}
