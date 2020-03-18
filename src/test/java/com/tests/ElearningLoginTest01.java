package com.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.ElearningLoginPOM;
import com.util.DriverFactory;
import com.util.DriverNames;

public class ElearningLoginTest01 {

	private WebDriver driver = null;
	private ElearningLoginPOM eLearningLoginPOM = null;
	
	@Before
	public void setUp() throws Exception{
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		eLearningLoginPOM = new ElearningLoginPOM(driver);
	}
	
	@After
	public void tearDown() throws InterruptedException{
		Thread.sleep(3000);
		
	}
	
	@Test
	public void test() {
		eLearningLoginPOM.loadPage();
		eLearningLoginPOM.clickLoginButton();
		eLearningLoginPOM.sendMobileNumber("1234");
		eLearningLoginPOM.sendPassword("secretkey");
		eLearningLoginPOM.clickSignInButton();
		
		assertEquals("Mr. Gordan",eLearningLoginPOM.getLoginName());
		
	}
	
}
