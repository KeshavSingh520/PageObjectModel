package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import base.pagebase;

public class LandingPage extends pagebase {

	public void doSearch()
	{
		driver.findElement(By.cssSelector(OR.getProperty("Search"))).sendKeys("Selenium");
		
		driver.findElement(By.cssSelector(OR.getProperty("Search"))).sendKeys(Keys.ENTER);
	}
	
	
	
	
}
