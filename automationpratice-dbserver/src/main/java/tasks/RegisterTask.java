package tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import appobjects.RegisterAppObject;

public class RegisterTask {

	private RegisterAppObject registerAppObject;
	
	public RegisterTask(WebDriver driver) {
		this.registerAppObject = new RegisterAppObject(driver);	
	}
	
	public void RegisterSuccessfully(String email, String firstName, String lastName,
			                         String password, String address, String city,
			                         String postalCode, String mobilePhone) {
		this.registerAppObject.getSignInButton().click();
		this.registerAppObject.getEmailTextField().sendKeys(email);
		this.registerAppObject.getCreateAccountButton().click();
		this.registerAppObject.getFirstNameTextField().sendKeys(firstName);
		this.registerAppObject.getLastNameTextField().sendKeys(lastName);
		this.registerAppObject.getPasswordTextField().sendKeys(password);
		this.registerAppObject.getAddressTextField().sendKeys(address);
		this.registerAppObject.getCityTextField().sendKeys(city);
		this.registerAppObject.getStateComboBox().sendKeys(Keys.ARROW_DOWN);
		this.registerAppObject.getStateComboBox().sendKeys(Keys.ARROW_DOWN);
		this.registerAppObject.getStateComboBox().sendKeys(Keys.ARROW_DOWN);
		this.registerAppObject.getStateComboBox().sendKeys(Keys.ARROW_DOWN);
		this.registerAppObject.getStateComboBox().sendKeys(Keys.ARROW_DOWN);
		this.registerAppObject.getStateComboBox().sendKeys(Keys.ENTER);
		this.registerAppObject.getPostalCodeTextField().sendKeys(postalCode);
		this.registerAppObject.getCountryComboBox().sendKeys(Keys.ENTER);
		this.registerAppObject.getMobilePhoneTextField().sendKeys(mobilePhone);
		this.registerAppObject.getRegisterButton().click();
	}
}