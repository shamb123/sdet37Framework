package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginnnPage {
  public LoginnnPage (WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  @FindBy(xpath="//a[text()='Login']/../..//a[text()='Register']")
  private WebElement registerbtnn;
  
  @FindBy(xpath="//a[text()=\"Login\"]")
  private WebElement loginbtn;
  
  @FindBy(xpath="//a[text()='Search']")
  private WebElement searchBtn;
  
  @FindBy(xpath="//input[@name='location']")
  private WebElement searchTxtBox;
  
  @FindBy(xpath="//button[@name='search']")
  private WebElement searchEdtBtn;
  
  public WebElement getRegisterbtnn() {
	return registerbtnn;
}

public WebElement getLoginbtn() {
	return loginbtn;
}

public WebElement getSearchTxtBox() {
	return searchTxtBox;
}

public WebElement getSearchBtn() {
	return searchBtn;
}

  public WebElement getSearchEdtBtn() {
	return searchEdtBtn;
}
public void  loginButton() {
	loginbtn.click();
	
}
public void searchButton() {
	  searchBtn.click();
  }
  public void registerButton() {
	  registerbtnn.click();
  }
  public void searchtextbox(String city) {
	  searchTxtBox.sendKeys(city);
  }
  public void searchEdtButton() {
	  searchEdtBtn.click();
	  
  }
  
}
