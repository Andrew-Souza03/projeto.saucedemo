package proojeto.saucedemo.navegadores;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import proojeto.saucedemo.drivers.Drivers;

public class Navegador extends Drivers{

	public static void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	public static void fecharNavegador() {
		driver.quit();
	}
	
}
