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
		kategori.selectByVisibleText("Aksesories Komputer");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnPilih']")).click();
		Select NamaBarang = new Select(driver.findElement(By.xpath("//select[@name='cmbBarang']")));
		NamaBarang.selectByVisibleText("[ B0009 ] Keyboard RGB | Rp. 20.000");
		driver.findElement(By.xpath("//*[@name='txtHarga']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHarga']")).sendKeys("20000");
		driver.findElement(By.xpath("//*[@name='txtJumlah']")).clear();
		driver.findElement(By.xpath("//*[@name='txtJumlah']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnTambah']")).click();
		
		Select kategori1 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori1.selectByVisibleText("Aksesories Komputer");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnPilih']")).click();
		Select NamaBarang1 = new Select(driver.findElement(By.xpath("//select[@name='cmbBarang']")));
		NamaBarang1.selectByVisibleText("[ B0010 ] Keyboard RGB Logi | Rp. 20.000");
		driver.findElement(By.xpath("//*[@name='txtHarga']")).sendKeys("20000");
		driver.findElement(By.xpath("//*[@name='txtJumlah']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnTambah']")).click();
		
		Select kategori2 = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori2.selectByVisibleText("Aksesories Komputer");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnPilih']")).click();
		Select NamaBarang2 = new Select(driver.findElement(By.xpath("//select[@name='cmbBarang']")));
		NamaBarang2.selectByVisibleText("[ B0011 ] Monitor Lengkung | Rp. 20.000");
		driver.findElement(By.xpath("//*[@name='txtHarga']")).sendKeys("20000");
		driver.findElement(By.xpath("//*[@name='txtJumlah']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnTambah']")).click();
		
		assert driver.findElement(By.xpath("//b[text()='60']")).getText().contains("60");
		assert driver.findElement(By.xpath("//b[text()='1.200.000']")).getText().contains("1.200.000");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		
		
		
		
		Select suplayers = new Select(driver.findElement(By.xpath("//select[@name='cmbSupplier']")));
		suplayers.selectByVisibleText("PT.DIKA");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("Beli");
		
		Select kategoris = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategoris.selectByVisibleText("Aksesories Komputer");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnPilih']")).click();
		Select NamaBarangs = new Select(driver.findElement(By.xpath("//select[@name='cmbBarang']")));
		NamaBarangs.selectByVisibleText("[ B0009 ] Keyboard RGB | Rp. 20.000");
		driver.findElement(By.xpath("//*[@name='txtHarga']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHarga']")).sendKeys("20000");
		driver.findElement(By.xpath("//*[@name='txtJumlah']")).clear();
		driver.findElement(By.xpath("//*[@name='txtJumlah']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnTambah']")).click();
		
		Select kategori1s = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori1s.selectByVisibleText("Aksesories Komputer");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnPilih']")).click();
		Select NamaBarang1s = new Select(driver.findElement(By.xpath("//select[@name='cmbBarang']")));
		NamaBarang1s.selectByVisibleText("[ B0010 ] Keyboard RGB Logi | Rp. 20.000");
		driver.findElement(By.xpath("//*[@name='txtHarga']")).sendKeys("20000");
		driver.findElement(By.xpath("//*[@name='txtJumlah']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnTambah']")).click();
		
		Select kategori2s = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori2s.selectByVisibleText("Aksesories Komputer");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnPilih']")).click();
		Select NamaBarang2s = new Select(driver.findElement(By.xpath("//select[@name='cmbBarang']")));
		NamaBarang2s.selectByVisibleText("[ B0011 ] Monitor Lengkung | Rp. 20.000");
		driver.findElement(By.xpath("//*[@name='txtHarga']")).sendKeys("20000");
		driver.findElement(By.xpath("//*[@name='txtJumlah']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnTambah']")).click();
		
		assert driver.findElement(By.xpath("//b[text()='60']")).getText().contains("60");
		assert driver.findElement(By.xpath("//b[text()='1.200.000']")).getText().contains("1.200.000");
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();	
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		
	}
}
