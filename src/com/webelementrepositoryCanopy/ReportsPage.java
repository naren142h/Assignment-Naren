package com.webelementrepositoryCanopy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsPage {

	
	@FindBy(xpath = "//div[@class='toolbar']/a")
	public WebElement createreport;
	
	@FindBy(xpath = "//input[@id='reportName']")
	public WebElement reportname;
	
	@FindBy(xpath = "//span[contains(text(),'Choose style template...')]")
	public WebElement Choosetemp;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement save;
	
	@FindBy(xpath = "//span[@role='presentation']/input[@data-text-field='name']")
	public WebElement nametext;
	
	@FindBy(xpath = "//li[@class='dropdown']/a")
	public WebElement userdropdown;
	
	@FindBy(xpath = "//a[@href='/Account/LogOff']")
	public WebElement logoutbutton;
	
	@FindBy(xpath = "//li[contains(text(),'BaseTemplateDL')]")
	public WebElement BaseTemplateDL;
	
	@FindBy(xpath = "//tbody[@role='rowgroup']/tr[3]/td[5]")
	public WebElement textverify;

	public WebElement getTextverify() {
		return textverify;
	}

	public WebElement getBaseTemplateDL() {
		return BaseTemplateDL;
	}

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}

	public WebElement getUserdropdown() {
		return userdropdown;
	}

	public WebElement getNametext() {
		return nametext;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getChoosetemp() {
		return Choosetemp;
	}

	public WebElement getReportname() {
		return reportname;
	}
	
	public WebElement getCreatereport() {
		return createreport;
	}
}
