package qaautomation.july2022;

import org.testng.annotations.Test;

import qaautomation.july2022.pages.LoginPage;
import qaautomation.july2022.pages.ProfilePage;

import org.testng.Assert;

//import io.github.bonigarcia.wdm.Webdriver.get()Manager;


public class WebTestAfterPOM extends BaseWebTestHeadless {
	
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);
	
	
	String username = "tomsmith";
	String password = "SuperSecretPassword!";
	String wrongUsername = "tomsmit123";
	String wrongPassword = "SuperSecretPassword";
	
	@Test
	public void testLogin() {
		
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

	 
	////version-2 (Tokopedia)
	
//	@Test
//	public void testLoginVersion2() {
//		String username = "tomsmith";
//		String password = "SuperSecretPassword!";
//		driver.get().get("https://www.google.com/");
//		driver.get().get("https://the-internet.herokuapp.com/login");
//		loginPage.LoginWeb(username, password);
//		String actualText = profilePage.getProfileText();
//
//		String expectedText = "You";
//		String expectedText1 = "Logged";
//		String expectedText2 = "Secure";
//		
//		Assert.assertTrue(actualText.contains(expectedText));
//		Assert.assertTrue(actualText.contains(expectedText1));
//		Assert.assertTrue(actualText.contains(expectedText2));
//				
//	}
//	
	
	@Test
	public void testLoginWrongUsername() {
	
		driver.get().get("https://www.google.com/");
		driver.get().get("https://the-internet.herokuapp.com/login");
		loginPage.inputUsername(wrongUsername);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		String actualText = profilePage.getProfileText();
		String expectedText = "Your username is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));	
	}
	
	@Test
	public void testLoginWrongPassword() {
		
		driver.get().get("https://www.google.com/");
		driver.get().get("https://the-internet.herokuapp.com/login");
		loginPage.inputUsername(username);
		loginPage.inputPassword(wrongPassword);
		loginPage.clickLoginButton();
		String actualText = profilePage.getProfileText();
		String expectedText = "Your password is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));
	}	

	@Test
	public void testLoginWrongUsernamePassword() {
	 	
		driver.get().get("https://www.google.com/");
		driver.get().get("https://the-internet.herokuapp.com/login");
		loginPage.inputUsername(wrongUsername);
		loginPage.inputPassword(wrongPassword);
		loginPage.clickLoginButton();
		String actualText = profilePage.getProfileText();
		String expectedText = "Your username is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));	
	}
}
