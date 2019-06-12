package kasir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidationFormLogin {
	private WebDriver driver;

	public ValidationFormLogin(WebDriver driver) {
		this.driver = driver;
	}

	public void formkosong() {
		driver.findElement(By.linkText("login")).click();
		assert driver.findElement(By.xpath("//b[text()='LOGIN KASIR']")).getText().contains("LOGIN KASIR");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("adminis");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Password tidak boleh kosong !");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("adminis");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Username tidak boleh kosong !");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Username tidak boleh kosong !");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Password tidak boleh kosong !");
	}
}
