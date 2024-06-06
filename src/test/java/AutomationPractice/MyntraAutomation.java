
package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class MyntraAutomation {

	public ChromeDriver driver;
	@Test
	public void PriceCheck() {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.cssSelector("#desktop-header-cnt > div.desktop-bound > div.desktop-query > input"));
		search.sendKeys("tshirts");
		
		Actions a = new Actions(driver);
		a.sendKeys(search, Keys.ENTER).perform();
		
		WebElement product = driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[2]/div/span[1]/span[1]"));
		product.click();
		
		WebElement Price = driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[2]/div[2]/div[1]/div/p[1]/span[1]/strong"));
		System.out.println(Price);
		
		

	}

}
