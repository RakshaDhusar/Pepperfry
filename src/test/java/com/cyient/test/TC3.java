package com.cyient.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.cyient.base.Online;
import com.cyient.sinup.CheckoutPage;
import com.cyient.uilites.DataValidUilites;

public class TC3 extends Online {
	

	
	
	@Test
	public void test() throws InterruptedException {
		
		CheckoutPage page=new CheckoutPage(driver);
		page.PopUp();
		page.saveBed("bedsheets");
		Thread.sleep(3000);
		page.search();
		Thread.sleep(3000);
		page.sleep();
		 Thread.sleep(3000);
		 page.img();
		 Thread.sleep(2000);
		
		
		
	
     
		Set<String>Bed=driver.getWindowHandles();
		for(String tabs : Bed) {
			System.out.println(Bed);
			driver.switchTo().window(tabs);
		}
		
		page.add();
		page.button();
		page.order();
		
		
		Thread.sleep(5000);
		
		page.sendEmail("SD@gmail.com");
		page.checkout();
		page.pass();
		page.sendName("Rak");
		page.sendCode("284002");
		page.sendStreet("45,rggh");
		page.sendCity1("Jhansi");
		
		Select selectState=new Select(driver.findElement(By.id("region")));
		selectState.selectByVisibleText("Uttar Pradesh");
		
	
		 page.save();
		
		
		
		

		

		
	}
}