package org.automation.testing.testcases;

import org.automation.testing.base.DriverInstance;
import org.automation.testing.datagenerators.DataGenerator;
import org.automation.testing.pages.LoginPage;
import org.automation.testing.pages.RegisterPage;
import org.testng.annotations.Test;

public class TC_002_RegisterNewUser extends DriverInstance{
	@Test(dataProvider="Register", dataProviderClass=DataGenerator.class)
	public void tc_002_RegsiterNewUser(String fname, String lname, String num) throws Exception{
	   RegisterPage register = new RegisterPage(driver);
	   register.clickonRegisterButton();
	   register.enterFristName(fname);
	   register.enterLastName(lname);
	   register.enterPhoneNumber(num);
	}
	
}
