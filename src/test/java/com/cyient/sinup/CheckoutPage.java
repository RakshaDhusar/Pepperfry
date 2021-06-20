package com.cyient.sinup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	private By bedsheetLocator = By.xpath("//div[@id='regPopUp']//a[@class='popup-close']");
	private By emailLocator=By.xpath("//input[@id='nCheckout-userEmail']");
	private By nameLocator=By.xpath("//input[@id='name']");
	private By codeLocator=By.xpath("//input[@id='postcode']");
	private By streetLocator=By.xpath("//textarea[@id='street']");
	private By cityLocator=By.xpath("//input[@id='city']");
	private By buttonLocator= By.xpath(" //a[@id='vipGoToCartButton']");
	private By addLocator= By.xpath("//a[normalize-space()='Add to Cart']");
	private By orderLocator= By.xpath("( //a[contains(text(),'PLACE ORDER')])[1]");
	private By passwordLocator= By.xpath("//label[contains(text(),'I Have A Password')]");
	private By closeLocator= By.xpath("//div[@id='regPopUp']//a[@class='popup-close']");
	private By searchLocator= By.xpath("//input[@id='searchButton']");
	private By sleepLocator= By.xpath("//label[@for='brandsnameSleep_Dove']");
	private By imgLocator= By.xpath("//div[@id='p_1_1_1740979']//div[@class='card-img-wrp center-xs card-srch-img-wrp']//img[1]");
	private By saveLocator=By.xpath("//input[@id='search']");
	private By checkoutLocator=By.xpath("//li[@class='nCheckoutLIactive']");
	private By passLocator=By.xpath("//label[contains(text(),'I Have A Password')]");
	private By save1Locator=By.xpath("//button[normalize-space()='SAVE & CONTINUE']");
	private WebDriver driver;
	

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	//public void BedsheetUsername(String bedsheet) {
		//driver.findElement(bedsheetLocator).sendKeys(bedsheet);
	public void PopUp() {
		driver.findElement(bedsheetLocator).click();
	}

	
	
	public void sendEmail(String email)
	{
		
		driver.findElement(emailLocator).sendKeys(email);
	}
	public void sendName(String name) {
		driver.findElement(nameLocator).sendKeys(name);
	}
	public void sendCode(String code) {
		driver.findElement(codeLocator).sendKeys(code);
	}
	public void sendStreet(String street) {
		driver.findElement(streetLocator).sendKeys(street);
	}
	public void sendCity1(String city) {
		driver.findElement(cityLocator).sendKeys(city);
	}
	public void add() {
		driver.findElement(addLocator).click();
	}
	public void button() {
		driver.findElement(buttonLocator).click();
	}
	public void order() {
		driver.findElement(orderLocator).click();
	}
	public void passwod() {
		driver.findElement(passwordLocator).click();
	}
	public void close() {
		driver.findElement(closeLocator).click();
	}public void search() {
		driver.findElement(searchLocator).click();
	}public void sleep() {
		driver.findElement(sleepLocator).click();
	}public void img() {
		driver.findElement(imgLocator).click();
	}
	public void saveBed(String save) {
		driver.findElement(saveLocator).sendKeys(save);
	}
	
	public void checkout() {
		driver.findElement(checkoutLocator).click();
	}
	
	public void pass() {
		driver.findElement(passLocator).click();
	}
	
	public void save() {
		driver.findElement(save1Locator).click();
	}
}


