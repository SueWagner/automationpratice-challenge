package verificationpoints;

import org.openqa.selenium.WebDriver;

public class ProductVerificationPoint {
	private WebDriver driver;
	private String expectedMessage = "There is 1 item in your cart.";
	private String expectedMessage1 = "$30.98";
	
	public ProductVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}

	public void checkAddProductCartMessage() {
		if(this.driver.getPageSource().contains(expectedMessage) 
				&& this.driver.getPageSource().contains(expectedMessage1)){
			System.out.println("Product correctly add to cart!");
		} else {
			System.out.println("Oops, it's something wrong in add your product to cart!");
		}
	}
}