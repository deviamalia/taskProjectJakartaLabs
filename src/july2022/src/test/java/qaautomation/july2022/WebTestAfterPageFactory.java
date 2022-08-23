package qaautomation.july2022;

import org.testng.annotations.Test;

import qaautomation.july2022.pages.LoginPageFactory;
import qaautomation.july2022.pages.ProfilePageFactory;

import org.testng.Assert;

//import io.github.bonigarcia.wdm.Webdriver.get()Manager;


public class WebTestAfterPageFactory extends BaseWebTest {
	
	
	
	String username = "tomsmith";
	String password = "SuperSecretPassword!";
	String wrongUsername = "tomsmit123";
	String wrongPassword = "SuperSecretPassword";
	
	 
	
	@Test
	public void testLoginVersion2() {
	LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
	ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
	
		
		driver.get().get("https://www.google.com/");
		driver.get().get("https://the-internet.herokuapp.com/login");
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		String actualText = profilePage.getProfileText();
		String expectedText = "You";
		String expectedText1 = "logged";
		String expectedText2 = "secure";
		
		Assert.assertTrue(actualText.contains(expectedText));
		Assert.assertTrue(actualText.contains(expectedText1));
		Assert.assertTrue(actualText.contains(expectedText2));
				
	}
	
//	
//	@Test
//	public void testLoginWrongUsername() {
//		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
//		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
//	
//		driver.get().get("https://www.google.com/");
//		driver.get().get("https://the-internet.herokuapp.com/login");
//		loginPage.LoginWeb(wrongUsername, password);
//		String actualText = profilePage.getProfileText();
//		String expectedText = "Your username is invalid!";
//		Assert.assertTrue(actualText.contains(expectedText));	
//	}
//	
//	@Test
//	public void testLoginWrongPassword() {
//		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
//		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
//		
//		driver.get().get("https://www.google.com/");
//		driver.get().get("https://the-internet.herokuapp.com/login");
//		loginPage.LoginWeb(username, wrongPassword);
//		String actualText = profilePage.getProfileText();
//		String expectedText = "Your password is invalid!";
//		Assert.assertTrue(actualText.contains(expectedText));
//	}	
//
//	@Test
//	public void testLoginWrongUsernamePassword() {
//		
//		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
//		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
//	 	
//		driver.get().get("https://www.google.com/");
//		driver.get().get("https://the-internet.herokuapp.com/login");
//		loginPage.LoginWeb(wrongUsername, wrongPassword);
//		String actualText = profilePage.getProfileText();
//		String expectedText = "Your username is invalid!";
//		Assert.assertTrue(actualText.contains(expectedText));	
//	}
}
