package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	static WebDriver driver=null;
	
	public static WebDriver getDriver(DriverNames driverName) {
		if(driverName.equals(DriverNames.CHROME)) {
			System.setProperty(DriverInfo.CHROME_KEY,DriverInfo.CHROME_PATH);
			driver=new ChromeDriver();
			
		} else if (driverName.equals(DriverNames.EDGE)) {
		
		} else if (driverName.equals(DriverNames.EDGE)) {
			
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		// make it maximise 
		driver.manage().window().maximize(); 
		
		return driver;
	}
}

	
