package org.automation.testing.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.testing.utility.Utility;

public class RegisterPage {

WebDriver driver;
	
	public RegisterPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickonRegisterButton() throws Exception{
		driver.findElement(By.xpath(Utility.fetchlocatorvalues("login_clickonregister_xpath"))).click();
	}
	
	public void enterFristName(String fname) throws Exception {
		driver.findElement(By.name(Utility.fetchlocatorvalues("register_firstname_name"))).sendKeys(fname);
	}
	
	public void enterLastName(String lname) throws Exception{
		driver.findElement(By.name(Utility.fetchlocatorvalues("register_lastname_name"))).sendKeys(lname);
	}
	
	public void enterPhoneNumber(String num) throws Exception{
		driver.findElement(By.name(Utility.fetchlocatorvalues("register_phonenumber_name"))).sendKeys(num);
	}

}
