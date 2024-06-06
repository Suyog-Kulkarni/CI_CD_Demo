/*
 * package ui;
 * 
 * import org.testng.annotations.Test; import static
 * org.openqa.selenium.support.locators.RelativeLocator.with; import
 * io.github.bonigarcia.wdm.WebDriverManager; import org.openqa.selenium.By;
 * import org.openqa.selenium.ElementClickInterceptedException; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * public class LoginTest {
 * 
 * @Test public void fullTestFlow() { WebDriverManager.chromedriver().setup();
 * ChromeDriver driver = new ChromeDriver();
 * driver.get("https://demoqa.com/login");
 * 
 * try {
 * 
 * // Example of finding and interacting with elements WebElement password =
 * driver.findElement(By.id("password")); password.sendKeys("Suyog@123");
 * driver.findElement(with(By.tagName("input")).above(password)).sendKeys(
 * "Suyog"); driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
 * 
 * // Add assertions or further actions as needed } catch
 * (ElementClickInterceptedException e) { e.printStackTrace(); } finally { //
 * Ensure the driver is closed properly driver.quit(); } }
 * 
 * // Other test methods... }
 */