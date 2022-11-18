package Parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PathParameters {
	
	@Test
	
	public void pathparam() {
		//get single project
		baseURI="http://localhost";
		port=8084;
		
		given()
		.pathParam("pid", "TY_PROJ_407")
		.when()
		.get("/projects/{pid}")
		.then().log().all();
	}

}
