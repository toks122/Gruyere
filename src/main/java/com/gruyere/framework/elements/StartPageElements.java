package com.gruyere.framework.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public class StartPageElements {

	@FindBy(how = How.LINK_TEXT, using = "Agree & Start")
	public WebElement agreeStartLink;

	@FindBy(how = How.LINK_TEXT, using = "Resume")
	public WebElement resumeLink;

	@FindBy(how = How.LINK_TEXT, using = "Reset")
	public WebElement resetLink;

}
