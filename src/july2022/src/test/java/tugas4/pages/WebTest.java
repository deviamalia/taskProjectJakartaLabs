package tugas4.pages; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class WebTest {
	
	
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new  ThreadLocal<WebDriverWait>();
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.get().quit();
	}
	

	LoginPage loginPage = new LoginPage(driver,explicitWait);
	HomePage homePage = new HomePage(driver, explicitWait);
	CartPage cartPage = new CartPage(driver, explicitWait);
	CheckoutPage checkoutPage = new  CheckoutPage (driver, explicitWait);
	
	String username = "standard_user";
	String password = "secret_sauce";
	String firstname = "devi";
	String lastname = "amalia";
	String postalcode = "123456";
	
	
	@Test
	public void loginTest() {
			
		driver.get().get("https://www.google.com/");
		driver.get().get("https://www.saucedemo.com/");
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		String actualText = homePage.getHomePageText();
		String expectedText = "PRODUCTS";
		Assert.assertTrue(actualText.contains(expectedText));
	}
	

	@Test
	public void OrderFlowItem() {
			
		driver.get().get("https://www.google.com/");
		driver.get().get("https://www.saucedemo.com/");
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		String actualText = homePage.getHomePageText();
		String expectedText = "PRODUCTS";
		Assert.assertTrue(actualText.contains(expectedText));
		homePage.addItemFirst();
		homePage.addItemSecond();
		String selectedButtonItem1 = homePage.removeButtonFirst();
//		System.out.println("expected1" + selectedButtonItem1);
		String expectedText1 = "REMOVE";
		Assert.assertTrue(selectedButtonItem1.contains(expectedText1));
		String selectedButtonItem2 = homePage.removeButtonSecond();
//		System.out.println("expected2" + selectedButtonItem2);
		Assert.assertTrue(selectedButtonItem2.contains(expectedText1));
		String countCart = homePage.countCartIcon();
//		System.out.println("expected3"+ countCart );
		String expectedText3 = "2";
		Assert.assertTrue(countCart.contains(expectedText3));
		homePage.clickCart();
		String actualText4 = cartPage.cartPageText();
		String expectedText4 = "YOUR CART";
		Assert.assertTrue(actualText4.contains(expectedText4));
		cartPage.checkoutButton();
		checkoutPage.inputFirstName(firstname);
		checkoutPage.inputLastName(lastname);
		checkoutPage.inputPostalCode(postalcode);
		checkoutPage.clickCheckoutButton();
		String TitleCheckout = checkoutPage.checkoutTitle();
		String expectedText5 = "CHECKOUT: OVERVIEW";
		Assert.assertTrue(TitleCheckout.contains(expectedText5));
		checkoutPage.clickFinishButton();
		String finishCheckout = checkoutPage.checkoutTitle();
		String expectedText6 = "CHECKOUT: COMPLETE!";
		Assert.assertTrue(finishCheckout.contains(expectedText6));
		
	}
	
	

}
