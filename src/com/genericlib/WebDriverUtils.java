package com.genericlib;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebDriverUtils {
	static Robot robot;
	boolean status = true;
	public void waitForPageToLoad(){
		Driver.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
	
	public void waitForLinkTextPresent(String Xpath){
		WebElement element = (new WebDriverWait(Driver.driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));

		element.click();
		
	}
	 public static void scrollToBottom(WebDriver driver) {
	        ((JavascriptExecutor) driver)
	                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    }
	 
	 public static void scrollToTop(WebDriver driver) {
	        ((JavascriptExecutor) driver)
	                .executeScript("window.scrollTo(document.body.scrollHeight,0)");
	    }
	
	public void waitForXpathPresent(String wbXpath){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 30);
		wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(wbXpath)));
		
	}

	public boolean verifyText(String wbXpath , String expectedText){
		boolean flag= false;
		String actText = Driver.driver.findElement(By.xpath
				                            (wbXpath)).getText();
		if(expectedText.equals(actText)){
			flag=true;
			System.out.println(expectedText + "=text is verified==>PASS");
		}else{
			System.out.println(expectedText + "=text is not verified==>FAIL");
	
		}
		return flag;
	}
	
	public void select1(String wbName , String visbleText){
		Select sel = new Select(Driver.driver.findElement(By.name(wbName)));
		sel.selectByVisibleText(visbleText);
	}
	
	public void select(String xpath , int index){
		Select sel = new Select(Driver.driver.findElement(By.xpath(xpath)));
		sel.selectByIndex(index);
	}
	
	public void select3(WebElement wb , String value){
		Select sel = new Select(wb);
		sel.selectByVisibleText(value);
	}
	
	
	
	public void acceptAlert(){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 5);
	    wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = Driver.driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
	public void dismissAlert(){
		Alert alt = Driver.driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
	}
	
	
	public void mouseOver(String wbxpath){
		WebElement wb = Driver.driver.findElement
				                       (By.xpath(wbxpath));
		Actions act = new Actions(Driver.driver);
		act.moveToElement(wb).perform();
		
	}
	
	/*public boolean sikuliClickImage(String imageName)
	{
		
		try{
		Screen scr = new Screen();
        Pattern okButtonManhattan = new Pattern(ConstantClass.projectDir+"\\sikuliimages\\"+imageName);
        System.out.println("got the image from folder");
        scr.wait(okButtonManhattan, 5);
        scr.click(okButtonManhattan);
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		return status;

	}*/
	
	public static void configRobot()
	{
		try {
			robot=new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void clickEscape()
	{
		configRobot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
	}
	
	/*public static void sikuli(){
		Screen scr = new Screen();
		Pattern images = new Pattern(ConstantClass.projectDir+"\\Sikuli Images" );
		
	}*/


}
