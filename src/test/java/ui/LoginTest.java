package ui;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
	
	public ChromeDriver driver;
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		WebElement password  = driver.findElement(By.id("password"));
		password.sendKeys("Suyog@123");
		driver.findElement(with(By.tagName("input")).above(password)).sendKeys("Suyog");
		//driver.findElement(with(By.tagName("button")).below(password)).click();
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		

	}
	@BeforeTest
	public void LoginInApp() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		Username.sendKeys("standard_user");
		
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.sendKeys("secret_sauce");
		Thread.sleep(3000);
		WebElement Login = driver.findElement(By.xpath("//*[@value=\"Login\"]"));
		Login.click();
		System.out.println("Login Successful");
		
	}
	@Test
	public void HambergerOperations() {
		
		WebElement l = driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
		l.click();
		//WebElement element = driver.findElement(By.className("bm-item-list"));
		WebElement elements = driver.findElement(By.xpath("//*[text()=\"About\"]"));
		elements.click();
	}
	
	@Test
	public void TitleCheck() throws InterruptedException {
		String Expected = "Swag Labs";
		String Actual = driver.getTitle();
		
		SoftAssert SoftA = new SoftAssert();
		SoftA.assertEquals(Actual, Expected);
		Thread.sleep(3000);
	}
	
	@Test
	public void AddtoCart() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement AddtoCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		AddtoCart.click();
		System.out.println("Product Added to Cart");
		
	}
	@Test
	public void CheckCartItems() throws InterruptedException {
		
		WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
		cart.click();
		Thread.sleep(3000);
	}
	
	@Test
	public void Checkout() throws InterruptedException {
		
		WebElement CheckoutButton = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		CheckoutButton.click();
		
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Suyog");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Kulkarni");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("411048");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	}
	
	@Test
	public void Finish() throws InterruptedException {
		
		WebElement FinishButton = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
		Thread.sleep(2000);
		FinishButton.click();
	}
	
	@Test
	public void BackHome() {
		
		WebElement BackHomeButton = driver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
		BackHomeButton.click();
	}
	
	@Test
	public void RemoveFromCart() throws InterruptedException {
		
		driver.navigate().to("https://www.saucedemo.com/inventory.html");
		WebElement AddtoCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		AddtoCart.click();
	
		WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
		cart.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()=\"Remove\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
	}
	
	@Test
	public void Sorting() throws InterruptedException {
		
		WebElement list = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		list.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='product_sort_container']/option[@value='az']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='product_sort_container']/option[@value='za']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='product_sort_container']/option[@value='lohi']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='product_sort_container']/option[@value='hilo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='product_sort_container']/option[@value='az']")).click();
		}
	
	@Test
	public void ProductDeatil() throws InterruptedException {
		
		driver.navigate().to("https://www.saucedemo.com/inventory.html");
		Thread.sleep(2000);
		WebElement Product = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		Product.click();
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	}
}
