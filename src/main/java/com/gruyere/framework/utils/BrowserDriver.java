package com.gruyere.framework.utils;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public class BrowserDriver {
	private static final Logger LOGGER = Logger.getLogger(BrowserDriver.class.getName());
	private static WebDriver driver;

	public synchronized static WebDriver getCurrentDriver() {
		if (driver==null) {
			try {
				driver = BrowserFactory.getBrowser();
			} catch (Exception e) {
				LOGGER.severe("Error launching browser: " + e.getMessage());
			} finally{
                Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            }
		}
		return driver;
	}

	public static void close() {
		try {
			getCurrentDriver().quit();
			driver = null;
			LOGGER.info("closing the browser");
		} catch (UnreachableBrowserException e) {
			LOGGER.info("cannot close browser: unreachable browser");
		}
	}

	private static class BrowserCleanup implements Runnable {
		@Override
		public void run() {
			close();
		}
	}

	public static void loadPage(String url){
		getCurrentDriver();
		LOGGER.info("Directing browser to:" + url);
		LOGGER.info("try to loadPage [" + url + "]");
		getCurrentDriver().get(url);
	}

}
