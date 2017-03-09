package com.gruyere.framework.pages;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import com.gruyere.framework.elements.NewSnippetElements;
import com.gruyere.framework.utils.BrowserDriver;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */

public class NewSnippetPage {

	private static final Logger LOGGER = Logger.getLogger(NewSnippetPage.class.getName());
	private static final NewSnippetElements snippetElements = PageFactory.initElements(BrowserDriver.getCurrentDriver(), NewSnippetElements.class);

	public static void addSnippet(String snippet){
		setSnippet(snippet);
		clickSubmit();
	}

	public static void setSnippet(String snippet){
		LOGGER.info("Set snippet to " + snippet);
		snippetElements.snippetTextArea.sendKeys(snippet);;
	}

	public static void clickSubmit(){
		LOGGER.info("Click 'Submit'");
		snippetElements.submitButton.click();
	}
}
