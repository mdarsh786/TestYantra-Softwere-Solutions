package RequestChaning;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ProjectToGet {
	
	@Test
	
	public void projectGet() {
		
		baseURI="http://localhost";
		port=8084;
		
		when().get("/projects")
		.then()
		.assertThat().log().all();
		
		
	}

}
