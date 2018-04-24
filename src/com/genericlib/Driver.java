package com.genericlib;

import java.awt.AWTException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
                
                public static WebDriver driver;		
		              //Chrome browser
		                
		                public static WebDriver configChromeBrowser() throws AWTException {
		            		// TODO Auto-generated method stub
		            		System.setProperty("webdriver.chrome.driver", "C:\\NewWorkspace\\CanopyAssignment\\Utilities\\drivers\\chromedriver.exe");
		            		ChromeOptions options = new ChromeOptions();
		            		options.addArguments("--disable-extensions");
		            		Map<String, Object> prefs = new HashMap<String, Object>();
		    		        prefs.put("profile.default_content_setting_values.notifications", 2);
		    		        options.setExperimentalOption("prefs", prefs);
		            		driver =new ChromeDriver(options);
		            		//@SuppressWarnings("unused")
							WebDriver globaldriver = driver;
		            		driver.manage().window().maximize();
		            		System.out.println("Chrome Browser is launched");
		            		return driver;
		            	}
		                
}