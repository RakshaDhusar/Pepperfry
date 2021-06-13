package com.cyient.uilites;

import java.io.IOException;



import org.testng.annotations.DataProvider;

import java.util.concurrent.*;

public class DataValidUilites {
	
	
	public Object[][] validCredentialData(){
	
		Object[][] main=new Object[1][3];
		
		main[0][0]= "Name";
		main[0][1]= "Mobile Number";
		main[0][2]= "Email ID";
		main[0][3]= "Password";
		
		main[1][0]= "Rak";
		main[1][1]= " ";
		main[1][2]= "RD@gmail.com";
		main[1][1]= "rakdhu";
		
	
		
		return main;
	}
	
	
	
	
	public Object[][] validCredentialExcelData() throws IOException
	{
		Object[][] main= ExcelUtilies.getSheetIntoObjectArray("src/test/resources/TestData/HomeDelivery.xlsx", "validCredentialExcelData"); 
		
		return main;
	}

	

}
