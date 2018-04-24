package com.webelementrepositoryCanopy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditReport {

	@FindBy(xpath = "//table[@role='grid']/tbody/tr[3]/td[4]/a[1]")
	public WebElement edittemplate;
	
	@FindBy(xpath = "//span[contains(text(),'In Progress')]")
	public WebElement tempstatus;
	
	@FindBy(xpath = "//*[@id='reportStatus_listbox']/li[3]")
	public WebElement statuschange;
	
	@FindBy(xpath = "//td[contains(text(),'Ready To Assign')]")
	public WebElement statuscheck;

	public WebElement getStatuscheck() {
		return statuscheck;
	}

	public WebElement getStatuschange() {
		return statuschange;
	}

	public WebElement getTempstatus() {
		return tempstatus;
	}

	public WebElement getEdittemplate() {
		return edittemplate;
	}
}
