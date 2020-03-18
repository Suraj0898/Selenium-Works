package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElearningLoginPOM {
	private WebDriver driver=null;
	private String url="http://elearning.ohbreaks.com/";
	
	public ElearningLoginPOM(WebDriver driver) {
		this.driver=driver;
	}
	
	public void loadPage() {
		driver.get(url);
	}
	
	public void closePaged() {
		driver.close();
	}
	
	public void clickLoginButton() {
		driver.findElement(By.id("login_main_btn")).click();
	}
	
	public void sendMobileNumber(String mobileNumber) {
		driver.findElement(By.xpath("//*[@id='log_in_form']/form/div[1]/div[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id='log_in_form']/form/div[1]/div[2]/input")).sendKeys(mobileNumber);
	}
	
	public void sendPassword(String password) {
		driver.findElement(By.xpath("//*[@id=\"log_in_form\"]/form/div[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"log_in_form\"]/form/div[2]/input")).sendKeys(password);
	}

	public void clickSignInButton() {
		driver.findElement(By.xpath("//*[@id=\"log_in_form\"]/form/div[4]/div[1]/button")).click();
	}
	
	public String getLoginName() {
		return driver.findElement(By.xpath("//*[@id=\"My_Books\"]/div[2]/h2/span")).getText(); 
	}

}
