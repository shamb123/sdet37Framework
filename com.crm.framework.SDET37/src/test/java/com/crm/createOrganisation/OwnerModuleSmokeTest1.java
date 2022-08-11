package com.crm.createOrganisation;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.LoginnnPage;
import com.crm.objectRepository.RegisterPageToCreateAccount;

public class OwnerModuleSmokeTest1 extends BaseClass{
	@Test
	public void regitserToAppln() throws Throwable {
		//click on register button
		LoginnnPage log= new LoginnnPage(driver);
		log.getRegisterbtnn().click();
		
		RegisterPageToCreateAccount rptc= new RegisterPageToCreateAccount(driver);
		String name = eLib.readDataFromExcel("Sheet2", 4, 0);
		String username = eLib.readDataFromExcel("Sheet2", 5, 0);
		String num = eLib.readDataFromExcel("Sheet2", 6, 0);
		String emaill = eLib.readDataFromExcel("Sheet2", 7, 0);
		String password = eLib.readDataFromExcel("Sheet2", 8, 0);
		String pwd = eLib.readDataFromExcel("Sheet2", 9, 0);
		
		rptc.fullName(name);
		rptc.userName(username);
		rptc.mobileEdtt(num);
		Thread.sleep(5000);
		rptc.email(emaill);
		rptc.passwordtxtbx(password);
		rptc.confirmPassword(pwd);
		rptc.submit();
		Thread.sleep(5000);
	}

}
