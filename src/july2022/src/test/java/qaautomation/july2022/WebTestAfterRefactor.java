package qaautomation.july2022;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;

//import io.github.bonigarcia.wdm.Webdriver.get()Manager;


public class WebTestAfterRefactor extends BaseWebTest {
	

//	
	
	@Test
	public void testLogin() {
		driver.get().get("https://www.google.com/");
		driver.get().get("https://the-internet.herokuapp.com/login");
		driver.get().findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.get().findElement(By.xpath("//button[@type='submit']")).click();
//		System.out.println(driver.get().findElement(By.xpath("//div[@id='flash']")).getText());
		String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText = "You logged into a secure area!";
		AssertJUnit.assertTrue(actualText.contains(expectedText));
		
	}
	 
	@Test
	public void testLoginWrongUsername() {
		
		driver.get().get("https://www.google.com/");
		driver.get().get("https://the-internet.herokuapp.com/login");
		driver.get().findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmit123");
		driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.get().findElement(By.xpath("//button[@type='submit']")).click();
		String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText = "Your username is invalid!";
		AssertJUnit.assertTrue(actualText.contains(expectedText));
		
	}
	
	@Test
	public void testLoginWrongPassword() {
		
		driver.get().get("https://www.google.com/");
		driver.get().get("https://the-internet.herokuapp.com/login");
		driver.get().findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword");
		driver.get().findElement(By.xpath("//button[@type='submit']")).click();
		String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText = "Your password is invalid!";
		AssertJUnit.assertTrue(actualText.contains(expectedText));

	}	

	@Test
	public void testLoginWrongUsernamePassword() {
	
		driver.get().get("https://www.google.com/");
		driver.get().get("https://the-internet.herokuapp.com/login");
		driver.get().findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmit123");
		driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword");
		driver.get().findElement(By.xpath("//button[@type='submit']")).click();
		String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText = "Your username is invalid!";
		AssertJUnit.assertTrue(actualText.contains(expectedText));
		
	}
}
