package com.webelementrepositoryCanopy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalcNetWorth {

	@FindBy(xpath = "//div[@id='navigationMenu']/nav/ul/li[6]")
	public WebElement useraccounts;
	
	@FindBy(xpath = "//span[contains(text(),'Account Holdings')]")
	public WebElement accountholdings;
	
	@FindBy(xpath = "//*[@id='holdPanelBarFilter']/li/div/form/div[1]/div/div/div/div[1]/div")
	public WebElement accountpick;
	
	@FindBy(xpath = "//button[contains(text(),'Apply filters')]")
	public WebElement applyfilter;
	
	@FindBy(xpath = "//span[contains(text(),'CASH')]")
	public WebElement cashexpand;
	
	@FindBy(xpath = "//*[@id='cashGrid']/div[6]/div/table/tbody/tr/td[10]")
	public WebElement cashtotal;

	public WebElement getCashtotal() {
		return cashtotal;
	}

	public WebElement getCashexpand() {
		return cashexpand;
	}

	public WebElement getApplyfilter() {
		return applyfilter;
	}

	public WebElement getAccountpick() {
		return accountpick;
	}

	public WebElement getAccountholdings() {
		return accountholdings;
	}

	public WebElement getUseraccounts() {
		return useraccounts;
	}
}
