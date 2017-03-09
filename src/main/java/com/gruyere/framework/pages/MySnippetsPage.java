package com.gruyere.framework.pages;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.gruyere.framework.elements.MySnippetsElements;
import com.gruyere.framework.utils.BrowserDriver;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */

public class MySnippetsPage {

	private static final Logger LOGGER = Logger.getLogger(MySnippetsPage.class.getName());
	private static final MySnippetsElements mySnippetsElements = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MySnippetsElements.class);

	private static int COLUMN_INDEX_DELETE = 1;
	private static int COLUMN_INDEX_NAME = 2;

	public static int getNumberOfSnippets(){
		return findRows().size();
	}

	public static void deleteSnippet(String snippet){
		List<WebElement> rows = findRows();
		for(WebElement row : rows){
			String currentSnippet = row.findElements(By.tagName("td")).get(COLUMN_INDEX_NAME).getText();
			if(snippet.equals(currentSnippet)){
				LOGGER.info("Delete snippet " + snippet);
				row.findElements(By.tagName("td")).get(COLUMN_INDEX_DELETE).click();
			}
		}
	}

	public static boolean isPresent_Snippet(String snippet){
		List<WebElement> rows = findRows();
		for(WebElement row : rows){
			String currentSnippet = row.findElements(By.tagName("td")).get(COLUMN_INDEX_NAME).getText();
			if(snippet.equals(currentSnippet)){
				return true;
			}
		}
		return false;
	}

	private static List<WebElement> findRows(){
		List<WebElement> rows = mySnippetsElements.snippetTable.findElements(By.tagName("tr"));
		//Return number of rows minus the header row
		return rows.subList(1, rows.size());
	}
}
