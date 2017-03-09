package com.gruyere.framework.pages;

import org.openqa.selenium.support.PageFactory;

import com.gruyere.framework.elements.HomePageElements;
import com.gruyere.framework.utils.BrowserDriver;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public class HomePage {
	private static final HomePageElements homePageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomePageElements.class);

	public static String getTitle(){
		return homePageContainer.title.getText();
	}

}
