package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListOfApartmentDetailspage {
	   
	public ListOfApartmentDetailspage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	/*@FindBy(xpath = "Owner Name: ") private WebElement apartmentVerif;
	public WebElement getApartmentVerif() {
		return apartmentVerif;
	}
	
	public void apartmentDetails(String ExpText) {
		
	
	  String text =apartmentVerif.getText();
	  if (text.contains(ExpText)) {
		  System.out.println("apartment verified");
	  }
	  else {
		System.out.println("Apartment not verified");
	}*/
		@FindBy(xpath="//p[text()='mahantesh']/../../..//a[text()='Edit']")
		private WebElement Editbtn;
		
		public WebElement getEditbtn() {
			return Editbtn;
		}
		public void clickOnEdit() {
			Editbtn.click();
		}
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

