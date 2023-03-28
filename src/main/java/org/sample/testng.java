package org.sample;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class testng extends baseclass{
	@BeforeClass
	private void launchbrowser() {
		launchBrowser();
		windowmaximize();
	}
	@AfterClass
	private void close() {
		closeEntireBrowser();
	}
	@BeforeMethod
	private void date() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterMethod
	private void end() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test(invocationCount = 3)
	private void tc1() {
		launchurl("https://accounts.google.com/");
	}
	@Test
	private void tc2() {
		launchurl("https://www.flipkart.com/");
	}
	@Test
	private void tc3() {
		launchurl("https://www.amazon.com/");
	}

}
