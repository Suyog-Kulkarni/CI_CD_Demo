package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

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

}
