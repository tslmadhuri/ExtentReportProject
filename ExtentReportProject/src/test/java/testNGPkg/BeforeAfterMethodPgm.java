package testNGPkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodPgm {
	@BeforeMethod
	public void beforeMethod(){

		System.out.println("I am in before method_eclipseModification");

	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in after method_aftermethod update din git");
	}
}
