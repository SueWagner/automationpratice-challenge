package tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import appobjects.PurchaseAppObject;

public class PurchaseTask {
	private PurchaseAppObject purchaseAppObject;
	
	public PurchaseTask(WebDriver driver){
		this.purchaseAppObject = new PurchaseAppObject(driver);	
	}
	
	public void PurchaseSuccessfully(String product, String email, String password){

		this.purchaseAppObject.getSearchBoxTextField().sendKeys(product);
		this.purchaseAppObject.getSearchBoxTextField().sendKeys(Keys.ENTER);
		this.purchaseAppObject.getProductView().click();
		this.purchaseAppObject.getAddCartButton().click();
		this.purchaseAppObject.getProceedButton().click();
		this.purchaseAppObject.getProceed1Button().click();
		this.purchaseAppObject.getEmailTextField().sendKeys(email);
		this.purchaseAppObject.getPasswordTextField().sendKeys(password);
		this.purchaseAppObject.getSubmitLoginButton().click();
		this.purchaseAppObject.getProceed2Button().click();
		this.purchaseAppObject.getCheckBoxButton().click();
		this.purchaseAppObject.getProceed3Button().click();
		this.purchaseAppObject.getPayByCheckButton().click();
		this.purchaseAppObject.getConfirmOrderButton().click();
	}
}