package com.seleniumtestngtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class baseClass {
	WebDriver driver;

	@Test(priority = 1)
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost/program-toko/");
		String title = driver.getTitle();
		System.out.println("Page Title : " + title);
		Assert.assertEquals(title, "Toko Aksessori Komputer dan Gadget");
		
	}
	
	@Test(priority = 2)
	public void setDown() {
		driver.quit();
	}
}
