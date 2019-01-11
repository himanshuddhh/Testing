package com.amz.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amz.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	WebElement continue_btn;
	
	@FindBy(xpath="//input[contains(@id,'ap_password')]")
	WebElement password;
	
	
	@FindBy(xpath="//input[contains(@id,'signInSubmit')]")
	WebElement login_btn;
	
	@FindBy(xpath="//a[contains(@id,'createAccountSubmit')]")
	WebElement signUp_btn;
	
	public LoginPage() throws Exception{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	
	}
	
	
	public String validateTitle(){
		
		return driver.getTitle();
		
	}
	
	public HomePage validateLogin(String un,String pwd) throws IOException{
		
		username.sendKeys(un);
		continue_btn.click();
		password.sendKeys(pwd);
		login_btn.click();
		
		return new HomePage();
		
		
	}
	
	public SignUpPage newUser() throws IOException{
		
		signUp_btn.click();
		return new SignUpPage();
	}
	
	

}
