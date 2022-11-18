package Hook;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hook {

	@Before
	@BeforeAll
	@BeforeStep
	public void beforestep() {
		System.out.println();
	}
	
	@After
	@AfterAll
	@AfterStep
	public void afterstep() {
		System.out.println();
	}
}
