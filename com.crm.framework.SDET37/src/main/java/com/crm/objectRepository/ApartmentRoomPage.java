package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApartmentRoomPage {
	
	public ApartmentRoomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='Belagavi']")
	private WebElement cityEdttxtbx;
    
	@FindBy(xpath="//button[@name='register_apartment']")
	private WebElement submitBtn;
	
	public WebElement getCityEdtBtn() {
		return cityEdttxtbx;
	}
	

	public WebElement getSubmitBtn() {
		return submitBtn;
	}


	public void editCityBtn(String city) {
		cityEdttxtbx.clear();
		cityEdttxtbx.sendKeys(city);
	}
	public void submitButton() {
		submitBtn.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
