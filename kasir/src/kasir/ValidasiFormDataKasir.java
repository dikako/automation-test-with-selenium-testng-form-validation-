package kasir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidasiFormDataKasir {
	private WebDriver driver;

	public ValidasiFormDataKasir(WebDriver driver) {
		this.driver = driver;
	}

	public void formDataKasir() {
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
		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Kasir tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Username tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Password tidak boleh kosong !");

		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).sendKeys("formvalidasi");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Username tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Password tidak boleh kosong !");

		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).sendKeys("formvalidasi");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Kasir tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Password tidak boleh kosong !");
		
		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("formvalidasi");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Kasir tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Username tidak boleh kosong !");

		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).sendKeys("formvalidasi");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).sendKeys("formvalidasi");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Password tidak boleh kosong !");

		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).sendKeys("formvalidasi");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).clear();
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("formvalidasi");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Username tidak boleh kosong !");
		
		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='txtNama']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).sendKeys("formvalidasi");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("formvalidasi");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Kasir tidak boleh kosong !");

	}
}
