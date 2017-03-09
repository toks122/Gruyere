package com.gruyere.framework.utils;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public class BrowserFactory {
	private static final String BROWSER_PROP_KEY = "browser";


	/**
	 * Gets browser from property value. If property not set, the browser is set to Chrome by default
	 * @return
	 */
	public static WebDriver getBrowser() {
		Browsers browser;
		WebDriver driver;

		if(System.getProperty(BROWSER_PROP_KEY)==null){
			browser = Browsers.CHROME;
		}else{
			browser = Browsers.browserForName(System.getProperty(BROWSER_PROP_KEY));
		}
		switch(browser){
		case CHROME:
			driver = createChromeDriver();
			break;
		case FIREFOX:
		default:
			driver = createFirefoxDriver();
			break;
		}
		addAllBrowserSetup(driver);
		return driver;
	}


	private static WebDriver createChromeDriver() {
		if(SystemUtils.IS_OS_WINDOWS){
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		}
		else if(SystemUtils.IS_OS_MAC){
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		}
		return new ChromeDriver();
	}

	private static WebDriver createFirefoxDriver() {
		return new FirefoxDriver();
	}

	private static void addAllBrowserSetup(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}


}
