package org.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class cross {
	@Parameters("browser")
	@Test
	private void tc1(String browserName) {
		WebDriver driver = null ;
		if (browserName.equals("chrome browser")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox browser")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();			
		}
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement mouse = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a = new Actions(driver);
		a.moveToElement(mouse).perform();
		WebElement sign = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		sign.click();
		WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
		user.sendKeys("kavin");
		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
		btn.click();
		driver.close();
	}
	

}
