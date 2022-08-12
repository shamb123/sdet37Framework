package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyRegistrationApartmentRoomPage {
	
	public VerifyRegistrationApartmentRoomPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(xpath="//h2[text()='Register Room']/../..//div[text()='Registration successfull. Thank you']")
	private WebElement verifyApartmentRoom;

	
	//utilization
	public WebElement getVerifyApartmentRoom() {
		return verifyApartmentRoom;
	}
	
	

}
