package ProjectForUpdate;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.testng.annotations.Test;

import Variables_library.ProjectController;
import io.restassured.http.ContentType;

public class ProjectForUpdate {
	
	@Test
	
	public void usingPojoForUpdate() {
		

		Random ran=new Random();
		int random=ran.nextInt(100);
		
		baseURI="http://localhost";
		port=8084;
		
		//Create Data
		ProjectController plib=new ProjectController("Arsh", "Xylem"+random, "Completed", 10);
		
		//send the request and validate response
		
		given()
		.body(plib)
		.contentType(ContentType.JSON)
		.when()
		.put("/projects/TY_PROJ_407")
		.then()
		.assertThat().statusCode(200).log().all();
	}

}












