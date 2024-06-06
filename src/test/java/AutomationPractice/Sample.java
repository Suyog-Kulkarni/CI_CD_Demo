package AutomationPractice;

import ui.Automation;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
	