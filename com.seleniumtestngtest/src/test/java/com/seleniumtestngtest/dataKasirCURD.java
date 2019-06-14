package com.seleniumtestngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dataKasirCURD {
	private WebDriver driver;

	public dataKasirCURD(WebDriver driver) {
		this.driver = driver;
	}

	public void dataKasir() {
		driver.findElement(By.linkText("login")).click();
		assert driver.findElement(By.xpath("//b[text()='LOGIN KASIR']")).getText().contains("LOGIN KASIR");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.xpath("//b[contains(text(),'Anda berhasil login')]")).getText()
				.contains("Anda berhasil login");
		
		driver.findElement(By.linkText("Data Kasir")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA KASIR')]")).getText()
				.contains("MANAJEMEN DATA KASIR");
		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//b[contains(text(),'TAMBAH DATA KASIR')]")).getText()
				.contains("TAMBAH DATA KASIR");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).sendKeys("dikakoko");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).sendKeys("dikakoko");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("dikakoko");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.xpath("//td[text()='dikakoko']")).getText().contains("dikakoko");
		
		driver.findElement(By.linkText("Edit")).click();
		assert driver.findElement(By.xpath("//b[contains(text(),'UBAH DATA KASIR')]")).getText()
				.contains("UBAH DATA KASIR");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).sendKeys("dikakokoubah");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).sendKeys("dikakokoubah");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).clear();
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("dikakokoubah");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.xpath("//td[text()='dikakokoubah']")).getText().contains("dikakokoubah");
		
		driver.findElement(By.linkText("Delete")).click();

	}

}
