package com.tests;

import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;
	//Logger log = Logger.getLogger(Logintest.class);
	
	
	@BeforeMethod
	public void setup(){
		//log.info("****************************** Starting test cases execution  *****************************************");

		System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver(); 
		//log.info("launching chrome broswer");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
		//log.info("entering application URL");
		//log.warn("Hey this just a warning message");
		//log.fatal("hey this is just fatal error message");
		//log.debug("this is debug message");
	}
	
	
	@Test(priority=1)
	public void freeCrmTitleTest(){
		//log.info("****************************** starting test case *****************************************");
		//log.info("****************************** freeCrmTitleTest *****************************************");
		String title = driver.getTitle();
		System.out.println(title);
		//log.info("login page title is--->"+title);
		Assert.assertEquals(title,"Free CRM software in the cloud for sales and service");
		
		//log.info("****************************** ending test case *****************************************");
		//log.info("****************************** freeCrmTitleTest *****************************************");

	}
	
	@Test(priority=2)
	public void freemCRMLogoTest(){
		//log.info("****************************** starting test case *****************************************");
		//log.info("****************************** freemCRMLogoTest *****************************************");

		boolean b = driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
		Assert.assertTrue(b);
		
		//log.info("****************************** ending test case *****************************************");
		//log.info("****************************** freemCRMLogoTest *****************************************");

	}
	
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
		//log.info("****************************** Browser is closed *****************************************");

		
	}
	
}	
	
	
	
	
	
	



