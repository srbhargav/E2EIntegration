package org.automation.testing.testcases;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.testing.base.DriverInstance;
import org.automation.testing.datagenerators.DataGenerator;
import org.automation.testing.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_ValidateLoginFunctionality extends DriverInstance {

   @Test(dataProvider="Static", dataProviderClass=DataGenerator.class)
  
   public void tc_001_login_functionality(String uname, String pass) throws Exception{
	   LoginPage login = new LoginPage(driver);
	   login.enterUsername(uname);
	   login.enterPassword(pass);
	   login.ClickSignin();
			      
   }

}
