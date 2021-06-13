package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.Online;

public class TC2 extends Online {
	
	
	@Test
	public void TermsTest() {
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rak");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("RK@gmail.com");
		driver.findElement(By.xpath("//input[@id='password1-mreg']")).sendKeys("Rakdhu@123");
		/*driver.findElement(By.xpath("//input[@id='formSubmit-popup_reg_form']")).click();*/
		
		

		 driver.findElement(By.xpath("//a[normalize-space()='Terms & Conditions']")).click();
		 
		 String actualTermText= driver.findElement(By.partialLinkText("Terms and Conditions")).getText();
			Assert.assertEquals(actualTermText, "Terms of Use");
		

	}
}

	
		
	/*	@Test
		public void shoping() {

			
		//	driver.findElement(By.xpath("//span[@class='menu-text userSpan']//a[@id='account-actions-signup']")).click();
			driver.findElement(By.id("account-actions-signup")).click();

			
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rak");
			
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Dhu");
			
			driver.findElement(By.xpath(" //input[@id='email']")).sendKeys("RK@gmail.com");
			
			driver.findElement(By.xpath(" //input[@id='pwd']")).sendKeys("rakdhu");
			
			driver.findElement(By.xpath("//input[@id='mobileFieldVerifySignUp']")).sendKeys("9140186209");
			
			driver.findElement(By.id("recaptcha-anchor")).click();
			
			
			driver.findElement(By.xpath("//button[@id='signup-form-submit']")).click();
			
			driver.findElement(By.xpath("//a[normalize-space()='Terms and Conditions']")).click();
			
			/*driver.findElement(By.id("mobileNoInp")).sendKeys("9140186209");
			driver.findElement(By.id("otp-container")).click();*/
			
			
			
			



