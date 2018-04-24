package com.webelementrepositoryCanopy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "//div[@id='navigationMenu']/nav/ul/li[7]")
	public WebElement Reports;
	
	@FindBy(xpath = "//span[contains(text(),'Reports Templates Design')]")
	public WebElement ReportsTemplatesDesign;

	public WebElement getReportsTemplatesDesign() {
		return ReportsTemplatesDesign;
	}

	public WebElement getReports() {
		return Reports;
	}
}
