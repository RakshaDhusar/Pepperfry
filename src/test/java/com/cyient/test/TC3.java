package com.cyient.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.cyient.base.Online;

public class TC3 extends Online {
	

	@Test
	
	
	public void test() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[@id='regPopUp']//a[@class='popup-close']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("bedsheets");
		//driver.findElement(By.id("popup_overlay")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id='search_mini_form']/i")).click();
		
		//driver.findElement(By.xpath("//*[@id='search_mini_form']"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='searchButton']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='brandsnameSleep_Dove']")).click();
		
	
        Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='p_1_1_1740979']//div[@class='card-img-wrp center-xs card-srch-img-wrp']//img[1]")).click();
		//driver.findElement(By.xpath("//span[@class='v-product-offer-listitem-desc pf-block']")).sendKeys("0");
		//Select selectQuantity=new Select(driver.findElement(By.id("select2-quantity-container")));
		//selectQuantity.selectByVisibleText("2");
		Thread.sleep(2000);
		Set<String>Bed=driver.getWindowHandles();
		for(String tabs : Bed) {
			System.out.println(Bed);
			driver.switchTo().window(tabs);
		}
		driver.findElement(By.xpath("//a[normalize-space()='Add to Cart']")).click();
		driver.findElement(By.xpath(" //a[@id='vipGoToCartButton']")).click();
		driver.findElement(By.xpath("( //a[contains(text(),'PLACE ORDER')])[1]")).click();
		
		
		driver.findElement(By.xpath("//input[@id='nCheckout-userEmail']")).sendKeys("SAK@gmail.com");
		driver.findElement(By.xpath("//li[@class='nCheckoutLIactive']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'I Have A Password')]")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rak");
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("284002");
		driver.findElement(By.xpath("//textarea[@id='street']")).sendKeys("45,hfddcvbg");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Jhansi");
		
		Select selectState=new Select(driver.findElement(By.id("region")));
		selectState.selectByVisibleText("Uttar Pradesh");
		
		
		
		
		
		

		

		
	}
}