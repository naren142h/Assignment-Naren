package com.webelementrepositoryCanopy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement userID;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getUserID() {
		return userID;
	}

	public WebElement getPassword() {
		return password;
	}
}
