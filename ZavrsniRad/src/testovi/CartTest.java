package testovi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sajt.Cart;

public class CartTest {
	public static WebDriver driver;
	private String expectedUrl = "http://automationpractice.com/index.php?controller=order";

	@BeforeClass
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait(1000);
	}
	@Test
	public  void ACheckCart() {
		driver.get("http://automationpractice.com/index.php");
		wait(500);
		driver.navigate().to(Cart.cartUrl);
		String currentUrl1 = driver.getCurrentUrl();

		Assert.assertEquals(currentUrl1, expectedUrl);
		wait(2000);
		
		
	}
	@AfterClass
	public static void close() {
		driver.quit();
	}


	public static void wait(int i) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
