package com.webelementrepositoryCanopy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CopyReport {

	@FindBy(xpath = "//table[@role='grid']/tbody/tr[3]/td[4]/a[4]")
	public WebElement copytemplate;
	
	@FindBy(xpath = "//input[@id='reportName']")
	public WebElement reportname;

	public WebElement getReportname() {
		return reportname;
	}

	public WebElement getCopytemplate() {
		return copytemplate;
	}
}
