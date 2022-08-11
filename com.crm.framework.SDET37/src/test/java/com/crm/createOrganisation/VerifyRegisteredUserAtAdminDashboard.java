package com.crm.createOrganisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.Homepage_Admin;
import com.crm.objectRepository.ListofUsersPage;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.LoginnnPage;
import com.crm.objectRepository.RegisterPageToCreateAccount;

public class VerifyRegisteredUserAtAdminDashboard extends BaseClass{
	@Test
	public void registerField() throws Throwable {
		
		LoginnnPage lpg= new LoginnnPage(driver);
		lpg.registerButton();
		
		String name = eLib.readDataFromExcel("Sheet1", 0, 4);
		String username = eLib.readDataFromExcel("Sheet1", 1, 4);
		String num = eLib.readDataFromExcel("Sheet1", 2, 4);
		String emaill = eLib.readDataFromExcel("Sheet1", 3, 4);
		String password = eLib.readDataFromExcel("Sheet1", 4, 4);
		String pwd = eLib.readDataFromExcel("Sheet1", 5, 4);
		
		RegisterPageToCreateAccount rpg= new RegisterPageToCreateAccount(driver);
		
		rpg.fullName(name);
		rpg.userName(username);
		rpg.mobileEdtt(num);
		rpg.email(emaill);
		rpg.passwordtxtbx(password);
		rpg.confirmPassword(pwd);
		Thread.sleep(3000);
		rpg.submit();
		String submittext = rpg.getSubmitBtn().getText();
		System.out.println(submittext);
		Thread.sleep(3000);
		rpg.loginButtonn();
		
		 String uss = fLib.getPropertKeyValue("username");
		 Thread.sleep(3000);
    	 String pwdd = fLib.getPropertKeyValue("password");
		
		 LoginPage lp= new  LoginPage(driver);
		 lp.loginToAppli(uss,pwdd);
		 
		 Homepage_Admin hpg = new Homepage_Admin(driver);
		 Thread.sleep(3000);
		 hpg.registeredUserLnk();
		 Thread.sleep(3000);
		 
		 
		String users = driver.findElement(By.xpath("//h2[text()='List Of Usres']")).getText();		
		System.out.println(users);
		
		ListofUsersPage lpug= new ListofUsersPage(driver);
		String usernme = lpug.getUsernameEdt().getText();
		if(usernme.contains(username)) {
			System.out.println("Account is been registered");
		}else {
			System.out.println("Account is not been registered");
		}
		 
		
	}

}
