package com.CanopyTest;

import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.busineslib.CanopyClass;
import com.busineslib.Commonlib;
import com.genericlib.Driver;
import com.genericlib.WebDriverUtils;

public class ScenariosTest {

	Driver dLib;
	WebDriverUtils wLib;
	Commonlib cLib;	
	CanopyClass clogin;	
	
	@BeforeClass
	public void configBeforeClass() throws Exception{
		
		Driver.configChromeBrowser();		
		wLib = new WebDriverUtils();		
		cLib = new Commonlib();
		dLib = new Driver();
		clogin = new CanopyClass();
		
				
	}
	
	//Scenario 1
	@Test
    public void Test1() throws IllegalClassFormatException, IOException{
		
		try{

			String userName = Commonlib.Username;
			String password = Commonlib.Password;
			clogin.loginToAPP(userName, password);
			clogin.canopyHome();
			clogin.newReport();
			Driver.driver.quit();
			}
			catch(Exception e)
			{
					e.printStackTrace();
			}
	}
	
	//Scenario 2
	@Test
	public void Test2() throws IllegalClassFormatException, IOException{
		
		try{

			String userName = Commonlib.Username;
			String password = Commonlib.Password;
			clogin.loginToAPP(userName, password);
			clogin.canopyHome();
			clogin.editReport();
			Driver.driver.quit();
			}
			catch(Exception e)
			{
					e.printStackTrace();
			}
	}
	
	//Scenario 3
	@Test
	public void Test3() throws IllegalClassFormatException, IOException{
		
		try{

			String userName = Commonlib.Username;
			String password = Commonlib.Password;
			clogin.loginToAPP(userName, password);
			clogin.canopyHome();
			clogin.copyReport();
			Driver.driver.quit();
			}
			catch(Exception e)
			{
					e.printStackTrace();
			}
	}
	
	//Scenario 4
	@Test
	public void Test4() throws IllegalClassFormatException, IOException{
		
		try{

			String userName = Commonlib.Username;
			String password = Commonlib.Password;
			clogin.loginToAPP(userName, password);
			clogin.canopyHome();
			clogin.deleteReport();
			Driver.driver.quit();
			}
			catch(Exception e)
			{
					e.printStackTrace();
			}
	}
	
	//Scenario 5
	@Test
    public void Test5() throws IllegalClassFormatException, IOException{
		
		try{

			String userName = Commonlib.Username;
			String password = Commonlib.Password;
			clogin.loginToAPP(userName, password);
			clogin.calcnetworth();
			//Driver.driver.quit();
			}
			catch(Exception e)
			{
					e.printStackTrace();
			}
	}
}
