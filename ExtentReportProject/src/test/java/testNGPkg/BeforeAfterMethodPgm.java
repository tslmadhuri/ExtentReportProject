package testNGPkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodPgm {
	@BeforeMethod
	public void beforeMethod(){
<<<<<<< HEAD
		System.out.println("I am in before method");
=======
		System.out.println("I am in before method-beforemethod updated in git 123");
>>>>>>> branch 'master' of https://github.com/tslmadhuri/ExtentReportProject.git
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in after method_aftermethod update din git");
	}
}
