package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.RegisterTask;

public class RegisterTestCase {
	private WebDriver driver;
	private RegisterTask register;
	
	@Before
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("http://automationpractice.com/index.php");
		this.driver.manage().window().maximize();
		this.register = new RegisterTask(driver);
	}
	
	
	@Test
	public void testMain() {
		this.register.RegisterSuccessfully("testdb02@test.com", "Mary", "Silva", "marysilva", 
				                           "1225 Island Ave", "San Diego", "92101", "998612522");
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}