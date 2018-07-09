package verificationpoints;

import org.openqa.selenium.WebDriver;

public class AddressVerificationPoint{
	private WebDriver driver;
	private String expectedMessage = "My address";
	
	public AddressVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkAddressMessage() {
		if(this.driver.getPageSource().contains(expectedMessage)){
			System.out.println("Address Checked!");
		} else {
			System.out.println("Oops, it's something wrong in add your address!");
		}
	}
}