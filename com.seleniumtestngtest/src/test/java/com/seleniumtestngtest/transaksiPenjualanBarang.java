package com.seleniumtestngtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class transaksiPenjualanBarang {
	private WebDriver driver;

	public transaksiPenjualanBarang(WebDriver driver) {
		this.driver = driver;

	}

	public void cekTransaksiPenjualan() {
		driver.findElement(By.linkText("login")).click();
		assert driver.findElement(By.xpath("//b[text()='LOGIN KASIR']")).getText().contains("LOGIN KASIR");
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUser']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnLogin']")).click();
		assert driver.findElement(By.xpath("//b[contains(text(),'Anda berhasil login')]")).getText()
				.contains("Anda berhasil login");

		// Kategori
		driver.findElement(By.linkText("Data Kategori")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA KATEGORI')]")).getText()
				.contains("MANAJEMEN DATA KATEGORI");
		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA KATEGORI')]")).getText()
				.contains("TAMBAH DATA KATEGORI");
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Aksesories");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.xpath("//td[text()='Aksesories']")).getText().contains("Aksesories");

		// Supplier
		driver.findElement(By.linkText("Data Supplier")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA SUPPLIER')]")).getText()
				.contains("MANAJEMEN DATA SUPPLIER");
		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA SUPPLIER')]")).getText()
				.contains("TAMBAH DATA SUPPLIER");
		driver.findElement(By.xpath("//*[@name='txtSupplier']")).sendKeys("PT.DIKACOMPUTER");
		driver.findElement(By.xpath("//*[@name='txtAlamat']")).sendKeys("Bandar Lampung");
		driver.findElement(By.xpath("//*[@name='txtTelepon']")).sendKeys("082278843304");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.xpath("//td[text()='PT.DIKACOMPUTER']")).getText().contains("PT.DIKACOMPUTER");
		assert driver.findElement(By.xpath("//td[text()='Bandar Lampung']")).getText().contains("Bandar Lampung");

		// Barang
		driver.findElement(By.linkText("Data Barang")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA BARANG')]")).getText()
				.contains("MANAJEMEN DATA BARANG");

		driver.findElement(By.xpath("//img[@src='images/btn_add_data.png']")).click();
		assert driver.findElement(By.xpath("//th[contains(text(),'TAMBAH DATA BARANG')]")).getText()
				.contains("TAMBAH DATA BARANG");

		driver.findElement(By.xpath("//*[@name='txtNama']")).clear();
		driver.findElement(By.xpath("//*[@name='txtNama']")).sendKeys("Mouse");
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaBeli']")).sendKeys("50000");
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHargaJual']")).sendKeys("55000");
		driver.findElement(By.xpath("//*[@name='txtStok']")).clear();
		driver.findElement(By.xpath("//*[@name='txtStok']")).sendKeys("20");
		Select satuan = new Select(driver.findElement(By.xpath("//select[@name='cmbSatuan']")));
		satuan.selectByVisibleText("Unit");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("Keterangan");
		Select kategori = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategori.selectByVisibleText("Aksesories");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();
		assert driver.findElement(By.xpath("//td[text()='Mouse']")).getText().contains("Mouse");
		assert driver.findElement(By.xpath("//td[text()='20']")).getText().contains("20");
		assert driver.findElement(By.xpath("//td[text()='50.000']")).getText().contains("50.000");
		assert driver.findElement(By.xpath("//td[text()='55.000']")).getText().contains("55.000");

		// Transaksi Pembelian
		driver.findElement(By.linkText("Transaksi Penjualan")).click();
		driver.get("http://localhost/program-toko/penjualan/");
		assert driver.findElement(By.xpath("//h1[text()='PENJUALAN BARANG']")).getText().contains("PENJUALAN BARANG");

		driver.findElement(By.xpath("//*[@name='txtPelanggan']")).clear();
		driver.findElement(By.xpath("//*[@name='txtPelanggan']")).sendKeys("Dika Koko");
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).clear();
		driver.findElement(By.xpath("//*[@name='txtKeterangan']")).sendKeys("Beli");
		Select kategoris = new Select(driver.findElement(By.xpath("//select[@name='cmbKategori']")));
		kategoris.selectByVisibleText("Aksesories");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnPilih']")).click();
		Select NamaBarang = new Select(driver.findElement(By.xpath("//select[@name='cmbBarang']")));
		NamaBarang.selectByVisibleText("[ B0001 ] Mouse | Rp. 55.000");
		driver.findElement(By.xpath("//*[@name='txtHarga']")).clear();
		driver.findElement(By.xpath("//*[@name='txtHarga']")).sendKeys("55.000");
		driver.findElement(By.xpath("//*[@name='txtJumlah']")).clear();
		driver.findElement(By.xpath("//*[@name='txtJumlah']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnTambah']")).click();

		assert driver.findElement(By.xpath("//td[text()='Mouse']")).getText().contains("Mouse");
		assert driver.findElement(By.xpath("//td[text()='55']")).getText().contains("55");
		assert driver.findElement(By.xpath("//td[text()='2']")).getText().contains("2");
		assert driver.findElement(By.xpath("//td[text()='110']")).getText().contains("110");

		driver.findElement(By.xpath("//*[@name='txtUangBayar']")).sendKeys("100000");
		driver.findElement(By.xpath("//input[@type='submit'][@name='btnSimpan']")).click();

		assert driver.findElement(By.cssSelector("div[class='mssgBox']")).getText()
				.contains("Data Uang Bayar Belum Cukup. Total belanja adalah Rp. 110.000");

		// hapus Kategori
		driver.get("http://localhost/program-toko/?open=Kategori-Data");
		driver.findElement(By.linkText("Data Kategori")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA KATEGORI')]")).getText()
				.contains("MANAJEMEN DATA KATEGORI");
		driver.findElement(By.linkText("Delete")).click();
		Alert alerts = driver.switchTo().alert();
		alerts.accept();

		// hapus Supplier
		driver.get("http://localhost/program-toko/?open=Supplier-Data");
		driver.findElement(By.linkText("Data Supplier")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA SUPPLIER')]")).getText()
				.contains("MANAJEMEN DATA SUPPLIER");
		driver.findElement(By.linkText("Delete")).click();
		Alert alertss = driver.switchTo().alert();
		alertss.accept();

		// hapus Barang
		driver.get("http://localhost/program-toko/?open=Barang-Data");
		driver.findElement(By.linkText("Data Barang")).click();
		assert driver.findElement(By.xpath("//h2[contains(text(),'MANAJEMEN DATA BARANG')]")).getText()
				.contains("MANAJEMEN DATA BARANG");
		driver.findElement(By.linkText("Delete")).click();
		Alert alertsss = driver.switchTo().alert();
		alertsss.accept();

		// hapus Transaksi Pembelian
		driver.get("http://localhost/program-toko/penjualan/");
		driver.findElement(By.linkText("Tampil Penjualan")).click();
		driver.findElement(By.linkText("Delete")).click();
		Alert alertssss = driver.switchTo().alert();
		alertssss.accept();
	}

}
