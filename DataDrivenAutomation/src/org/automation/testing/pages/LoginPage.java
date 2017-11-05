package org.automation.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.testing.utility.Utility;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void enterUsername(String uname) throws Exception {
		driver.findElement(By.name(Utility.fetchlocatorvalues("login_username_name"))).sendKeys(uname);
	}
	
	public void enterPassword(String pass) throws Exception{
		driver.findElement(By.name(Utility.fetchlocatorvalues("login_password_name"))).sendKeys(pass);
	}
	
	public void ClickSignin() throws Exception{
		driver.findElement(By.name(Utility.fetchlocatorvalues("login_signin_name"))).click();
	}

}

