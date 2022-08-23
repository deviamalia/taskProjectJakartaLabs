package qaautomation.july2022.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePagePageFactory {

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new  ThreadLocal<WebDriverWait>();
	
	
	public BasePagePageFactory (ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		 this.driver = driver;
		 this.explicitWait = explicitWait;
	}
	
}
