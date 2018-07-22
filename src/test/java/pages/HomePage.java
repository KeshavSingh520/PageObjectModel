package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.pagebase;

public class HomePage extends pagebase {

	
	
	
	
	public  void  doLogin(String username,String password)
	{
		
		driver.findElement(By.xpath(OR.getProperty("Email"))).sendKeys(username);
		driver.findElement(By.xpath(OR.getProperty("Password"))).sendKeys(password);
	    driver.findElement(By.xpath(OR.getProperty("Submit"))).click();
	    
	}
	
	public void createaccount()
	{
		
			System.out.println("creating account fds");
	}
	
	

}
