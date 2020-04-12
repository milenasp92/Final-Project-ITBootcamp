package sajt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	public static String SignInUrl="http://automationpractice.com/index.php?controller=authentication&back=my-account";
	
	By newEmail=By.id("email_create");
	By createB=By.xpath("//*[@id=\"SubmitCreate\"]/span");
	By email=By.xpath("//*[@id=\"email\"]");
	By pass=By.xpath("//*[@id=\"passwd\"]");
	By forgotPass=By.xpath("//*[@id=\"login_form\"]/div/p[1]/a");
	By signInB=By.xpath("//*[@id=\"SubmitLogin\"]/span");
	WebDriver driver;
	
	
	public static void emailCreate (WebDriver driver, String textNewUserEmail) {
		WebElement element = driver.findElement(By.id("email_create"));
		element.click();
		element.sendKeys(textNewUserEmail);
		}
	
	public static void createNew(WebDriver driver) {
		WebElement element=driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		element.click();
	}
	
	public static void emailSignIn (WebDriver driver, String signInEmail) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"email\"]")); 
		element.sendKeys(signInEmail);
	}
	
	public static void password(WebDriver driver, String signInPass) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"passwd\"]")); 
		element.click();
		element.sendKeys(signInPass);
	}
	
	public static void forgotPass(WebDriver driver) {
		WebElement element=driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"));
		element.click();
	}
	
	public static void signInClick (WebDriver driver) {
		WebElement element=driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		element.click();
	}
	
	public static void signOut(WebDriver driver) {
		driver.findElement(By.xpath("//a[@class='logout']")).click();
	}



}
