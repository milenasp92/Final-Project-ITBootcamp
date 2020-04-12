package sajt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SummerDress {
	
	public static String homeUrl = "http://automationpractice.com/index.php";
	public static String WomendropDown = "\"//*[@id='block_top_menu']/ul/li[1]/a\"";
	public static String WomendropDownsSummer = "//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[3]/a";
	WebDriver driver = new ChromeDriver();

	
	
	public static void dropDownWomen(WebDriver driver) {

		Actions action = new Actions(driver);
		WebElement dropD = driver.findElement(By.xpath(WomendropDown));
		WebElement dress = driver.findElement(By.xpath(WomendropDownsSummer));
		action.moveToElement(dropD).moveToElement(dress).click().perform();
		wait(1000);
	}
	
	public static String  pageDress(WebDriver driver) {
		WebElement wantedDress=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a"));
		wantedDress.click();
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
