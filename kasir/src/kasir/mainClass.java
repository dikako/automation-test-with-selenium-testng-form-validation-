package kasir;

import org.testng.annotations.*;

@Test
public class mainClass extends baseClass {

	@Test(priority = 0)
	public void Title() throws InterruptedException {
		cekTitle page = new cekTitle(driver);
		driver.get("http://localhost/program-toko/");
		page.title();
	}

	@Test(priority = 1)
	public void cekLoginTrue() throws InterruptedException {
		login page = new login(driver);
		driver.get("http://localhost/program-toko/");
		page.logins();
	}

	@Test(priority = 2)
	public void cekLogout() throws InterruptedException {
		login_logout page = new login_logout(driver);
		driver.get("http://localhost/program-toko/");
		page.logout();
	}

	@Test(priority = 4)
	public void cekFormLogin() throws InterruptedException {
		ValidationFormLogin page = new ValidationFormLogin(driver);
		driver.get("http://localhost/program-toko/");
		page.formkosong();
	}

	@Test(priority = 3)
	public void cekLoginFailed() throws InterruptedException {
		failedLogin page = new failedLogin(driver);
		driver.get("http://localhost/program-toko/");
		page.failedLogins();
	}

	@Test(priority = 5)
	public void cekMenuDataKasir_CURD() throws InterruptedException {
		dataKasirCURD page = new dataKasirCURD(driver);
		driver.get("http://localhost/program-toko/");
		page.dataKasir();
	}

	@Test(priority = 7)
	public void cekMenuDataKategori_CURD() throws InterruptedException {
		dataKategoriCURD page = new dataKategoriCURD(driver);
		driver.get("http://localhost/program-toko/");
		page.dataKategori();
	}

	@Test(priority = 6)
	public void cekFormDataKasir() throws InterruptedException {
		ValidasiFormDataKasir page = new ValidasiFormDataKasir(driver);
		driver.get("http://localhost/program-toko/");
		page.formDataKasir();
	}

	@Test(priority = 8)
	public void cekFormDataKategori() throws InterruptedException {
		ValidasiFormDataKategori page = new ValidasiFormDataKategori(driver);
		driver.get("http://localhost/program-toko/");
		page.formDataKategori();
	}

	@Test(priority = 9)
	public void cekMenuDataSuplayer_CURD() throws InterruptedException {
		dataSuplayerCURD page = new dataSuplayerCURD(driver);
		driver.get("http://localhost/program-toko/");
		page.dataSuplayer();
	}

	@Test(priority = 10)
	public void cekFormDataSuplayer() throws InterruptedException {
		ValidasiFormDataSuplayer page = new ValidasiFormDataSuplayer(driver);
		driver.get("http://localhost/program-toko/");
		page.FormDataSuplayer();
	}

	@Test(priority = 11)
	public void cekMenuDataBarang_CURD() throws InterruptedException {
		dataBarangCURD page = new dataBarangCURD(driver);
		driver.get("http://localhost/program-toko/");
		page.dataBarang();
	}

	@Test(priority = 12)
	public void cekFormDataBarang() throws InterruptedException {
		ValidasiFormDataBarang page = new ValidasiFormDataBarang(driver);
		driver.get("http://localhost/program-toko/");
		page.formDataBarang();
	} 
	
	@Test(priority = 13)
	public void cekTransaksiPembelian() throws InterruptedException {
		transaksiPembelianBarang page = new transaksiPembelianBarang(driver);
		driver.get("http://localhost/program-toko/");
		page.transaksipembelian();
	}
	
}
