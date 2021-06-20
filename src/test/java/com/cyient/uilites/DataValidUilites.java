package com.cyient.uilites;

import java.io.IOException;



import org.testng.annotations.DataProvider;

import java.util.concurrent.*;

public class DataValidUilites {
	
	
	
	
	
	@DataProvider
	public Object[][] userdata() throws IOException
	{
		Object[][] main= ExcelUtilies.getSheetIntoObjectArray("src/test/resources/TestData/HomeDelivery.xlsx", "RegisterData"); 
		
		return main;
	}
	
	
	
}
