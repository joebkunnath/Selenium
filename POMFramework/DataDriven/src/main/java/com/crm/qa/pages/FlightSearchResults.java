package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;

public class FlightSearchResults extends Base {

	@FindBy(xpath = "//button/span[contains(text()='Search Again')]")
	WebElement searchAgain;

	@FindBy(name = "flight_origin")
	WebElement flightOrigin;

	@FindBy(name = "flight_destination")
	WebElement flightDestination;

	@FindBy(id = "BE_flight_flsearch_btn")
	WebElement searchButton;

	@FindBy(xpath = "//div[@class = 'ac_airport']")
	WebElement selectAirport;

	public boolean searchAgainButton() {
		return searchAgain.isDisplayed();
	}

	public FlightSearchResults searchFight(String Origin, String Destination) {
//		flightsTab.click();
		flightOrigin.click();
		flightOrigin.clear();
		flightOrigin.sendKeys(Origin);
		selectAirport.click();
		flightOrigin.click();
		flightOrigin.clear();
		flightDestination.sendKeys(Destination);
		selectAirport.click();
		searchButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new FlightSearchResults();
	}

	public FlightSearchResults() {
		PageFactory.initElements(driver, this);
	}

}
