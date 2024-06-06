package ui;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
	@Test
public static void SelectDD() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
//		WebElement password  = driver.findElement(By.id("password"));
//		password.sendKeys("Suyog@123");
//		driver.findElement(with(By.tagName("input")).above(password)).sendKeys("Suyog");
//		//driver.findElement(with(By.tagName("button")).below(password)).click();
//		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getSessionId());
		
		System.out.println(driver.getPageSource());
		
		driver.navigate().to("http://www.google.com");
		
//		✅ sendKeys(java.lang.CharSequence... keysToSend) - Use this method to simulate typing into an element, which may set its value.
//		✅ clear() - If this element is a text entry element, this will clear the value.
//		✅ click() - Click this element.
//		✅ getAttribute(java.lang.String name) - Get the value of the given attribute of the element.
//		✅ getCssValue(java.lang.String propertyName) - Get the value of a given CSS property.
//		✅ getLocation() - Where on the page is the top left-hand corner of the rendered element?
//		✅ getSize() - What is the width and height of the rendered element?
//		✅ getTagName() - Get the tag name of this element.
//		✅ getText() - Get the visible text
//		✅ isDisplayed() - Is this element displayed or not? This method avoids the problem of having to parse an element's "style" attribute.
//		✅ isEnabled() - Is the element currently enabled or not? This will generally return true for everything but disabled input elements.
//		✅ isSelected() - Determine whether or not this element is selected or not.
		WebElement password  = driver.findElement(By.id("password"));
		driver.findElement(with(By.tagName("input")).above(password)).sendKeys("Suyog");
		System.out.println(driver.findElement(By.id("password")).getAttribute("class"));
		System.out.println(driver.findElement(By.id("password")).getSize());
		System.out.println(driver.findElement(By.id("password")).getLocation());
		System.out.println(driver.findElement(By.id("password")).getText());
		System.out.println(driver.findElement(By.id("password")).getTagName());
		System.out.println(driver.findElement(By.id("password")).isDisplayed());
		System.out.println(driver.findElement(By.id("password")).isEnabled());
		System.out.println(driver.findElement(By.id("password")).isSelected());
		driver.close();
		
		

	}
}
