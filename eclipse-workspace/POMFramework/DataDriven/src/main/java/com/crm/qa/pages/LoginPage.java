package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.*;
public class LoginPage extends Base{
	
	@FindBy(name="login-input")
	WebElement username;
	
	@FindBy(id="login-continue-btn")
	WebElement continueButton;
	
	@FindBy(xpath="//*[@id='login-password']")
	WebElement password;
	
	@FindBy(id="login-submit-btn")
	WebElement submitButton;
	
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public String validateLoginTilte() {
		return driver.getTitle();
	}
	
	public HomePage login(String um,String pwd) throws InterruptedException {
		username.sendKeys(um);
		continueButton.click();
		Thread.sleep(2000);
		password.sendKeys(pwd);
		submitButton.click();
		Thread.sleep(2000);
		return new HomePage();
	}
}
