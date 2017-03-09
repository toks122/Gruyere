package com.gruyere.framework.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */

public class SignUpElements {

	@FindBy(how = How.NAME, using = "uid")
	public WebElement usernameField;

	@FindBy(how = How.NAME, using = "pw")
	public WebElement passwordField;

	@FindBy(how = How.CSS, using = "input[type=submit]")
	public WebElement signUpButton;

	@FindBy(how = How.XPATH, using = ".//div[@class='message' and text()='Account created.']")
	public WebElement accountCreatedMessage;
}
