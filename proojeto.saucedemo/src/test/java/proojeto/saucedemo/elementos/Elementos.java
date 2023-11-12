package proojeto.saucedemo.elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By nome = By.id("user-name");
	public By senha = By.id("password");
	public By btnLogin = By.id("login-button");
	public By msgErro = By.xpath("//*[@id='login_button_container']/div/form/div[3]");

}
