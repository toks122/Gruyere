package com.gruyere.cucumber.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.gruyere.framework.pages.HomePage;
import com.gruyere.framework.pages.MySnippetsPage;
import com.gruyere.framework.pages.NewSnippetPage;
import com.gruyere.framework.pages.SignUpPage;
import com.gruyere.framework.pages.StartPage;
import com.gruyere.framework.utils.NavigationFactory;
import com.gruyere.framework.widgets.NavigationMenu;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public class StepDefs {

	private String snippet;

	@Given("^I am on the Start page$")
	public void navigate_to_start_page()  {
		NavigationFactory.getNavigator().navigateToStartPage();
	}

	@Given("^I am signed in$")
	public void sign_up_if_not_already()
	{
		if(!NavigationMenu.isPresent_SignOutLink()){
			sign_up_as_new_user();
		}
	}

	@Given("^I create a snippet as '(.*)'$")
	public void create_a_snippet(String snippet) {
		this.snippet = snippet;
		NavigationMenu.clickNewSnippet();
		NewSnippetPage.addSnippet(snippet);
	}

	@And("^I agree to accept and start")
	public void agree_to_accept_and_start()  {
		StartPage.clickAcceptAndStart();
	}

	@And("^I sign up as a new user$")
	public void sign_up_as_new_user()
	{
		NavigationMenu.clickSignUp();
		SignUpPage.signUp();
	}

	@Then("^The Home page is displayed$")
	public void verify_home_page_is_displayed()  {
		assertEquals("Home page title", "Gruyere: Home", HomePage.getTitle());
	}

	@Then("^my account is created successfully$")
	public void verify_account_created_successfully()  {
		assertTrue("Sign up was successful", SignUpPage.isDisplayed_AccountCreated());
	}

	@Then("^the snippet is added to my snippets$")
	public void verify_snippet_is_added_to_my_snippets() {
		assertTrue("Snippet is present", MySnippetsPage.isPresent_Snippet(snippet));
	}
}
