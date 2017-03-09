package com.gruyere.framework.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */

public class NewSnippetElements {

	@FindBy(how = How.NAME, using = "snippet")
	public WebElement snippetTextArea;

	@FindBy(how = How.CSS, using = "input[type=submit]")
	public WebElement submitButton;

}
