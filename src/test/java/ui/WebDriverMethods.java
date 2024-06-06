package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {
public static void WebDM() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		driver.manage().window().maximize();
		
		WebElement ddown = driver.findElement(By.name("employees_c"));
		Select select = new Select(ddown);
		
		select.selectByValue("Level1");
		select.selectByVisibleText("51 - 100 employees");
		select.selectByIndex(4);
	}
}
