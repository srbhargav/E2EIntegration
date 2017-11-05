package org.automation.testing.datagenerators;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {
 
	 @DataProvider(name="Static")
	   public Object[][] testDataGenerator() throws Exception{
		   
		   FileInputStream file = new FileInputStream("./TestData/TestData.xlsx");
		   XSSFWorkbook workbook = new XSSFWorkbook(file);
		   XSSFSheet loginSheet = workbook.getSheet("Login");
		   int numberofRows = loginSheet.getPhysicalNumberOfRows();
		   Object [][] testData = new Object[numberofRows][2];
		   
		   for(int i=0;i<numberofRows;i++)
		   {
			   XSSFRow row = loginSheet.getRow(i);
			   XSSFCell username = row.getCell(0);
			   XSSFCell password = row.getCell(1);
			   testData[i][0] = username.getStringCellValue();
			   testData[i][1] = password.getStringCellValue();
			   
		   }
		   
		   return testData;
	   }

	 @DataProvider(name="Register")
	   public Object[][] testDataGeneratorRegister() throws Exception{
		   
		   FileInputStream file = new FileInputStream("./TestData/TestData.xlsx");
		   XSSFWorkbook workbook = new XSSFWorkbook(file);
		   XSSFSheet loginSheet = workbook.getSheet("Register");
		   int numberofRows = loginSheet.getPhysicalNumberOfRows();
		   Object [][] testData = new Object[numberofRows][3];
		   
		   for(int i=0;i<numberofRows;i++)
		   {
			   XSSFRow row = loginSheet.getRow(i);
			   XSSFCell firstname = row.getCell(0);
			   XSSFCell  lastname = row.getCell(1);
			   XSSFCell phone = row.getCell(0);
			   testData[i][0] = firstname.getStringCellValue();
			   testData[i][1] = lastname.getStringCellValue();
			   testData[i][2] = phone.getStringCellValue();
			   
		   }
		   
		   return testData;
	   }

}


