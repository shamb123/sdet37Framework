package com.crm.CreateAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.genericUtilities.ExcelUtility;
import com.crm.objectRepository.RegisterPage;


public class AdminAndVerify extends BaseClass {


	@Test
	public void ToCheckForIndividualRoomRegistrationAsOccupied() {

		//Fetch the data from excel sheet
		ExcelUtility eLib=new ExcelUtility();
		String fullname = eLib.readDataFromExcel("owner", 1, 0);
		String mobNum = eLib.readDataFromExcel("owner", 1, 1);
		String Altnum = eLib.readDataFromExcel("owner", 1, 2);
		String email = eLib.readDataFromExcel("owner", 1, 3);
		String plotNum = eLib.readDataFromExcel("owner", 1, 4);
		String AvailRooms = eLib.readDataFromExcel("owner", 1, 5);
		String country = eLib.readDataFromExcel("owner", 1, 6);
		String state = eLib.readDataFromExcel("owner", 1, 7);
		String city = eLib.readDataFromExcel("owner", 1, 8);
		String rent = eLib.readDataFromExcel("owner", 1, 9);
		String sale = eLib.readDataFromExcel("owner", 1, 10);
		String deposit = eLib.readDataFromExcel("owner", 1, 11);
		String facilities = eLib.readDataFromExcel("owner", 1, 12);
		String description = eLib.readDataFromExcel("owner", 1, 13);
		String landmark = eLib.readDataFromExcel("owner", 1, 14);
		String address = eLib.readDataFromExcel("owner", 1, 15);
		String dropdown = eLib.readDataFromExcel("owner", 1, 16);
		String UpdatedDetail = eLib.readDataFromExcel("owner", 1, 17);

		//click on regester link
		RegisterPage registerpag=new RegisterPage(driver);

		registerpag.registerLnk();

		//Enter all the details
		RegisterPage registerpage=new RegisterPage(driver);
		registerpage.fullname(fullname);
		registerpage.MobileEdtt(mobNum);
		registerpage.altMobEdt(Altnum);
		registerpage.email(email);
		registerpage.plotNum(plotNum);
		registerpage.rooms(AvailRooms);
		registerpage.country(country);
		registerpage.state(state);
		registerpage.city(city);
		registerpage.rent(rent);
		registerpage.sale(sale);
		registerpage.deposit(deposit);
		registerpage.facilities(facilities);
		registerpage.description(description);
		registerpage.landmark(landmark);
		registerpage.addressDetails(address);

		WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
		element.sendKeys("C:\\Users\\Harisha M V\\git\\RMG\\src\\test\\resources\\Screenshot (2).png");

		//click on register button
		registerpage.submit();

		//navigate to details page
		registerpag.getDetailsupdatelnk().click();

		//verify

		String element1 = driver.findElement(By.xpath("//p[text()='Adithi']/../..//b[text()='Vacant']")).getText();
		System.out.println(element1);
		if (element1.contains("Vacant")) {
			System.out.println("pass");

		}else {
			System.out.println("fail");
		}



	}

}
