package com.crm.genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplTn implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {

	}


	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
	
	}
  
	public void onTestFailure(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		System.out.println("<---------------I am Listening--------------->");
		
		TakesScreenshot screenshot = (TakesScreenshot)BaseClass.sdriver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		LocalDateTime localDateTime = LocalDateTime.now();
		String dateTime = localDateTime.toString().replace(" ","_").replace(":", "_");
		File dst = new File("screenShots/"+"_"+testName+"_"+dateTime+".PNG");
		try {
		FileUtils.copyFile(src, dst);
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("problem in saving screenshot"+e.getMessage());
		}
		

		
		
}
}