package testovi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import sajt.Ex;
import sajt.Home;
import sajt.Registration;
import sajt.SignIn;
import sajt.UserList;


public class RegistrationTest {
	private static WebDriver driver;
	private static SoftAssert sa = new SoftAssert();

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(Home.homeUrl);
	}

	@Test(priority = 1)
	public static void ARegPage() {
		driver.findElement(By.linkText("Sign in")).click();
		wait(2000);

	}

	@Test(priority = 2)
	public void BcreateNewAcc() {

		Registration.mail(driver, "lllamadramaproblaama5@yahoo.com");
		Registration.createB(driver);
		wait(3000);

	}

	@Test(priority = 3)
	public void CnextPage() throws InterruptedException {

		// Registration.gender(driver);
		Registration.name(driver, "milena");
		Registration.lastaname(driver, "Sp");
		// Registration.email(driver, "llamadrama5@yahoo.com");
		Registration.password(driver, "milenamilena5");
		wait(1000);
		// Registration.day(driver, "13");;
		// Registration.month(driver, "May");
		// Registration.yr(driver, "1992");
		Registration.name2(driver, "milena");
		Registration.lastaname2(driver, "Sp");
		wait(1000);
		Registration.address(driver, "Diljska");
		Registration.city(driver, "annapolis");
		Registration.country(driver, "USA");
		Registration.state(driver, "Maryland");
		Registration.zip(driver, "20704");
		Registration.number(driver, "874378");
		Registration.aliasAddress(driver, "Visnjicka 10");
		wait(1000);
		Registration.clickRegisterB(driver);
		wait(1000);
		Registration.user(driver);

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "http://automationpractice.com/index.php?controller=my-account";

		Thread.sleep(5000);
		Assert.assertEquals(actualUrl, expectedUrl);

	}

	@Test(priority = 4)
	public void DUsers()

			throws FileNotFoundException, IOException, InterruptedException {

		try (FileInputStream fi = new FileInputStream("src/sajt/ListOfUsers1.xlsx");
				XSSFWorkbook wb = new XSSFWorkbook(fi)) {

			for (int i = 1; i <= 30; i++) {

				driver.navigate().to(Registration.registrationURL);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				// Registration r= new Registration();
				driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
				;

				WebElement createAnAccountEmail = driver.findElement(By.id("email_create"));
				createAnAccountEmail.clear();
				createAnAccountEmail.sendKeys(Ex.getEmail(i));
				WebElement createAnAccountBtn = driver.findElement(By.id("SubmitCreate"));
				createAnAccountBtn.click();

				Thread.sleep(1000);

				while (driver.findElement(By.id("create_account_error")).isDisplayed()) {
					Thread.sleep(1000);
					driver.findElement(By.id("email_create")).click();
					driver.findElement(By.id("email_create")).clear();
					Random randomGenerator = new Random();
					int randomInt = randomGenerator.nextInt(1000);
					driver.findElement(By.id("email_create")).sendKeys("radiiradii" + randomInt + "@gmail.com");
					WebElement submitBtn = driver.findElement(By.id("SubmitCreate"));
					Thread.sleep(1000);
					submitBtn.click();
				}

				Thread.sleep(3000);

				Registration.name(driver, Ex.getFirstname(i));
				Registration.lastaname(driver, Ex.getLastname(i));
				Registration.password(driver, Ex.getPassword(i));
				Registration.address(driver, Ex.getAddress(i));
				Registration.city(driver, Ex.getCity(i));
				Registration.state(driver, Ex.getStateXpath(i));
				Registration.zip(driver, Ex.getZipCode(i));
				Registration.number(driver, Ex.getPhone(i));
				Registration.aliasAddress(driver, Ex.getAlias(i));
				Registration.clickRegisterB(driver);

				Thread.sleep(3000);

				String actualTitle = driver.getTitle();

				String expectedTitle = "My account - My Store";

				Assert.assertEquals(actualTitle, expectedTitle);
			}
		}
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
