package testcase;

import org.testng.annotations.Test;

import pages.HomePage;

public class TestHomePage {
	
	
	
	@Test
	public void Testlogin()
	{
		HomePage hp=new HomePage();
		hp.doLogin("keshavsingh520@gmail.com", "206806205");
		
	}
	

	
	
	
}
