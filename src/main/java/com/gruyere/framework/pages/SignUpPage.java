package com.gruyere.framework.pages;

import java.util.Date;
import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import com.gruyere.framework.elements.SignUpElements;
import com.gruyere.framework.utils.BrowserDriver;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public class SignUpPage {

	private static final Logger LOGGER = Logger.getLogger(SignUpPage.class.getName());
	private static final SignUpElements signUpElements = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SignUpElements.class);


	/**
	 * Generates a new username and signs up
	 */
	public static void signUp(){
		String generatedUsername = "Tester_" + new Date().getTime();
		signUp(generatedUsername, "test");
	}

	public static void signUp(String username, String password){
		setUsername(username);
		setPassword(password);
		clickSignUpButton();
	}

	public static void setUsername(String username){
		LOGGER.info("Set username to " + username);
		signUpElements.usernameField.sendKeys(username);
	}

	public static void setPassword(String password){
		LOGGER.info("Set password to " + password);
		signUpElements.passwordField.sendKeys(password);
	}

	public static void clickSignUpButton(){
		LOGGER.info("Click 'Sign Up'");
		signUpElements.signUpButton.click();
	}

	public static boolean isDisplayed_AccountCreated(){
		LOGGER.info("Checking sign up message displayed");
		return signUpElements.accountCreatedMessage.isDisplayed();
	}
}
