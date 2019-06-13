package com.seleniumtestngtest;

import org.testng.annotations.*;

@Test
public class mainClass extends baseClass {

	@Test(priority = 0)
	public void Title() throws InterruptedException {
		cekTitle page = new cekTitle(driver);
		driver.get("http://localhost/program-toko/");
		page.title();
	}

}
