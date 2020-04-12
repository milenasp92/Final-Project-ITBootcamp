package sajt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {
	public static String registrationURL = "http://automationpractice.com/index.php?controller=authentication&multi-shipping=0&display_guest_checkout=0&back=http%3A%2F%2Fautomationpractice.com%2Findex.php%3Fcontroller%3Dorder%26step%3D1%26multi-shipping%3D0";
	public static String regUrl2 = "http://automationpractice.com/index.php?controller=authentication&multi-shipping=0&display_guest_checkout=0&back=http%3A%2F%2Fautomationpractice.com%2Findex.php%3Fcontroller%3Dorder%26step%3D1%26multi-shipping%3D0#account-creation";
	// WebDriverDriver=new ChromeDriver();
	WebDriverWait wait;

	public static void mail(WebDriver driver, String newAccMail) {
		WebElement mail = driver.findElement(By.id("email_create"));
		mail.sendKeys(newAccMail);
	}

	public static void createB(WebDriver driver) {

		WebElement create = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		create.click();

		wait(2000);
	}
	
	public static void gender(WebDriver driver) {
		WebElement element=driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
		element.click();
	}

	public static void name(WebDriver driver, String textName) {
		WebElement element = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		element.sendKeys(textName);
	}

	public static void lastaname(WebDriver driver, String textLastname) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		element.sendKeys(textLastname);
	}

	public static void email(WebDriver driver, String textEmail) {
		WebElement element = driver.findElement(By.xpath("//input[@id='email_create']"));
		element.sendKeys(textEmail);
	}

	public static void password(WebDriver driver, String valuePassword) {
		WebElement element = driver.findElement(By.xpath("//input[@id='passwd']"));
		element.sendKeys(valuePassword);
	}

	public static void day(WebDriver driver, String valueDay) {
		Actions action=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"days\"]"));
		action.click().sendKeys(element, valueDay);
		//element.sendKeys(valueDay);
	}

	public static void month(WebDriver driver, String valueMonth) {
		Actions action=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"months\"]/option[6]"));
		action.sendKeys(element, valueMonth);
		//element.sendKeys(valueMonth);
	}

	public static void yr(WebDriver driver, String valueYear) {
		Actions action=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"days\"]"));
		action.sendKeys(element, valueYear);

	}

	public static void name2(WebDriver driver, String textName) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		element.sendKeys(textName);
	}

	public static void lastaname2(WebDriver driver, String textLastname) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		element.clear();
		element.sendKeys(textLastname);
	}

	public static void address(WebDriver driver, String textAddress) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		element.sendKeys(textAddress);
	}

	public static void city(WebDriver driver, String textCity) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		element.sendKeys(textCity);
	}

	public static void country(WebDriver driver, String textCountry) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"id_country\"]"));
		element.sendKeys(textCountry);
	}

	public static void state(WebDriver driver, String textState) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
		element.sendKeys(textState);
	}

	public static void zip(WebDriver driver, String valueZip) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
		element.sendKeys(valueZip);
	}

	public static void number(WebDriver driver, String valueNumber) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
		element.sendKeys(valueNumber);
	}

	public static void aliasAddress(WebDriver driver, String textAliasAddress) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
		element.clear();
		element.sendKeys(textAliasAddress);
	}

	public static void clickRegisterB(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
		element.click();
		wait(2000);
	}

	public static void user(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"));
		element.click();
	}
	
	public static WebElement signOut(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@class='logout']"));
	}

	/*
	 * public void waitUsernameElement(WebDriver driver) { wait = new
	 * WebDriverWait(driver, 5);
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(name)); }
	 */

	public static void wait(int i) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
