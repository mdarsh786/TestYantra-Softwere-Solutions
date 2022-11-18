package Authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuth {
	
	@Test
	public void basicauthTest() {
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		.auth()
		.basic("rmgyantra", "rmgy@9999")
		.when()
		.get("/login")
		.then().log().all();
	}
	
	@Test
	public void disetiveAuthTest() {
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		.auth()
		.digest("rmgyantra", "rmgy@9999")
		.when()
		.get("/login")
		.then().log().all();
	}
	
	@Test
	public void premitiveAuthTest() {
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		.auth()
		.preemptive().basic("rmgyantra","rmgy@9999")
		.when()
		.get("/login")
		.then().log().all();
		
		
	}

}
