package testcase;

import org.testng.annotations.Test;

import pages.LandingPage;

public class TestLandingPage {
	
	
	@Test
	public void Testlogin()
	{
		LandingPage LP1 =new LandingPage();
		LP1.doSearch();
		
	}

}
