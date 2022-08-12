package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsOrUpdatePage {
	
	public DetailsOrUpdatePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutBtn;
	
	@FindBy(xpath="//p[text()='mahantesh']/../..//b[text()='Vacant']")
	private WebElement verifyVacant;

	
	//utilization
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getVerifyVacant() {
		return verifyVacant;
	}

	public void clickLogoutBtn()
	{
		logoutBtn.click();
	}
	
	

}
