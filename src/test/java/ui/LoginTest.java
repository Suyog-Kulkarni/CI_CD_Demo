package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	@Test
	public static void main(String[] args) {
		
		Automation a = new Automation();
		try {
			a.LoginInApp();
			a.AddtoCart();
			a.BackHome();
			a.CheckCartItems();
			a.Checkout();
			a.HambergerOperations();
			a.TitleCheck();
			a.Finish();
			a.BackHome();
			a.RemoveFromCart();
			a.Sorting();
			a.ProductDeatil();
			DragAndDrop.DandDfun();
			MouseHover.MouseH();
			SelectDropDown.SelectDD();
			WebDriverMethods.WebDM();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
