package com.cyient.sinup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	private By usernameLocator = By.id("authUser");
	private By emailLocator=By.name("email");
	private By passwordLocator=By.id("clearPass");
	
	private By RegisterLocator=By.xpath("//button[@type='submit']");
	private By errorLocator=By.xpath("//div[contains(text(),'Invalid')]");

	private WebDriver driver;
	private CharSequence email;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void sendUsername(String username) {
		driver.findElement(usernameLocator).sendKeys(username);
	}

	public void sendPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}
	
	public void selectLanaguageByText(String langaugeText)
	{
		
		driver.findElement(emailLocator).sendKeys(email);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(RegisterLocator).click();
	}
	
	//getErrorMessage()
	public String getErrorMessage()
	{
		return driver.findElement(errorLocator).getText().trim();
	}
}


