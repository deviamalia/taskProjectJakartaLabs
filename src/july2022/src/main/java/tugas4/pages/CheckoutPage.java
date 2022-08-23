package tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage extends BasePage {
	public CheckoutPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	By firstName = By.xpath("//input[@id='first-name']");
	By lastName = By.xpath("//input[@id='last-name']");
	By postalCode = By.xpath("//input[@id='postal-code']");
	By checkoutButton = By.xpath("//input[@id='continue']");
	By checkoutTitle = By.xpath("//span[@class='title']");
	By finishButton = By.xpath("//button[@id='finish']");
	
	public void inputFirstName (String user) {
		setText(firstName, user);	
	}
	
	public void inputLastName (String user) {
		setText(lastName, user);
	}
	
	public void inputPostalCode (String user) {
		setText(postalCode, user);
	}
	
	public void clickCheckoutButton(){
		clickAndWait(checkoutButton);
	}
	
	public String checkoutTitle() {
		return getText(checkoutTitle);
	}
	
	public void clickFinishButton(){
		clickAndWait(finishButton);
	}
	


}
