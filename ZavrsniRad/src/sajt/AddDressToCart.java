package sajt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class AddDressToCart {
	
	public static String dressUrl="http://automationpractice.com/index.php?id_product=5&controller=product";
	WebDriver driver = new ChromeDriver();
	
	public static WebElement color (WebDriver driver)  {
		 WebElement color=driver.findElement(By.xpath("//*[@id=\"color_20\"]"));
		 color.click();
		return color;
		
		
	}
	
	public static void Quantity(WebDriver driver, int qty) {
		WebElement quantity = driver.findElement(By.id("quantity_wanted"));
		quantity.clear();
		quantity.sendKeys(String.valueOf(2));
		wait(1000);
		

	}

	public static void Size(WebDriver driver) {
		
		Actions action=new Actions(driver);
		WebElement size=driver.findElement(By.xpath("//*[@id=\"uniform-group_1\"]/span"));
		action.moveToElement(size).build().perform();

		
		/*
		 * Actions action=new Actions(driver);
		 * 
		 * sizeM="//*[@id=\"group_1\"]/option[2]"; WebElement size =
		 * driver.findElement(By.xpath(sizeM)); size.click();
		 * action.moveToElement(size).click();
		 */
		wait(1000);			
	}


	
	public static void Cart(WebDriver driver) {
		WebElement cart = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
		cart.click();
		wait(1000);
		
			
	}
	
	public static void Proceed(WebDriver driver) {
		WebElement proceed=driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		proceed.click();
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
