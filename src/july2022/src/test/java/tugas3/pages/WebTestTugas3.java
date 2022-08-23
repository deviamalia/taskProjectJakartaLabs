package tugas3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTestTugas3 {
	
	@Test
	public void IframTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");		
		driver.get("https://yopmail.com/en/");
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("devi");
		driver.findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();
		WebElement iframeElement = driver.findElement(By.id("ifnoinb"));
		driver.switchTo().frame(iframeElement);
		System.out.println("Iframe_is = "+ iframeElement);
		driver.quit();
		
	}

}
