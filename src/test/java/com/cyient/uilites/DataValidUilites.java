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
	
	
	public Object[][] validClData(){
		
		Object[][] main=new Object[1][6];
		
		main[0][0]= "Email ID";
		main[0][1]= "Name";
		main[0][2]= "Mobile Number";
		main[0][3]= "Pincode";
		main[0][4]= "Address";
		main[0][5]= "City";
		main[0][6]= "State";
		
		main[1][0]= "RD@gmail.com";
		main[1][1]= "Rak";
		main[1][2]= " ";
		main[1][3]= "284002";
		main[1][3]= "45,Fgffgg";
		main[1][3]= "Agra";
		main[1][3]= "Uttar Pradesh";

		return main;

}
	public Object[][] validClExcelData() throws IOException
	{
		Object[][] main= ExcelUtilies.getSheetIntoObjectArray("src/test/resources/TestData/Payment Report.xlsx", "validCredentialExcelData"); 
		
		return main;
	}
}
