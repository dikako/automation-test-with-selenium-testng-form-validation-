package kasir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class transaksiPembelianBarang {
	private WebDriver driver;

	public transaksiPembelianBarang(WebDriver driver) {
		this.driver = driver;
	}

	public void transaksipembelian() {
		driver.findElement(By.linkText("login")).click();
		assert driver.findElement(By.xpath("//b[text()='LOGIN KASIR']")).getText().contains("LOGIN KASIR");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.xpath("//b[contains(text(),'Anda berhasil login')]")).getText()
				.contains("Anda berhasil login");

		driver.findElement(By.linkText("Transaksi Pembelian")).click();
		driver.get("http://localhost/program-toko/pembelian/");
		assert driver.findElement(By.xpath("//h1[text()='PEMBELIAN BARANG']")).getText().contains("PEMBELIAN BARANG");

		Select suplayer = new Select(driver.findElement(By.xpath("//select[@name='cmbSupplier']")));
		suplayer.selectByVisibleText("PT.DIKA");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("Beli");

		Select kategori = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori.selectByVisibleText("Kamera");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnPilih']")).click();
		Select NamaBarang = new Select(driver.findElement(By.xpath("//select[@name='cmbBarang']")));
		NamaBarang.selectByVisibleText("[ B0001 ] Cannon AES | Rp. 4.000.000");
		driver.findElement(By.xpath("//*[@name='txtHarga']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHarga']")).sendKeys("4.000.000");
		driver.findElement(By.xpath("//*[@name='txtJumlah']")).clear();
		driver.findElement(By.xpath("//*[@name='txtJumlah']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnTambah']")).click();

		assert driver.findElement(By.xpath("//td[text()='Cannon AES']")).getText().contains("Cannon AES");
		assert driver.findElement(By.xpath("//td[text()='4.000.000']")).getText().contains("4.000.000");
		assert driver.findElement(By.xpath("//td[text()='2']")).getText().contains("2");
		assert driver.findElement(By.xpath("//td[text()='8.000.000']")).getText().contains("8.000.000");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();

		driver.findElement(By.linkText("Tampil Pembelian")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'DATA TRANSAKSI PEMBELIAN')]")).getText()
				.contains("DATA TRANSAKSI PEMBELIAN");
		assert driver.findElement(By.xpath("//td[text()='PT.DIKA']")).getText().contains("PT.DIKA");
		assert driver.findElement(By.xpath("//td[text()='Bagus untuk Vlog']")).getText().contains("Bagus untuk Vlog");

		driver.findElement(By.linkText("Cetak")).click();
		driver.get("http://localhost/program-toko/pembelian/pembelian_cetak.php?noNota=BL00001");
		assert driver.findElement(By.xpath("//h2[contains(text(),'CETAK PEMBELIAN')]")).getText()
				.contains("CETAK PEMBELIAN");
		assert driver.findElement(By.xpath("//td[text()='Cannon AES']")).getText().contains("Cannon AES");
		assert driver.findElement(By.xpath("//td[text()='4.000.000']")).getText().contains("4.000.000");
		assert driver.findElement(By.xpath("//td[text()='2']")).getText().contains("2");

	}
}
