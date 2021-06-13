package com.cyient.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.cyient.base.Online;

public class TC1 extends Online {
	

	@Test
	public void TermsTest() {
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rak");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("RK@gmail.com");
		driver.findElement(By.xpath("//input[@id='password1-mreg']")).sendKeys("Rakdhu@123");
		driver.findElement(By.xpath("//input[@id='formSubmit-popup_reg_form']")).click();
	}
}
	
	
	/*private By FirstNameLocator = By.id("firstName");
	private By EmailLocator = By.id("RK@gmail.com");
	private By passwordLocator=By.id("Rakdhu@123");
	
	private By RegisterLocator=By.xpath("//input[@id='formSubmit-popup_reg_form']");
    
	
	
	private WebDriver driver;

	public  SigUp(WebDriver driver) {
		this.driver = driver;
	}

	public void sendFirstName(String username) {
		driver.findElement(FirstNameLocator).sendKeys(username);
	}
	
	
	public void sendEmail(String username) {
		driver.findElement(EmailLocator).sendKeys(username);
	}

	public void sendPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}
	
	
	public void clickOnRegister()
	{
		driver.findElement(RegisterLocator).click();
	}
}
	

	
	/*@Test
	public void shoping() {

		
		driver.findElement(By.id("account-actions-signup")).click();
		
		
		//driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rak");
		
		driver.findElement(By.id("firstName")).sendKeys("Rak");
		
		//driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Dhu");
		
		driver.findElement(By.id("lastName")).sendKeys("Dhu");
		
		//driver.findElement(By.xpath(" //input[@id='email']")).sendKeys("RK@gmail.com");
		
		driver.findElement(By.id("email")).sendKeys("RK@gmail.com");
		
		//driver.findElement(By.xpath(" //input[@id='pwd']")).sendKeys("rakdhu");
		
		driver.findElement(By.id("pwd")).sendKeys("rakdhu");
		
		/*driver.findElement(By.xpath("//input[@id='mobileFieldVerifySignUp']]")).sendKeys("678");*/
		
		/*driver.findElement(By.id("recaptcha-anchor")).click();
		
		
		driver.findElement(By.xpath("//button[@id='signup-form-submit']")).click();
	}
}*/		


		

	


