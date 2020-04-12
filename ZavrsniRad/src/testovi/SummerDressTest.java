package testovi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sajt.Home;
import sajt.SummerDress;

public class SummerDressTest {
 public static WebDriver driver;

 
	@BeforeClass
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait(1000);
	}
	
	@Test 
	public static void AsummerDress() {
		driver.navigate().to(Home.homeUrl);
		Home.dropDownWomen(driver);
		String currentUrl1 = driver.getCurrentUrl();
		String expectedUrl="http://automationpractice.com/index.php?id_category=11&controller=category";

		Assert.assertEquals(currentUrl1, expectedUrl);
		wait(1000);
		
	}
	
	@Test
	public static void BwantedDress() {
		driver.navigate().to(SummerDress.pageDress(driver));
		String url1=driver.getCurrentUrl();
		String url2="http://automationpractice.com/index.php?id_product=5&controller=product";
		
		Assert.assertEquals(url1, url2);
		wait(1000);
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
