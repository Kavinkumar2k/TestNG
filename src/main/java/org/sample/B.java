package org.sample;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class B extends baseclass{
	@BeforeClass
	private void Launch() {
		launchBrowser();
		windowmaximize();
	}
	@BeforeMethod
	private void startdate() {
		Date d= new Date();
		System.out.println(d);
	}
	@Test(priority = -10)
	private void tc1() {
		launchurl("https://accounts.google.com/");
		System.out.println("Test case 1");
		WebElement search = driver.findElement(By.id("identifierId"));
		search.sendKeys("kavin@gmail.com");
		WebElement btn = driver.findElement(By.xpath("//span[text()='Next']"));
		btn.click();
	}
	@Test(priority = -5)
	private void tc2() {
		launchurl("https://inmakes.com/");
		System.out.println("Test case 2");
		WebElement btn = driver.findElement(By.xpath("(//a[text()='About Us'])[2]"));
		btn.click();
	}
	@Test(priority = -15)
	private void tc3() {
		launchurl("https://www.redbus.in/");
		System.out.println("Test case 3");
		WebElement search = driver.findElement(By.id("src"));
		search.sendKeys("kovai");
		WebElement btn = driver.findElement(By.xpath("(//input[@class='db'])[2]"));
		btn.sendKeys("chennai");
		WebElement btn1 = driver.findElement(By.xpath("//button[text()='Search Buses']"));
		btn1.click();
	}
	@Test(priority = 15)
	private void tc4() {
		launchurl("https://www.flipkart.com/");
		WebElement X = driver.findElement(By.xpath("//button[text()='✕']"));
		X.click();
		WebElement ser = driver.findElement(By.xpath("//input[@name='q']"));
		ser.sendKeys("samsung");
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
		System.out.println("Test case 4");
	}
	@Test(priority = 5)
	private void tc5() {
		launchurl("https://www.amazon.in/");
		WebElement se = driver.findElement(By.id("twotabsearchtextbox"));
		se.sendKeys("dress");
		System.out.println("Test case 5");
	}
	@Test(priority = 10)
	private void tc6() {
		launchurl("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kavin@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("123456789");
		System.out.println("Test case 6");
	}
	@Test(priority = 11 )
	private void tc7() {
		launchurl("https://www.youtube.com/");
		WebElement ser = driver.findElement(By.xpath("//input[@name='search_query']"));
		ser.sendKeys("U1 songs");
		WebElement btn = driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
		btn.click();
		System.out.println("Test case 7");
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
