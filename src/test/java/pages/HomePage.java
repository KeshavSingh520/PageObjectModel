package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage {
	public static  WebDriver driver;
	
	public HomePage(WebDriver  driver)
	{
		this.driver=driver;
		
	}
	
	
	@Test
	public void doLogin(String username,String password)
	{
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys(password);
	}
	
	public void createaccount()
	{
		
			System.out.println("creating account fds");
	}
	
	

}
