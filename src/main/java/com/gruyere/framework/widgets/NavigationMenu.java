package com.gruyere.framework.widgets;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.gruyere.framework.elements.NavigationMenuElements;
import com.gruyere.framework.pages.SignUpPage;
import com.gruyere.framework.utils.BrowserDriver;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public class NavigationMenu {

	private static final Logger LOGGER = Logger.getLogger(SignUpPage.class.getName());
	private static final NavigationMenuElements navBarElements = PageFactory.initElements(BrowserDriver.getCurrentDriver(), NavigationMenuElements.class);


	public static void clickSignUp(){
		LOGGER.info("Click 'Sign Up'");
		navBarElements.signUpLink.click();
	}

	public static void clickNewSnippet(){
		LOGGER.info("Click 'New Snipper'");
		navBarElements.newSnippetLink.click();
	}

	public static boolean isPresent_SignOutLink() {
		return findDisplayedMenuItems().contains("Sign out");
	}

	public static List<String> findDisplayedMenuItems(){
		List<WebElement> menuItems = navBarElements.menu.findElements(By.tagName("a"));
		List<String> menuLinkText = new ArrayList<String>();
		for(WebElement link : menuItems){
			menuLinkText.add(link.getText());
		}
		return menuLinkText;
	}
}
