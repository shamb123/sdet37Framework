package com.HouseRental.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.DetailsOrUpdatePage;
import com.crm.objectRepository.Homepage_Admin;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.LoginnnPage;
import com.crm.objectRepository.RegisterPage;

public class VerifyUserCanSearchRoomRegisteredByAdmin extends BaseClass{
	@Test

	public void verifyUserCanSearchRoomRegisteredByAdmin()
	{
		LoginnnPage log= new LoginnnPage(driver);
		log.loginButton();
		
		
		 String uss = fLib.getPropertKeyValue("username");
    	 String pwdd = fLib.getPropertKeyValue("password");
		  LoginPage lp = new LoginPage(driver);
		 lp.loginToAppli(uss,pwdd);
		

		//fetch data from excel
		String fullName = eLib.readDataFromExcel("individualhomeregistration", 1, 2);
		String mobileNumber = eLib.readDataFromExcel("individualhomeregistration", 1, 3);
		String alternateMobile = eLib.readDataFromExcel("individualhomeregistration", 1, 4);
		String email = eLib.readDataFromExcel("individualhomeregistration", 1, 5);
		String plotNumber = eLib.readDataFromExcel("individualhomeregistration", 1, 6);
		String availableRooms = eLib.readDataFromExcel("individualhomeregistration", 1, 7);
		String country = eLib.readDataFromExcel("individualhomeregistration", 1, 8);
		String state = eLib.readDataFromExcel("individualhomeregistration", 1, 9);
		String city = eLib.readDataFromExcel("individualhomeregistration", 1, 10);
		String rent = eLib.readDataFromExcel("individualhomeregistration", 1, 11);
		String sale = eLib.readDataFromExcel("individualhomeregistration", 1, 12);
		String deposit = eLib.readDataFromExcel("individualhomeregistration", 1, 13);
		String facilities = eLib.readDataFromExcel("individualhomeregistration", 1, 14);
		String description = eLib.readDataFromExcel("individualhomeregistration", 1, 15);
		String landmark = eLib.readDataFromExcel("individualhomeregistration", 1, 16);
		String address = eLib.readDataFromExcel("individualhomeregistration", 1, 17);
		String vacant = eLib.readDataFromExcel("individualhomeregistration", 1, 18);
		String keywordName = eLib.readDataFromExcel("homefeature", 1, 1);
		String location = eLib.readDataFromExcel("homefeature", 1, 2);
		
		Homepage_Admin  hpg = new Homepage_Admin (driver);
		hpg.registerLink();
		
		RegisterPage rpg = new RegisterPage (driver);
		
		rpg.fullname(fullName);
		rpg.MobileEdtt(mobileNumber);
		rpg.altMobEdt(alternateMobile);
		rpg.email(email);
		rpg.plotNum(plotNumber);
		rpg.rooms(availableRooms);
		rpg.country(country);
		rpg.state(state);
		rpg.city(city);
		rpg.rent(rent);
		rpg.sale(sale);
		rpg.deposit(deposit);
		rpg.facilities(facilities);
		rpg.description(description);
		rpg.landmark(landmark);
		rpg.addressDetails(address);
		rpg.vaccantDrpDwn(vacant);
	
		WebElement element = driver.findElement(By.xpath("//h2[text()='Register Room']/..//input[@id='image']"));
		element.sendKeys("C:\\Users\\soumya\\Desktop\\ExcelData1.xlsx");
		rpg.submit();
		
		DetailsOrUpdatePage detailspage = new DetailsOrUpdatePage(driver);
		detailspage.getVerifyVacant();
		detailspage.clickLogoutBtn();
		
		LoginnnPage lpgg= new LoginnnPage (driver);
		lpgg.registerButton();

		
		lpgg.searchButton();
		
		lpgg.searchKeyword(keywordName);
		lpgg.searchtextbox(location);
		lpgg.searchEdtButton();
		
		
		

	}

}
