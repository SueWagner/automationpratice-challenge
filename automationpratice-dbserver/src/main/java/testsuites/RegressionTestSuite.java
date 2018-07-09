package testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import testcases.PurchaseTestCase;
import testcases.RegisterTestCase;


@RunWith(Suite.class)
@SuiteClasses({	
	RegisterTestCase.class,
	PurchaseTestCase.class
})
public class RegressionTestSuite {
	@BeforeClass
	public static void init() {
		System.out.println("Beginning test execution...");
	}
	
	@AfterClass
	public static void end() {
		System.out.println("Ending test run...");
	}
}