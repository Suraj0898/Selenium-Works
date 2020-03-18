package com.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.util.DriverFactory;
import com.util.DriverNames;

public class ElearningLoginTest {
	private String URL;
	private WebDriver driver=null;
	
	@Before
	public void setUp() throws Exception{
		URL="http://elearning.ohbreaks.com/";
		driver= DriverFactory.getDriver(DriverNames.CHROME);
	}
	
	@After
	public void tearDown() throws InterruptedException{
		Thread.sleep(3000);
		driver.close();
		
	}
	
	@Test
	public void test() {
		driver.get(URL);
		
		String loginBtn="login_main_btn";
		String mobileNumber="//*[@id='log_in_form']/form/div[1]/div[2]/input";
		String password ="//*[@id=\"log_in_form\"]/form/div[2]/input"; 
		String signInBtn ="//*[@id=\"log_in_form\"]/form/div[4]/div[1]/button";

		
		driver.findElement(By.id(loginBtn)).click();
		driver.findElement(By.xpath(mobileNumber)).sendKeys("123456789");
		driver.findElement(By.xpath(password)).sendKeys("secret@123");
		driver.findElement(By.xpath(signInBtn)).click(); 
		
		
		String retString="//*[@id=\"My_Books\"]/div[2]/h2/span";
;
		
		String logInName=driver.findElement(By.xpath(retString)).getText();

		assertEquals("Mr. Gordon", logInName);
	}

}
