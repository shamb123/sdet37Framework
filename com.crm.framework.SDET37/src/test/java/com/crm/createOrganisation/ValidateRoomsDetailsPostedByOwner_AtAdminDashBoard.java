package com.crm.createOrganisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.genericUtilities.IConstants;
import com.crm.objectRepository.HomePage_owner;
import com.crm.objectRepository.Homepage_Admin;
import com.crm.objectRepository.ListOfApartmentDetailspage;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.LoginnnPage;
import com.crm.objectRepository.RegisterPage;

public class ValidateRoomsDetailsPostedByOwner_AtAdminDashBoard extends BaseClass
{
      @Test
      public void roomRegistration() throws Throwable {
    	  
    	 String us = fLib.getPropertKeyValue("username_owner");
    	 String pwd = fLib.getPropertKeyValue("password_owner");
    	 String uss = fLib.getPropertKeyValue("username");
    	 String pwdd = fLib.getPropertKeyValue("password");
    	  LoginPage lpg= new LoginPage(driver);
    	  lpg.loginToAppli(us, pwd);
    	  
    	  //Fetch the name,num,alt num,email,plot num,room,country,state,city,rent,sale,deposit,
   //facilities,description,landmark,address
    	  String name = eLib.readDataFromExcel("Sheet1",0 ,0 );
    	  String num = eLib.readDataFromExcel("Sheet1",1 ,0 );
    	  String numm = eLib.readDataFromExcel("Sheet1",2 ,0 );
    	  String email = eLib.readDataFromExcel("Sheet1",3 ,0 );
    	  String plotnum = eLib.readDataFromExcel("Sheet1",4 ,0 );
    	  String room = eLib.readDataFromExcel("Sheet1",5 ,0 );
    	  String country = eLib.readDataFromExcel("Sheet1",6 ,0 );
    	  String state = eLib.readDataFromExcel("Sheet1",7 ,0 );
    	  String city = eLib.readDataFromExcel("Sheet1",8 ,0 );
    	  String rent = eLib.readDataFromExcel("Sheet1",9 ,0 );
    	  String sale = eLib.readDataFromExcel("Sheet1",10 ,0 );
    	  String deposit = eLib.readDataFromExcel("Sheet1",11 ,0 );
    	  String facilities = eLib.readDataFromExcel("Sheet1",12 ,0 );
    	  String description = eLib.readDataFromExcel("Sheet1",13 ,0 );
    	  String landmark = eLib.readDataFromExcel("Sheet1",14 ,0 );
    	  String address = eLib.readDataFromExcel("Sheet1",15,0 );
    	 // String value = eLib.readDataFromExcel("Sheet1",0 ,3 );
    	 
    	  
    	  HomePage_owner hmo= new HomePage_owner(driver);
    	  hmo.getRegisterLink().click();
    	  
    	  //register room
    	 RegisterPage rpg=new RegisterPage(driver);
    	  rpg.fullname(name);
    	  rpg.MobileEdtt(num);
    	 rpg.altMobEdt(numm);
    	 rpg.email(email);
    	 
    	 Thread.sleep(5000);
     	 rpg.plotNum(plotnum);
    	 rpg.rooms(room);
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
    	 
    	 //Thread.sleep(5000);
    	 wLib.scrollBarAction(driver);
    	// rpg.getImageEdt().click();
    	// rpg.getImageEdt().sendKeys("‪./images/Capture.PNG");
    	 WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
    	 ele.sendKeys("C:\\Users\\Shambhavi Patil\\git\\sdet37Framework\\com.crm.framework.SDET37\\images\\Capture.PNG");
    	// rpg.vaccantDrpDwn(value);
    	 //driver.findElement(By.xpath("//select[@class='form-control']/../../..//input[@name='image']")).sendKeys(path);
    	
    	 Thread.sleep(5000);
    	 rpg.submit();
    	 
    	 HomePage_owner hpo = new HomePage_owner(driver);
    	 hpo.logoutBtn();
    	  
    	 LoginnnPage lp = new LoginnnPage(driver);
    	 lp.getLoginbtn().click();
    	 
    	 lpg.loginToAppli(uss, pwdd);
    	 
    	 Thread.sleep(5000);
    	 //click on rooms for rent after logging in as admin
    	 Homepage_Admin hpog= new Homepage_Admin(driver);
    	 hpog.roomsforrent();
    	 
    	 //verify the room registered by owner
    	 
    	 /*ListOfApartmentDetailspage listOfApartmentDetailspage = new ListOfApartmentDetailspage(driver);
    	 listOfApartmentDetailspage.apartmentDetails(name);*/
    	  }
      
	
	
}
      
