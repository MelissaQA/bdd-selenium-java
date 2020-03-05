package org.testingworld.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.testingworld.automation.assertions.Compare;
import org.testingworld.automation.base.CreateDriverInstance;
import org.testingworld.automation.pages.LoginPage;

import cucumber.api.java.en.*;
import org.junit.Assert;

public class Steps {

	WebDriver driver;
	LoginPage login;
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    CreateDriverInstance driverInstance = new CreateDriverInstance();
	    driver = driverInstance.generateDriverInstance();
	}

	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
		login = new LoginPage(driver);
		login.enterUsername("Uname1");
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
	    login.enterPassword("pass1");
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
	    login.clickSignIn();
	}

	@Then("^User logged in successfully$")
	public void user_logged_in_successfully() throws Throwable {
	    Assert.assertTrue(Compare.validatePageURL(driver, "https://www.facebook.com/"));
	}

	@When("^User enters incorrecto username$")
	public void user_enters_incorrecto_username() throws Throwable {
		login.enterUsername("Uname1");
	}

	@Then("^User should not be logged in$")
	public void user_should_not_be_logged_in() throws Throwable {
		Assert.assertTrue(Compare.validatePageURL(driver, "https://www.facebook.com/"));
	}
	
}
