package testovi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import sajt.Ex;
import sajt.Registration;
import sajt.SignIn;

public class SignInTest {
	public static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void navigateToRegPage() {
		driver.get(Registration.regUrl2);
		Assert.assertEquals(driver.getCurrentUrl(), Registration.regUrl2);
	}

	@Test
	public void signUsersTest() {
		SoftAssert sa = new SoftAssert();

		for (int i = 2; i <= 30; i++) {
			if (driver.getCurrentUrl() != Registration.regUrl2)
				driver.navigate().to(Registration.regUrl2);
			SignIn.emailSignIn(driver, Ex.getEmail(i));

			SignIn.password(driver, Ex.getPassword(i));
			SignIn.signInClick(driver);
			;
			sa.assertTrue(Registration.signOut(driver).getText().contains("Sign out"));

			if (Registration.signOut(driver).getText().contains("Sign out")) {
				SignIn.signOut(driver);
				;

			} else {
				System.out.println("Log In Unsuccessful");

			}
		}
		sa.assertAll();
	}

	@AfterClass
	public static void close() {
		driver.quit();
	}

}
