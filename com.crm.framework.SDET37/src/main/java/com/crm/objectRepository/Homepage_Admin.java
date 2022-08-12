package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Admin {
	
	public Homepage_Admin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//div[@class=\"alert alert-warning\"])[2]")
	private WebElement roomsForrentlnk;
	
	@FindBy(xpath="//a[text()='Details/Update']")
	private WebElement detailsOrUpdateEdtn;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//b[text()='Registered Users: ']")
	private WebElement registeredUsers;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerlnk;
	
	
	
	public WebElement getRoomsForrentlnk() {
		return roomsForrentlnk;
	}
	
	public WebElement getDetailsOrUpdateEdtn() {
		return detailsOrUpdateEdtn;
	}
	
	public WebElement getRegisterlnk() {
		return registerlnk;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
    
	public WebElement getRegisteredUsers() {
		return registeredUsers;
	}

	public void roomsforrent() {
		roomsForrentlnk.click();
	}
    public void DetailsEdt() {
    	detailsOrUpdateEdtn.click();
    }
    public void logoutButton() {
    	logoutbtn.click();
    }
    public void registeredUserLnk() {
    	registeredUsers.click();
    }
    public void registerLink() {
    	registerlnk.click();
    }
}
