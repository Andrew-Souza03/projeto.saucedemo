package proojeto.saucedemo.metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import proojeto.saucedemo.drivers.Drivers;

public class Metodos extends Drivers {


	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void validarmsg(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);
	}

}
