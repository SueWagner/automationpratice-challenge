package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchaseAppObject {
	private WebDriver driver;
	
	public PurchaseAppObject(WebDriver driver){
		this.driver = driver;
	}


	public WebElement getSearchBoxTextField(){
		return this.driver.findElement(By.id("search_query_top"));
	} 
	
	public WebElement getProductView() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]"));
	}
	
	public WebElement getAddCartButton(){
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]"));
	}
		
	public WebElement getProceedButton() 
	{	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		@SuppressWarnings("unused")
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")));
		return this.driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
	}
	
	public WebElement getProceed1Button() 
	{
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
	}
	
	public WebElement getEmailTextField() {
		return this.driver.findElement(By.id("email"));
	}
	
	public WebElement getPasswordTextField() {
		return this.driver.findElement(By.id("passwd"));
	}
	
	public WebElement getSubmitLoginButton() {
		return this.driver.findElement(By.id("SubmitLogin"));
	}
	
	public WebElement getProceed2Button(){
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
	}
	
	public WebElement getCheckBoxButton(){
		return this.driver.findElement(By.id("cgv"));
	}
	
	public WebElement getProceed3Button(){
		return this.driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
	}
	
	public WebElement getPayByCheckButton(){
		return this.driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
	}
	
	public WebElement getConfirmOrderButton(){
		return this.driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
	}	
}