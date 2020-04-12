package sajt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Home {
	public static String homeUrl = "http://automationpractice.com/index.php";
	public static String WomendropDown = "//*[@id=\"block_top_menu\"]/ul/li[1]/a";
	public static String WomendropDownsSummer="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a";
	public static String DressesDropDown = "//*[@id='block_top_menu']/ul/li[2]/a";
	public static String DressesdropDownSummer="//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a";
	WebDriver driver = new ChromeDriver();

	public static String dropDownWomen(WebDriver driver) {

		Actions action = new Actions(driver);
		WebElement dropD = driver.findElement(By.xpath(WomendropDown));
		WebElement dress = driver.findElement(By.xpath(WomendropDownsSummer));
		action.moveToElement(dropD).moveToElement(dress).click().perform();
		wait(1000);
		return driver.getCurrentUrl();
	}

	public static String dropDownDresses(WebDriver driver) {

		Actions action = new Actions(driver);
		WebElement dropD = driver.findElement(By.xpath(DressesDropDown));
		WebElement dress = driver.findElement(By.xpath(DressesdropDownSummer));
		action.moveToElement(dropD).moveToElement(dress).click().perform();
		wait(1000);
		 return driver.getCurrentUrl();

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
