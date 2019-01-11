package com.amz.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amz.base.TestBase;

public class HomePage extends TestBase {
	
	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath="//input[contains(@id,'twotabsearchtextbox')]")
	WebElement searchBox;
	
	@FindBy(xpath="(//input[contains(@class,'nav-input')])[1]")
	WebElement search_btn;
	
	
	public RelatedProduct listOfProducts(String productName){
		
		
		searchBox.sendKeys(productName);
		return new RelatedProduct();
		
		
	}
	
}
