package com.seleniumtestngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class failedLogin {
	private WebDriver driver;
	
	public failedLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public void failedLogins() {
		driver.findElement(By.linkText("login")).click();
		assert driver.findElement(By.xpath("//b[text()='LOGIN KASIR']")).getText().contains("LOGIN KASIR");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("hackers");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("hackers");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.xpath("//div[contains(text(),'Login Anda ditolak')]")).getText()
				.contains("Login Anda ditolak");
	}

}
