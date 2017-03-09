package com.gruyere.framework.pages;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import com.gruyere.framework.elements.StartPageElements;
import com.gruyere.framework.utils.BrowserDriver;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public class StartPage {
	private static final Logger LOGGER = Logger.getLogger(StartPage.class.getName());
	private static final StartPageElements startPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), StartPageElements.class);

	public static void clickAcceptAndStart(){
		LOGGER.info("Click 'Agree and Start'");
		startPageContainer.agreeStartLink.click();
	}

	public static void clickReset(){
		LOGGER.info("Click 'Reset'");
		startPageContainer.resetLink.click();
	}

	public static void clickResume(){
		LOGGER.info("Click 'Resume'");
		startPageContainer.resumeLink.click();
	}

	//	public static boolean isSignedIn(){
	//		String bodyText = startPageContainer.body.getText();
	//		if(bodyText.contains("Your Gruyere instance id is")){
	//			return true;
	//		}
	//		return false;
	//	}

}
