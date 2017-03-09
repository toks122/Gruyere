package com.gruyere.framework.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public class HomePageElements {

	@FindBy(how = How.TAG_NAME, using = "h2")
	public WebElement title;

}
