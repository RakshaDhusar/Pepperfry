package com.cyient.sinup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BedSheet  {
	private By emailLocator=By.xpath("//input[@id='email']");
	private By usernameLocator =By.xpath("//input[@name='firstname']");
	private By passwordLocator =By.xpath("//input[@id='password1-mreg']");
	private By clickLocator= By.xpath("//input[@id='formSubmit-popup_reg_form']");
	private By mobileLocator=By.xpath("(//label[contains(text(),'Mobile Number')])[2]");
	private By termLocator= By.xpath("//a[normalize-space()='Terms & Conditions']");
	private WebDriver driver;
	

	public BedSheet(WebDriver driver) {
		this.driver = driver;
	}

	public void sendUsername(String username) {
		driver.findElement(usernameLocator).sendKeys(username);
	}
	
	public void sendMobile(String mobile) {
		driver.findElement(mobileLocator).sendKeys(mobile);
	}
	
	public void sendEmail(String email) {
		driver.findElement(emailLocator).sendKeys(email);
	}

	public void sendPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}
	
	public void click() {
		driver.findElement(clickLocator).click();
	}
	
	public void termClick() {
		driver.findElement(termLocator).click();
	}
	
	
	
	
}
