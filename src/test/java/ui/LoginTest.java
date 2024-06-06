package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	@Test
	public static void sample() {
		
		
		
		Automation a = new Automation();
		try {
			a.LoginInApp();
			a.AddtoCart();
			//a.BackHome();
			a.CheckCartItems();
			a.Checkout();
			//a.HambergerOperations();
			a.TitleCheck();
			a.Finish();
			//a.RemoveFromCart();
			a.Sorting();
			a.ProductDeatil();
			DragAndDrop.DandDfun();
			MouseHover.MouseH();
			SelectDropDown.SelectDD();
			WebDriverMethods.WebDM();
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/login");
			WebElement password  = driver.findElement(By.id("password"));
			password.sendKeys("Suyog@123");
			driver.findElement(with(By.tagName("input")).above(password)).sendKeys("Suyog");
			//driver.findElement(with(By.tagName("button")).below(password)).click();
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(ElementClickInterceptedException e) {
			e.printStackTrace();
		}
	}
	

}
