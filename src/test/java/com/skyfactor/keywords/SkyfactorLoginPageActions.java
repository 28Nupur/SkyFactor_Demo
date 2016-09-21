package com.skyfactor.keywords;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class SkyfactorLoginPageActions extends GetPage{

	public SkyfactorLoginPageActions(WebDriver driver) {
		super(driver, "SkyfactorLoginPage");
	}
	
	public void verifyUserIsOnskyfactorLoginPage(){
		isElementDisplayed("inp_password");
		isElementDisplayed("inp_username");
		logMessage("User is on login page");
	}
	

	public void enterCredentialsOnSignInForm(String username, String password) {
		wait.waitForPageToLoadCompletely();
		element("inp_username").clear();
		element("inp_username").sendKeys(username);
		element("inp_password").clear();
		element("inp_password").sendKeys(password);
		logMessage("User has entered credentials for the user '"+username+"'");
	}
	
	public void hitGoButton(){
		element("btn_go").click();
		logMessage("User clicked on submit button");
	}
}
