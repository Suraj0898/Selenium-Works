package com.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestElearningEx01 {
public static void main(String[] args) {
	//TODO 1- Load the Browser
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sursuhas\\Desktop\\Sapient_Training_Jan_2020_Suraj\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
	String URL="http://elearning.ohbreaks.com/";
	WebDriver driver=new ChromeDriver();
	
	//TODO 2- Open the site
	driver.get(URL);
	
	//TODO 3- Process
	System.out.println("Title is " +driver.getTitle());
	
	//TODO 4- Close
	driver.quit();
	
}
}
