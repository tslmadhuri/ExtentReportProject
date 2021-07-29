package testNGPkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("I am in before method-beforemethod updated in git");
	}
	
	@Test
	public void testMethod() {
		System.out.println("Iam in test method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in after method_aftermethod update din git");
	}

}
