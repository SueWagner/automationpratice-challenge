package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterAppObject {
	
	private WebDriver driver;
	
	public RegisterAppObject(WebDriver driver){
		this.driver = driver;
	}

	public WebElement getSignInButton(){
		return this.driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")); 
	} 
	
	public WebElement getEmailTextField(){
		return this.driver.findElement(By.id("email_create"));
	} 
	
	public WebElement getCreateAccountButton(){
		return this.driver.findElement(By.id("SubmitCreate"));
	} 

	public WebElement getFirstNameTextField(){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		@SuppressWarnings("unused")
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("customer_firstname")));
		return this.driver.findElement(By.id("customer_firstname"));
	}
		
	public WebElement getLastNameTextField(){
		return this.driver.findElement(By.id("customer_lastname"));
	} 
		
	public WebElement getPasswordTextField(){
		return this.driver.findElement(By.id("passwd"));
	}
		
	public WebElement getAddressTextField(){
		return this.driver.findElement(By.id("address1"));
	}
		
	public WebElement getCityTextField(){
		return this.driver.findElement(By.id("city"));
	}
		
	public WebElement getStateComboBox(){
		return this.driver.findElement(By.id("id_state"));
	}

	public WebElement getPostalCodeTextField(){
		return this.driver.findElement(By.id("postcode"));
	}
		
	public WebElement getCountryComboBox(){
		return this.driver.findElement(By.id("id_country"));
	}
		
	public WebElement getMobilePhoneTextField(){
		return this.driver.findElement(By.id("phone_mobile"));
	}
		
		
	public WebElement getRegisterButton(){
		return this.driver.findElement(By.id("submitAccount"));
	}
}