package kasir;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dataKategoriCURD {
	private WebDriver driver;

	public dataKategoriCURD(WebDriver driver) {
		this.driver = driver;
	}

	public void dataKategori() {
		driver.findElement(By.linkText("login")).click();
		assert driver.findElement(By.xpath("//b[text()='LOGIN KASIR']")).getText().contains("LOGIN KASIR");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.xpath("//b[contains(text(),'Anda berhasil login')]")).getText()
				.contains("Anda berhasil login");

		driver.findElement(By.linkText("Data Kategori")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA KATEGORI')]")).getText()
				.contains("MANAJEMEN DATA KATEGORI");
		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA KATEGORI')]")).getText()
				.contains("TAMBAH DATA KATEGORI");
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.xpath("//td[text()='Kamera']")).getText().contains("Kamera");

		driver.findElement(By.linkText("Data Kategori")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA KATEGORI')]")).getText()
				.contains("MANAJEMEN DATA KATEGORI");
		driver.findElement(By.linkText("Edit")).click();
		assert driver.findElement(By.xpath("//th[text()='UBAH DATA KATEGORI']")).getText()
				.contains("UBAH DATA KATEGORI");
		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Kamera cannon");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.xpath("//td[text()='Kamera cannon']")).getText().contains("Kamera cannon");

		driver.findElement(By.linkText("Delete")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		driver.findElement(By.linkText("Delete")).click();
		Alert alerts = driver.switchTo().alert();
		alerts.accept();

	}
}
