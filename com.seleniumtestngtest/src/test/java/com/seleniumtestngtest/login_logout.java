package com.seleniumtestngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_logout {
	private WebDriver driver;
	
	public login_logout(WebDriver driver) {
		this.driver = driver;
	}
	
	public void logout() {
		driver.findElement(By.linkText("login")).click();
		assert driver.findElement(By.xpath("//b[text()='LOGIN KASIR']")).getText().contains("LOGIN KASIR");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.xpath("//b[contains(text(),'Anda berhasil login')]")).getText()
				.contains("Anda berhasil login");
		driver.findElement(By.linkText("Logout")).click();
		assert driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/b[1]")).getText()
		.contains("Anda belum login, silahkan login untuk mengakses sitem ini");
		
	}
}
