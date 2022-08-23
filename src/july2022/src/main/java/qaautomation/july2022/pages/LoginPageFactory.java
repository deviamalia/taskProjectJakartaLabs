 package qaautomation.july2022.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageFactory extends BasePage {
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	 
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	
	
	
	///version-2 
	public void LoginWeb(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginBtn.click();
	}

	public LoginPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
		// TODO Auto-generated constructor stub
	}
	
	public void inputUsername(String user) {
		username.sendKeys(user);
		
	}
	
	public void inputPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLoginButton() {
		loginBtn.click();
	}




}
