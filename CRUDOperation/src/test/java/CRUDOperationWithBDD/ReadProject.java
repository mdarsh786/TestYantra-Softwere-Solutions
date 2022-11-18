package CRUDOperationWithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ReadProject {
	
	
	@Test
	public void getProject() {
		
		baseURI="http://localhost";
		port=8084;
		
		when().get("/projects")
		.then()
		.assertThat().log().all();
		
		
	}

}
