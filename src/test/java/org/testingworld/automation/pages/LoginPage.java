package org.testingworld.automation.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	ResourceBundle element = ResourceBundle.getBundle("Elements");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String uname) throws Exception {
		
		driver.findElement(By.id(element.getString("login_username_id"))).sendKeys(uname);
	}
	
	public void enterPassword(String pass) throws Exception {
		driver.findElement(By.id(element.getString("login_password_id"))).sendKeys(pass);
		
	}

	public void clickSignIn() throws Exception {
		driver.findElement(By.xpath(element.getString("login_signin_xpath"))).click();
	}
	
}
