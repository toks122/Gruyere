package com.gruyere.framework.pages;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import com.gruyere.framework.elements.SignInElements;
import com.gruyere.framework.utils.BrowserDriver;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public class LoginView {

	private static final Logger LOGGER = Logger.getLogger(LoginView.class.getName());
	private static final SignInElements signInElements = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SignInElements.class);



}
