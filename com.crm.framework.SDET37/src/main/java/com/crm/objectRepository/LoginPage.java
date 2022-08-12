package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaretion
	
	@FindBy(id = "exampleInputEmail1")
	private WebElement usernametxtEdt;

	@FindBy(id = "exampleInputPassword1")
	private WebElement passwordtxtEdt;


	@FindBy(name = "login")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//a[.='Login']")
	private WebElement loginLnk;

	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Utilization
	public WebElement getUsernametxtEdt()
	{
		return usernametxtEdt;
	}

	public WebElement getPasswordtxtEdt() {
		return passwordtxtEdt;
	}
	
	public WebElement getLoginLnk() {
		return loginLnk;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	/**
	 * 
	 * @param username
	 * @param password
	 * click on submit button
	 */

	public void loginToAppli(String username,String password)
	{
		usernametxtEdt.sendKeys(username);
		passwordtxtEdt.sendKeys(password);
		submitBtn.click();
	}
	
	public void loginLink() {
		loginLnk.click();
	}
}

