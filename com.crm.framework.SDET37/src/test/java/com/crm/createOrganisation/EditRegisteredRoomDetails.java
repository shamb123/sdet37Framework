package com.crm.createOrganisation;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.ApartmentRoomPage;
import com.crm.objectRepository.Homepage_Admin;
import com.crm.objectRepository.ListOfApartmentDetailspage;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.LoginnnPage;
@Listeners(com.crm.genericUtilities.ListenerImplTn.class)
public class EditRegisteredRoomDetails extends BaseClass {
	@Test
	//(retryAnalyzer=com.crm.genericUtilities.RetryAnalyserImptn.class)
	
	public void edit() throws Throwable {
		LoginnnPage log= new LoginnnPage(driver);
		log.loginButton();
		
		 String uss = fLib.getPropertKeyValue("username");
    	 String pwdd = fLib.getPropertKeyValue("password");
		 Assert.fail();
		 LoginPage lp= new  LoginPage(driver);
		 lp.loginToAppli(uss,pwdd);
		
		 Homepage_Admin hpg= new Homepage_Admin(driver);
		 hpg.DetailsEdt();
		
		 ListOfApartmentDetailspage lapg= new ListOfApartmentDetailspage(driver);
		 lapg.clickOnEdit();
		 
		 String city = eLib.readDataFromExcel("Sheet1",3,3);
		 ApartmentRoomPage apg= new  ApartmentRoomPage(driver);
		 apg.editCityBtn(city);
		 
		 apg.submitButton();
		 
		hpg.logoutButton();
		 LoginnnPage lpgg= new LoginnnPage(driver);
		 lpgg.searchButton();
		
		 log.searchtextbox(city);
		 log.searchEdtButton();
		 
		 
		 
		 
	}

}
