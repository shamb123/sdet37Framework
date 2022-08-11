package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListofUsersPage {

	public ListofUsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='cloud']")
	private WebElement usernameEdt;
	
	
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
