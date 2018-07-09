package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.PurchaseTask;
import verificationpoints.ProductVerificationPoint;
import verificationpoints.AddressVerificationPoint;
import verificationpoints.TotalPurchaseVerificationPoint;
import verificationpoints.ConfirmOrderVerificationPoint;

public class PurchaseTestCase {

	private WebDriver driver;
	private PurchaseTask purchase;
	private ProductVerificationPoint productVerificationPoint;
	private AddressVerificationPoint addressVerificationPoint;
	private TotalPurchaseVerificationPoint totalPurchaseVerificationPoint;
	private ConfirmOrderVerificationPoint confirmOrderVerificationPoint;
	

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("http://automationpractice.com/index.php");
		this.driver.manage().window().maximize();
		this.purchase = new PurchaseTask(driver);

		this.productVerificationPoint = new ProductVerificationPoint(driver);
		this.addressVerificationPoint = new AddressVerificationPoint(driver);
		this.totalPurchaseVerificationPoint = new TotalPurchaseVerificationPoint(driver);
		this.confirmOrderVerificationPoint = new ConfirmOrderVerificationPoint(driver);	
	}

	@Test
	public void testMain() {
		this.purchase.PurchaseSuccessfully("dresses", "testdb01@test.com", "marysilva");

		this.productVerificationPoint.checkAddProductCartMessage();
		this.addressVerificationPoint.checkAddressMessage();
		this.totalPurchaseVerificationPoint.checkTotalPurchaseMessage();
		this.confirmOrderVerificationPoint.checkOrderMessage();
	}

	@After
	public void tearDown() throws Exception {
		 driver.quit();
	}
}