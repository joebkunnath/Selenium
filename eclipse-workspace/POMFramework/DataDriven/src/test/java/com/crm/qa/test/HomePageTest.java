package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.OfferPage;

public class HomePageTest extends Base {
	LoginPage loginPage;
	HomePage homePage;
	OfferPage offerPage;

	@BeforeMethod
	public void setup() throws InterruptedException {
		Initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void homePageTitleTest() {
		String title = homePage.verifyHomePageTilte();
		Assert.assertEquals(title, "Flight, Cheap Air Tickets , Hotels, Holiday, Trains Package Booking - Yatra.com","Title is not correct");
	}
//
//	@Test(priority=2)
//	public void verifyHomepageLogo() {
//		
//		Assert.assertTrue(homePage.validateLogoImage());
//	}
//	
//	@Test(priority=3)
//	public void verifyHomepageTabs() {
//		
//		Assert.assertTrue(homePage.validateFlightTab());
//		Assert.assertTrue(homePage.validateHotelTab());
//		Assert.assertTrue(homePage.validateHomeStayTab());
//		Assert.assertTrue(homePage.validatebusTab());
//		Assert.assertTrue(homePage.validateHomeStayTab());
//		Assert.assertTrue(homePage.validateholydaysTab());
//	}
//	
//	@Test(priority=4)
//	public void GoToOffers() throws InterruptedException {
//		
//		offerPage = homePage.clickOnOffers();
//		Thread.sleep(2000);
//	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	public HomePageTest() {
		super();
	}

}
