package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A extends baseclass{
	@BeforeMethod
	private void startdate() {
		launchBrowser();
		windowmaximize();
		Date d= new Date();
		System.out.println(d);	
	}
	@DataProvider(name="Amazon")
	private Object[][] data() {
		return new Object[][] {
			{"formel shirt"},
			{"T shirts"},
			{"sports dress"}
		};
	}
	@Test(dataProvider = "Amazon")
	private void tc4(String m) throws AWTException {
		launchurl("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(m);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	@AfterMethod
	private void enddate() {
		Date d= new Date();
		System.out.println(d);
	}
	@AfterClass
	private void close() {
		closeEntireBrowser();
	}
}
