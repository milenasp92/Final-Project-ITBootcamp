package sajt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {
	public static String homeUrl = "http://automationpractice.com/index.php";
	public static String cartUrl ="http://automationpractice.com/index.php?controller=order";
		WebDriver driver = new ChromeDriver();
	
	public static void checkCart (WebDriver driver) {
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"center_column\"]"));
		wait(2000);
		WebElement checkout=driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		checkout.click();
	
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
