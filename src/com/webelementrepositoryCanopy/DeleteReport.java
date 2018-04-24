package com.webelementrepositoryCanopy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteReport {

	@FindBy(xpath = "//table[@role='grid']/tbody/tr[3]/td[4]/a[5]")
	public WebElement deletetemplate;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement deletepopup;

	public WebElement getDeletepopup() {
		return deletepopup;
	}

	public WebElement getDeletetemplate() {
		return deletetemplate;
	}
}
