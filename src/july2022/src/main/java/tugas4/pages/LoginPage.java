package tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
	
	By userName = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By loginButton = By.xpath("//input[@id='login-button']");
	
	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public void inputUsername(String user){
		setText(userName, user);
	}
	
	public void inputPassword(String pass){
		setText(password, pass);
	}
	
	public void clickLoginButton(){
		clickAndWait(loginButton);
	}
	
	
	
	

	
}
