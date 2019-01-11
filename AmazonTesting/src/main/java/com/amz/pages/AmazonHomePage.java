package com.amz.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amz.base.TestBase;

public class AmazonHomePage extends TestBase{
	
	
	public AmazonHomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//span[contains(text(),'Hello. Sign in')]")
	WebElement signIn;
	
	public LoginPage getSignIn() throws Exception{
		
		signIn.click();
		return new LoginPage();
		
	}
	

}
