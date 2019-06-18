package com.seleniumtestngtest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class cekTitle {
	private WebDriver driver;

	public cekTitle(WebDriver driver) {
		this.driver = driver;
	}

	public void title() {
		String title = driver.getTitle();
		System.out.println("Test Web : " + title);
		Assert.assertEquals(title, "Toko Aksessori Komputer dan Gadget");
	}
}
