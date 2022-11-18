package Interview;

import org.testng.annotations.Test;

import Generic_Lib.BaseClass;
import Pom_repository.HomePage;

public class UseAnotherTab extends BaseClass {
@Test
	public void flipkart() {
	
		HomePage hp=new HomePage(driver);
		hp.navigateToArshad();
	}
}
