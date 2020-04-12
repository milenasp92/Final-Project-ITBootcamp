package testovi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import sajt.AddDressToCart;
import sajt.Home;
import sajt.SummerDress;

public class AddDressCartTest {
	public static WebDriver driver;
	public static String summerD="http://automationpractice.com/index.php?id_category=11&controller=category";
	public static String wantedDress="http://automationpractice.com/index.php?id_product=5&controller=product#/size-s/color-blue";

	@BeforeClass

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait(1000);
	}

	@Test
	public static void AsummerDress() {
		driver.navigate().to(summerD);

		String currentUrl1 = driver.getCurrentUrl();
		String expectedUrl = "http://automationpractice.com/index.php?id_category=11&controller=category";

		Assert.assertEquals(currentUrl1, expectedUrl);

		wait(1000);

	}
	
	@Test
	public static void BwantedDress() {
		driver.navigate().to(wantedDress);

		String currentUrl1 = driver.getCurrentUrl();
		String expectedUrl = "http://automationpractice.com/index.php?id_product=5&controller=product#/size-s/color-blue";

		Assert.assertEquals(currentUrl1, expectedUrl);

		wait(1000);
		
	}

	@Test
	public static void Cquantity() {

		AddDressToCart.Quantity(driver, 2);
		Assert.assertTrue(true);
		wait(1000);
	}

	@Test
	public static void Dsize() {

		Select element = new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]")));
		element.selectByVisibleText("M");
		Assert.assertTrue(true);
		wait(2000);

	}

	

	@Test
	public static void ECart() {
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		Assert.assertTrue(true);
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
