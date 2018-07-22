package testcase;

import org.testng.annotations.Test;

import pages.LandingPage;

public class TestLandingPage {
	
	
	@Test
	public void Testlogin()
	{
		LandingPage lp=new LandingPage();
		lp.doSearch();
		
	}

}
