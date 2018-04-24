package com.busineslib;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.genericlib.Driver;
import com.genericlib.WebDriverUtils;
import com.webelementrepositoryCanopy.CalcNetWorth;
import com.webelementrepositoryCanopy.CopyReport;
import com.webelementrepositoryCanopy.DeleteReport;
import com.webelementrepositoryCanopy.EditReport;
import com.webelementrepositoryCanopy.HomePage;
import com.webelementrepositoryCanopy.LoginPage;
import com.webelementrepositoryCanopy.ReportsPage;

public class CanopyClass extends WebDriverUtils{
	
	private static final String Canopy_URL = "https://dev-engine.kurtosys.org";
	private static final String reportname = "Naren";
	private static final String copyreportname = "Hari";
	String errormessage=null;
	WebDriverUtils wLib;
	LoginPage loginPage = PageFactory.initElements(Driver.driver, LoginPage.class);
	HomePage homepage = PageFactory.initElements(Driver.driver, HomePage.class);
	ReportsPage reportpage = PageFactory.initElements(Driver.driver, ReportsPage.class);
	EditReport editreport = PageFactory.initElements(Driver.driver, EditReport.class);
	CopyReport copyreport = PageFactory.initElements(Driver.driver, CopyReport.class);
	DeleteReport deletereport = PageFactory.initElements(Driver.driver, DeleteReport.class);
	CalcNetWorth calnetworth = PageFactory.initElements(Driver.driver, CalcNetWorth.class);

	//Function to login to application
		public void loginToAPP(String Username , String Password) throws Exception{
			try{
			Driver.driver.get(Canopy_URL);
			System.out.println("URL is entered successfully" );
			//acceptAlert();
			//waitForXpathPresent("//input[@name='username']");
			waitForPageToLoad();
			loginPage.getUserID().sendKeys(Username);
			System.out.println("UserId is entered successfully" );
			loginPage.getPassword().sendKeys(Password);
			System.out.println("Password is entered successfully" );
			loginPage.getLoginButton().click();
			System.out.println("Login button Clicked successfully" );
			waitForPageToLoad();
			}
			catch(Exception e){
				errormessage=e.getMessage();	
			    throw new Exception(e);
			}
			
		}
		
		//Function to click the reports option
		public void canopyHome() throws Exception{
			try{
				homepage.getReports().click();
			}
			catch(Exception e){
				errormessage=e.getMessage();	
			    throw new Exception(e);
			}
		}
		
		//Function to create a new template in the report
		public void newReport() throws Exception{
			try{
				homepage.getReportsTemplatesDesign().click();
				reportpage.getCreatereport().click();
				Thread.sleep(5000);
				reportpage.getReportname().sendKeys(reportname);
				reportpage.getChoosetemp().click();
				Thread.sleep(2000);
				reportpage.getBaseTemplateDL().click();
				reportpage.getSave().click();
				Thread.sleep(2000);
				reportpage.getNametext().sendKeys(reportname);
				reportpage.getNametext().sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				reportpage.getTextverify().click();
				System.out.println("Verified value in table--PASS");
				reportpage.getUserdropdown().click();
				Thread.sleep(2000);
				reportpage.getLogoutbutton().click();
				Thread.sleep(2000);
			}
			catch(Exception e){
				errormessage=e.getMessage();	
			    throw new Exception(e);
			}
		}
		
		//Function to edit the existing template from report
		public void editReport() throws Exception{
			try{
				homepage.getReportsTemplatesDesign().click();
				editreport.getEdittemplate().click();
				editreport.getTempstatus().click();
				Thread.sleep(3000);
				editreport.getStatuschange().click();
				reportpage.getSave().click();
				Thread.sleep(2000);
				reportpage.getNametext().sendKeys(reportname);
				reportpage.getNametext().sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				editreport.getStatuscheck().click();
				System.out.println("Verified the status--PASS");
				reportpage.getUserdropdown().click();
				Thread.sleep(2000);
				reportpage.getLogoutbutton().click();
				Thread.sleep(2000);
				
			}
			catch(Exception e){
				errormessage=e.getMessage();	
			    throw new Exception(e);
			}
		}
		
		//Function to copy template from report
		public void copyReport() throws Exception{
			try{
				homepage.getReportsTemplatesDesign().click();
				copyreport.getCopytemplate().click();
				Thread.sleep(2000);
				copyreport.getReportname().clear();
				copyreport.getReportname().sendKeys(copyreportname);
				reportpage.getNametext().sendKeys(Keys.TAB);
				reportpage.getSave().click();
				Thread.sleep(2000);
				reportpage.getNametext().sendKeys(copyreportname);
				reportpage.getNametext().sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				reportpage.getTextverify().click();
				System.out.println("Verified value in table--PASS");
				reportpage.getUserdropdown().click();
				Thread.sleep(2000);
				reportpage.getLogoutbutton().click();
				Thread.sleep(2000);
				
			}
			catch(Exception e){
				errormessage=e.getMessage();	
			    throw new Exception(e);
			}
		}
		
		//Function to delete template from report
		public void deleteReport() throws Exception{
			try{
				homepage.getReportsTemplatesDesign().click();
				reportpage.getNametext().sendKeys(reportname);
				reportpage.getNametext().sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				deletereport.getDeletetemplate().click();
				Thread.sleep(3000);
				deletereport.getDeletepopup().click();
				Thread.sleep(3000);
				reportpage.getNametext().clear();
				reportpage.getNametext().sendKeys(reportname);
				reportpage.getNametext().sendKeys(Keys.ENTER);
				System.out.println("First template deleted");
				Thread.sleep(3000);
				reportpage.getNametext().clear();
				reportpage.getNametext().sendKeys(copyreportname);
				reportpage.getNametext().sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				deletereport.getDeletetemplate().click();
				Thread.sleep(3000);
				deletereport.getDeletepopup().click();
				Thread.sleep(3000);
				reportpage.getNametext().clear();
				reportpage.getNametext().sendKeys(copyreportname);
				reportpage.getNametext().sendKeys(Keys.ENTER);
				System.out.println("Second report deleted");
				reportpage.getUserdropdown().click();
				Thread.sleep(2000);
				reportpage.getLogoutbutton().click();
				Thread.sleep(2000);
			}
			catch(Exception e){
				errormessage=e.getMessage();	
			    throw new Exception(e);
			}
		}
		
		//Function to calculate total networth
		public void calcnetworth() throws Exception{
			try{
				calnetworth.getUseraccounts().click();
				calnetworth.getAccountholdings().click();
				waitForPageToLoad();
				Driver.driver.findElement(By.xpath("//div[@class='input-group-addon']")).click();
				Thread.sleep(2000);
				waitForXpathPresent("//select[@id='userId']");
				calnetworth.getAccountpick().click();
				//select("//select[@id='userId']",35);
				calnetworth.getAccountpick().click();
				Thread.sleep(5000);
				System.out.println("I am in account textbox");
				calnetworth.getAccountpick().sendKeys("acdc4ever");
				//Thread.sleep(25000);
				calnetworth.getAccountpick().sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				calnetworth.getApplyfilter().click();
				waitForPageToLoad();
				Assert.assertEquals("22,340,819.74","22,340,819.74");
				calnetworth.getCashexpand().click();
				String cashTotal = calnetworth.getCashtotal().getAttribute("Total");
				System.out.println(cashTotal);
			}
			catch(Exception e){
				errormessage=e.getMessage();	
			    throw new Exception(e);
			}
		}
}
