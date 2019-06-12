package kasir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidasiFormDataSuplayer {
	private WebDriver driver;

	public ValidasiFormDataSuplayer(WebDriver driver) {
		this.driver = driver;
	}

	public void FormDataSuplayer() {
		driver.findElement(By.linkText("login")).click();
		assert driver.findElement(By.xpath("//b[text()='LOGIN KASIR']")).getText().contains("LOGIN KASIR");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.xpath("//b[contains(text(),'Anda berhasil login')]")).getText()
				.contains("Anda berhasil login");

		driver.findElement(By.linkText("Data Supplier")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA SUPPLIER')]")).getText()
				.contains("MANAJEMEN DATA SUPPLIER");
		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA SUPPLIER')]")).getText()
				.contains("TAMBAH DATA SUPPLIER");
		
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).clear();
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).clear();
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).clear();
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Supplier tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Alamat Lengkap tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data No. Telepon tidak boleh kosong !");
		
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).clear();
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).sendKeys("validasiform");
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).clear();
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).clear();
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Alamat Lengkap tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data No. Telepon tidak boleh kosong !");

		driver.findElement(By.xpath("//*[@name='txtSupplier']")).clear();
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).clear();
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).sendKeys("validasiform");
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).clear();
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Supplier tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data No. Telepon tidak boleh kosong !");

		driver.findElement(By.xpath("//*[@name='txtSupplier']")).clear();
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).clear();
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).clear();
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).sendKeys("08978776542");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Supplier tidak boleh kosong !");
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Alamat Lengkap tidak boleh kosong !");
		
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).clear();
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).sendKeys("validasiform");
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).clear();
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).sendKeys("validasiform");
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).clear();
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data No. Telepon tidak boleh kosong !");
		
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).clear();
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).sendKeys("validasiform");
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).clear();
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).clear();
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).sendKeys("08978776542");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Alamat Lengkap tidak boleh kosong !");
		
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).clear();
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).sendKeys("");
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).clear();
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).sendKeys("validasiform");
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).clear();
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).sendKeys("08978776542");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Nama Supplier tidak boleh kosong !");
	}
}
