package verificationpoints;

import org.openqa.selenium.WebDriver;

public class TotalPurchaseVerificationPoint {
	private WebDriver driver;
	private String expectedMessage = "Total products";
	private String expectedMessage1 = "$30.98";
	
	public TotalPurchaseVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}

	public void checkTotalPurchaseMessage() {
		if(this.driver.getPageSource().contains(expectedMessage) &&
				this.driver.getPageSource().contains(expectedMessage1)){
			System.out.println("Total purchase checked!");
		} else {
			System.out.println("Oops, it's something wrong in total purchase!");
		}
	}
}