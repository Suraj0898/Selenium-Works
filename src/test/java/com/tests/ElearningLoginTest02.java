package com.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.pom.ElearningLoginPOM01;
import com.util.DriverFactory;
import com.util.DriverNames;
import com.waits.WaitTypes;

public class ElearningLoginTest02 {
	
	private WebDriver driver = null;
	private ElearningLoginPOM01 eLearningLoginPOM = null;
	private WaitTypes waitType;
	
	@Before
	public void setUp() throws Exception{
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		eLearningLoginPOM = new ElearningLoginPOM01(driver);
	}
	
	@After
	public void tearDown() throws InterruptedException{
		Thread.sleep(3000);
		
	}
	
	@Test
	public void test() {
		
		eLearningLoginPOM.loadPage();
		eLearningLoginPOM.clickLoginBtn();
		eLearningLoginPOM.sendMobileNumber("1234");
		eLearningLoginPOM.sendPassword("qwerty");
		eLearningLoginPOM.clickSignInBtn();
		
		assertEquals("Mr. Gordan",eLearningLoginPOM.getLoginName());
		
	}
	
}
