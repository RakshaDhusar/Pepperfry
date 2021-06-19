package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.Online;
import com.cyient.sinup.BedSheet;
import com.cyient.uilites.DataValidUilites;

public class TC2 extends Online {
	
	
	
	@Test(dataProvider="userdata",dataProviderClass =DataValidUilites.class)
	public void TermsTest(String name,String email, String password) throws InterruptedException {
	   
		BedSheet Bed=new BedSheet(driver);
		Thread.sleep(5000);
		Bed.sendUsername(name);
		//Bed.sendMobile(mobilenumber);
		Bed.sendEmail(email);
		Bed.sendPassword(password);
		Bed.click();
		Bed.termClick();

		
		 
		 String actualTermText= driver.findElement(By.partialLinkText("Terms and Conditions")).getText();
			Assert.assertEquals(actualTermText, "Terms of Use");
		

	}
}

	
		
	