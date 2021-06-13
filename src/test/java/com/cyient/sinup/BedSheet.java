package com.cyient.sinup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BedSheet {
	private By emailLocator=By.name("email");
	private By usernameLocator = By.id("authUser");
	
	private By pincodeLocator=By.id("postcode");
	private By addressLocator=By.id("street");
	private By cityLocator=By.id("city");
	private By StateLocator=By.id("region");
	

	private WebDriver driver;
	private CharSequence email;

	public BedSheet(WebDriver driver) {
		this.driver = driver;
	}

	public void sendUsername(String username) {
		driver.findElement(usernameLocator).sendKeys(username);
	}

	public void sendPincode1(String pincode) {
		driver.findElement(pincodeLocator).sendKeys(pincode);
	}
	public void sendAddress(String address) {
		driver.findElement(addressLocator).sendKeys(address);
	}
	
	public void sendCity(String city) {
		driver.findElement(cityLocator).sendKeys(city);
	}
	
	public void sendState(String state) {
		driver.findElement(StateLocator).sendKeys(state);
	}
	
	
}
