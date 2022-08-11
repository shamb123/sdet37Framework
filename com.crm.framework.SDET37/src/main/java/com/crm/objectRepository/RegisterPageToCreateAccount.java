package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.ExcelUtility;

public class RegisterPageToCreateAccount extends ExcelUtility{
  public RegisterPageToCreateAccount(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  @FindBy(id="fullname")
  private WebElement fullnameEdt;
	
  @FindBy(id="username")
  private WebElement usernameEdt;
  
  @FindBy(id="mobile")
  private WebElement mobileEdt;
  
  @FindBy(id="email")
  private WebElement emailEdt;
  
  @FindBy(id="password")
  private WebElement passwordEdt;
  
  @FindBy(id="c_password")
  private WebElement passworddEdt;
  
  @FindBy(xpath="//input[@name='c_password']/../..//button[@value='register']")
  private WebElement submitBtn;

  @FindBy(xpath="//a[@class='nav-link']")
  private WebElement loginBtn;
  
  
  public WebElement getFullnameEdt() {
	return fullnameEdt;
  }

  public WebElement getUsernameEdt() {
	return usernameEdt;
  }

  public WebElement getMobileEdt() {
	return mobileEdt;
  }
  
  public WebElement getEmailEdt() {
	return emailEdt;
}

public WebElement getPasswordEdt() {
	return passwordEdt;
  }

  public WebElement getPassworddEdt() {
	return passworddEdt;
  }

  public WebElement getSubmitBtn() {
	return submitBtn;
  }
  
	
  public WebElement getLoginBtn() {
	return loginBtn;
}

public void fullName(String name)
  {
	  fullnameEdt.sendKeys(name);
  }
  public void userName(String username) {
	  usernameEdt.sendKeys(username);
  }
  public void mobileEdtt(String num) {
	  mobileEdt.sendKeys(num);
  }
  public void email(String emaill) {
	  emailEdt.sendKeys(emaill);
  }
  public void passwordtxtbx(String password) {
	  passwordEdt.sendKeys(password);
  }
  public void confirmPassword(String pwd) {
	  passworddEdt.sendKeys(pwd);
  }
	
  public void submit() {
	  getSubmitBtn().click();
  }
	
  public void loginButtonn() {
	  loginBtn.click();
	  
  }
	
	
	
	
	
	
	
	
}
