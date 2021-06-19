package com.cyient.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.cyient.base.Online;
import com.cyient.sinup.BedSheet;
import com.cyient.uilites.DataValidUilites;


public class TC1 extends Online {
	

	@Test(dataProvider="userdata",dataProviderClass =DataValidUilites.class)
	public void TermsTest(String name,String email, String password) throws InterruptedException {
	   
		BedSheet Bed=new BedSheet(driver);
		Thread.sleep(5000);
		Bed.sendUsername(name);
		//Bed.sendMobile(mobilenumber);
		Bed.sendEmail(email);
		Bed.sendPassword(password);
		Bed.click();
				
	}
}
	
	
	
		

	


