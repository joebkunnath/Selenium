package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.FlightSearchResults;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class FlightSearchResultsTest extends Base{
	LoginPage loginPage;
	HomePage homePage;
	FlightSearchResults flightSearchResults;
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		Initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		flightSearchResults = homePage.clickOnFlightsTab();
	}

	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = TestUtil.getTestData("data");
		return data;
	}
	@Test(priority=1,dataProvider = "getTestData")
	public void doFlightSearch(String Origin,String Destination) {
		flightSearchResults = flightSearchResults.searchFight(Origin, Destination );
		Assert.assertTrue(flightSearchResults.searchAgainButton());
		System.out.println("test");
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	public FlightSearchResultsTest() {
		super();
	}
}
