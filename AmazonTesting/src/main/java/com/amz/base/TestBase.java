package com.amz.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase() throws IOException {
		// TODO Auto-generated constructor stub
		
		
		prop=new Properties();
		FileInputStream fileInputStream=new FileInputStream("C:/Users/himanshu.dixit/w2/AmazonTesting/src/main/java/com/amz/config/config.properties");
		
		prop.load(fileInputStream);
		
	}
	
	public void initialization(){
		String browser=prop.getProperty("browser");
		if(browser=="chrome"){
		
		
		System.setProperty("webdriver.chrome.driver", "D:/selenium_drivers/new/chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		
		
	}
	
	

}
