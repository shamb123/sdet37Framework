package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_owner {
//initilisation
	public HomePage_owner(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath="//a[text()=\"Register\"]")
	private WebElement registerLink;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	private WebElement logoutbtn;
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLogoutbtn(WebDriver driver) {
		return logoutbtn;
	}

	public void logoutBtn() {
		logoutbtn.click();
		
		
	}

	
	
	
}
