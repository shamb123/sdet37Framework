package com.HouseRental.Admin;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.ApartmentRoomPage;
import com.crm.objectRepository.ApartmentRoomPagee;
import com.crm.objectRepository.DetailsOrUpdatePage;
import com.crm.objectRepository.Homepage_Admin;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.LoginnnPage;
import com.crm.objectRepository.RegisterPage;
import com.crm.objectRepository.VerifyRegistrationApartmentRoomPage;

public class CreateApartmentRegistrationTest  extends BaseClass{
	@Test
	public void createApartmentRegistrationTest() throws InterruptedException

	{

		 String USERNAME = fLib.getPropertKeyValue("username");
		 String PASSWORD = fLib.getPropertKeyValue("password");
		 LoginnnPage loginpage = new LoginnnPage(driver);
		 loginpage.getLoginbtn();
		 
		//fetch the data from excel
		 String apartmentName = eLib.readDataFromExcel("apartmentregistration", 1, 2);
		String mobileNumber = eLib.readDataFromExcel("apartmentregistration", 1, 3);
		String alternativeMobileNumber = eLib.readDataFromExcel("apartmentregistration", 1, 4);
		String email = eLib.readDataFromExcel("apartmentregistration", 1, 5);
		String plotNumber = eLib.readDataFromExcel("apartmentregistration", 1, 6);
		String country = eLib.readDataFromExcel("apartmentregistration", 1, 7);
		String state = eLib.readDataFromExcel("apartmentregistration", 1, 8);
		String city = eLib.readDataFromExcel("apartmentregistration", 1, 9);
		String landmark = eLib.readDataFromExcel("apartmentregistration", 1, 10);
		String address = eLib.readDataFromExcel("apartmentregistration", 1, 11);
		//String path = eLib.readDataFromExcel("apartmentregistration", 1, 10);
		//WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
		//element.sendKeys("C:\\Users\\soumya\\Desktop\\aa.txt");
		
		String fullName = eLib.readDataFromExcel("apartmentregistration", 1, 13);
		String flatNumber = eLib.readDataFromExcel("apartmentregistration", 1, 14);
		String rooms = eLib.readDataFromExcel("apartmentregistration", 1, 15);
		String area = eLib.readDataFromExcel("apartmentregistration", 1, 16);
		//String purpose =  eLib.readDataFromExcel("apartmentregistration", 2, 15);
		String purpose = eLib.readDataFromExcel("apartmentregistration", 2, 17);
		//String floor = eLib.readDataFromExcel("apartmentregistration", 1, 18);
		String floor = eLib.readDataFromExcel("apartmentregistration", 3, 18);
		//String owner = eLib.readDataFromExcel("apartmentregistration", 1, 19);
		String rent = eLib.readDataFromExcel("apartmentregistration", 1, 20);
	    String deposit = eLib.readDataFromExcel("apartmentregistration", 1, 21);
		String facilities = eLib.readDataFromExcel("apartmentregistration", 1, 22);
		String description = eLib.readDataFromExcel("apartmentregistration", 1, 23);
		String vacantOroccupied = eLib.readDataFromExcel("apartmentregistration", 2, 24);
		
		//LoginnnPage loginpage = new LoginnnPage(driver);

		
		loginpage.getRegisterbtnn().click();
		
		
		//AdminDashboard admindashboard = new AdminDashboard(driver);
		//admindashboard.clickRegisterLink();
		
		RegisterPage registerroompage = new RegisterPage(driver);
		registerroompage.clickapartmentRegistrationLink();
		
		ApartmentRoomPagee apartmentroompage = new ApartmentRoomPagee(driver);
		apartmentroompage.setApartmentNameEdt(apartmentName);
		apartmentroompage.setmobileNumberEdt(mobileNumber);
		apartmentroompage.setalternativeMobileNumberEdt(alternativeMobileNumber);
		apartmentroompage.setemailEdt(email);
		apartmentroompage.setplotNumberEdt(plotNumber);
		apartmentroompage.setcountryEdt(country);
		apartmentroompage.setstateEdt(state);
		apartmentroompage.setcityeEdt(city);
		apartmentroompage.setlandmarkEdt(landmark);
		apartmentroompage.setaddressEdt(address);
		//apartmentroompage.setchooseImgFile(path);
		apartmentroompage.clickaddMoreBtn();
		apartmentroompage.setfullNameEdt(fullName);
		apartmentroompage.setFlatNumber(flatNumber);
		apartmentroompage.setroomsEdt(rooms);
		apartmentroompage.setareaEdt(area);
		apartmentroompage.setrentEdt(rent);
		apartmentroompage.setdepositEdt(deposit);
		apartmentroompage.setfacilitiesEdt(facilities);
		apartmentroompage.setdescriptionEdt(description);
		apartmentroompage.selectpurposeDropDown(purpose);
		apartmentroompage.selectfloorDropDown(floor);
		Thread.sleep(2000);
		//apartmentroompage.selectownerDropDown(owner);
		
		//apartmentroompage.selectvacantDropDownEdt(vacantOroccupied);
		//apartmentroompage.selectfloorDropDown(vacantOroccupied);
		apartmentroompage.clicksubmitBtn();
		
		
		
		WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
		element.sendKeys("C:\\Users\\soumya\\Desktop\\aa.txt");
		
		VerifyRegistrationApartmentRoomPage verifyregistrationapartmentroom = new VerifyRegistrationApartmentRoomPage(driver);
		verifyregistrationapartmentroom.getVerifyApartmentRoom();
		
		Homepage_Admin homepageadmin = new Homepage_Admin(driver);
		
		homepageadmin.getDetailsOrUpdateEdtn().click();
		
		DetailsOrUpdatePage detailspage = new DetailsOrUpdatePage(driver);
		detailspage.getVerifyVacant();
		detailspage.clickLogoutBtn();
		
		
		
		
		
		

	
		
	}
}
