package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;

public class HomePage extends Base {

	@FindBy(xpath = "//a[@class='logo']")
	WebElement logo;

	@FindBy(id = "booking_engine_flights")
	WebElement flightsTab;

	@FindBy(id = "booking_engine_hotels")
	WebElement hotelsTab;

	@FindBy(id = "booking_engine_homestays")
	WebElement homestaysTab;

	@FindBy(id = "booking_engine_buses")
	WebElement busesTab;

	@FindBy(id = "booking_engine_holidays")
	WebElement holidaysTab;

	@FindBy(id = "booking_engine_cabs")
	WebElement cabsTab;

	@FindBy(xpath = "//a[@title='Offers']")
	WebElement offers;
	
	@FindBy(xpath = "//a[@title='One Way']")
	WebElement oneWay;
	

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	


	public String verifyHomePageTilte() {
		return driver.getTitle();
	}

	public boolean validateLogoImage() {
		return logo.isDisplayed();
	}

	public boolean validateFlightTab() {
		return flightsTab.isDisplayed();
	}

	public boolean validateLogoHotelTab() {
		return hotelsTab.isDisplayed();
	}

	public boolean validateHomeStayTab() {
		return homestaysTab.isDisplayed();
	}

	public boolean validatebusTab() {
		return busesTab.isDisplayed();
	}

	public boolean validateholydaysTab() {
		return holidaysTab.isDisplayed();
	}

	public boolean validateCabTab() {
		return cabsTab.isDisplayed();
	}

	public OfferPage clickOnOffers() {
		offers.click();
		return new OfferPage();
	}
	
	public FlightSearchResults clickOnFlightsTab() {
		flightsTab.click();
		return new FlightSearchResults();
	}

	public boolean validateHotelTab() {
		// TODO Auto-generated method stub
		return hotelsTab.isDisplayed();
	}

}
