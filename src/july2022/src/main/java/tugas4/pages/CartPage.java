package tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {

	public CartPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	By cartPageTitle = By.xpath("//span[@class='title']");
	By checkoutButton = By.xpath("//button[@id='checkout']");
	
	public String cartPageText() {
		return getText(cartPageTitle);
	}
	
	public void checkoutButton() {
		clickAndWait(checkoutButton);
	}
}
