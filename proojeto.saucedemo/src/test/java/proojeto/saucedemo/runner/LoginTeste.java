package proojeto.saucedemo.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import proojeto.saucedemo.elementos.Elementos;
import proojeto.saucedemo.metodos.Metodos;
import proojeto.saucedemo.navegadores.Navegador;

public class LoginTeste {

	Navegador navegador = new Navegador();
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	
	
	
	@Before
	public void inicioTeste() {
		navegador.abrirNavegador();
	}
	
	@After
	public void finalizarTeste() {
		navegador.fecharNavegador();
	}
	
	@Test
	public void loginValido() {
		metodo.escrever(elemento.nome, "standard_user");
		metodo.escrever(elemento.senha, "secret_sauce");
		metodo.clicar(elemento.btnLogin);
	}
	
	@Test
	public void loginUsuarioInvalido() {
		metodo.escrever(elemento.nome, "userInvalido");
		metodo.escrever(elemento.senha, "secret_sauce");
		metodo.clicar(elemento.btnLogin);
		metodo.validarmsg(elemento.msgErro,"Epic sadface: Username and password do not match any user in this service");
	}
	
	@Test
	public void loginUsuarioBloqueado() {
		metodo.escrever(elemento.nome, "locked_out_user");
		metodo.escrever(elemento.senha, "secret_sauce");
		metodo.clicar(elemento.btnLogin);
		metodo.validarmsg(elemento.msgErro,"Epic sadface: Sorry, this user has been locked out.");
	}

}
