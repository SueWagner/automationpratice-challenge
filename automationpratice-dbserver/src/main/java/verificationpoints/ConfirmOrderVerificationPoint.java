package verificationpoints;

import org.openqa.selenium.WebDriver;

public class ConfirmOrderVerificationPoint {
	private WebDriver driver;
	private String expectedMessage = "Your order on My Store is complete";
	
	public ConfirmOrderVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}

	public void checkOrderMessage() {
		if(this.driver.getPageSource().contains(expectedMessage)){
			System.out.println("Purchase successfully complete!");
		} else {
			System.out.println("Purchase imcomplete!");
		}
	}
}