package testovi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sajt.Home;

public class HomeTest {
	public static WebDriver driver;
	public String expectedUrl = "http://automationpractice.com/index.php?id_category=11&controller=category";

	@BeforeClass
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait(1000);
	}

	@Test
	public void AdropDownWomen() {
		driver.navigate().to(Home.homeUrl);
		Home.dropDownWomen(driver);
		String currentUrl1 = driver.getCurrentUrl();

		Assert.assertEquals(currentUrl1, expectedUrl);
		wait(1000);
	}

	@Test
	public void BdropDownDresses() {
		driver.navigate().to(Home.homeUrl);
		Home.dropDownDresses(driver);
		String currentUrl2 = driver.getCurrentUrl();

		Assert.assertEquals(currentUrl2, expectedUrl);
		wait(1000);
	}

	@Test
	public void CsameUrl() {

		driver.navigate().to(Home.homeUrl);
		String url1 = Home.dropDownWomen(driver);

		driver.navigate().to(Home.homeUrl);
		String url2 = Home.dropDownDresses(driver);

		Assert.assertEquals(url1, url2);

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
