package tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
	By homePageTitle = By.xpath("//span[@class='title']");
	By addFirstItem = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By addSecondItem = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
	By removeButtonFirstItem = By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']");
	By removeButtonSecondItem = By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']");
	By countCartIcon = By.xpath("//span[@class='shopping_cart_badge']");
	By cartButton = By.xpath("//a[@class='shopping_cart_link']");
	
	public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait );
	}
	
	public String getHomePageText() {
		return getText(homePageTitle);
	}
	
	public void addItemFirst() {
		clickAndWait(addFirstItem);
	}
	
	public void addItemSecond() {
		clickAndWait(addSecondItem);
	}
	
	public String removeButtonFirst() {
		return getText(removeButtonFirstItem);
	}
	
	public String removeButtonSecond() {
		return getText(removeButtonSecondItem);
	}
	
	public String countCartIcon() {
		return getText(countCartIcon);
	}
	
	public void clickCart() {
		clickAndWait(cartButton);
		
	}
}
