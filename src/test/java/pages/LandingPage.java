package pages;

import org.openqa.selenium.By;

import base.pagebase;

public class LandingPage extends pagebase {

	public void doSearch()
	{
		driver.findElement(By.cssSelector(OR.getProperty("Search"))).sendKeys("Selenium");
		
		
	}
	
	
	
	
}
