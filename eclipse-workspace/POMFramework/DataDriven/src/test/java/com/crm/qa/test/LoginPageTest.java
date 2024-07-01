package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.OfferPage;

public class LoginPageTest extends Base {
	LoginPage loginPage;
	HomePage homePage;
	

	@BeforeMethod
	public void setup() {
		Initialization();
		loginPage = new LoginPage();
	}

//	@Test(priority=1)
//	public void LoginPageTitleTest() {
//		String title = loginPage.validateLoginTilte();
//		Assert.assertEquals(title, "Yatra Account");
//	}
//
//	@Test(priority=2)
//	public void LoginTest() throws InterruptedException {
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	public LoginPageTest() {
		super();
	}

}
