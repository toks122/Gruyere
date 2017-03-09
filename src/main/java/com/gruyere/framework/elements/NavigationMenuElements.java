package com.gruyere.framework.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public class NavigationMenuElements {

	@FindBy(how = How.CLASS_NAME, using = "menu")
	public WebElement menu;

	@FindBy(how = How.LINK_TEXT, using = "Home")
	public WebElement homeLink;

	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	public WebElement signInLink;

	@FindBy(how = How.LINK_TEXT, using = "Sign up")
	public WebElement signUpLink;

	@FindBy(how = How.LINK_TEXT, using = "New Snippet")
	public WebElement newSnippetLink;

	@FindBy(how = How.LINK_TEXT, using = "Sign out")
	public WebElement signOutLink;




}
