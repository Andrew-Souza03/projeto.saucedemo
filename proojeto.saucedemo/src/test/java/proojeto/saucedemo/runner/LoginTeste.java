package proojeto.saucedemo.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import proojeto.saucedemo.elementos.Elementos;
import proojeto.saucedemo.metodos.Metodos;
import proojeto.saucedemo.navegadores.Navegador;
import proojeto.saucedemo.pages.LoginPage;

public class LoginTeste extends Navegador{

	Elementos elemento = new Elementos();
	LoginPage login = new LoginPage();

	String usuario = "standard_user";
	String senha = "secret_sauce";
	String usuarioInvalido = "userInvalido";
	String senhaInvalida = "";
	String usuarioBloqueado = "locked_out_user";

	@Before
	public void inicioTeste() {
		Navegador.abrirNavegador();
	}

	@After
	public void finalizarTeste() {
		Navegador.fecharNavegador();
	}

	@Test
	public void loginValido() {
		login.realizarLogin(usuario, senha);
        Metodos.takeScreenshot(driver, "screenshot_loginSucesso.png");
	}

	
	@Test
	public void loginUsuarioInvalido() {

		login.realizarLogin(usuarioInvalido, senha);
        Metodos.takeScreenshot(driver, "screenshot_loginInvalido.png");
		Metodos.validarmsg(elemento.msgErro,
				"Epic sadface: Username and password do not match any user in this service");
	}

	@Test
	public void loginUsuarioBloqueado() {
		
		login.realizarLogin(usuarioBloqueado, senha);
        Metodos.takeScreenshot(driver, "screenshot_loginBloqueado.png");
		Metodos.validarmsg(elemento.msgErro, "Epic sadface: Sorry, this user has been locked out.");
	}
	
	@Test
	public void loginUsuarioEmBranco() {
		
		login.realizarLogin("", "");
        Metodos.takeScreenshot(driver, "screenshot_loginEmBranco.png");
		Metodos.validarmsg(elemento.msgErro, "Epic sadface: Username is required");
	}
	

}
