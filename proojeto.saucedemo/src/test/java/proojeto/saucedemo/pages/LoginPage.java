package proojeto.saucedemo.pages;

import proojeto.saucedemo.elementos.Elementos;
import proojeto.saucedemo.metodos.Metodos;

public class LoginPage {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	
	public void realizarLogin(String user, String password) {
		metodo.escrever(elemento.nome, user);
		metodo.escrever(elemento.senha, password);
		metodo.clicar(elemento.btnLogin);
	}
}
