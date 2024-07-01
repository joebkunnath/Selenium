package com.crm.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;

public class OfferPage extends Base{

	public OfferPage() {
		PageFactory.initElements(driver, this);
	}
}
