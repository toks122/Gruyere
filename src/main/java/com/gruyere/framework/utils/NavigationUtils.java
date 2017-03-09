package com.gruyere.framework.utils;

import java.util.logging.Logger;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public class NavigationUtils {

	private static final Logger LOGGER = Logger.getLogger(NavigationUtils.class.getName());

	public void navigateToStartPage(){
		LOGGER.info("Navigate to Start Page");
		BrowserDriver.loadPage("https://google-gruyere.appspot.com/start");
	}

}
