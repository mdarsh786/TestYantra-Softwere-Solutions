package DifferentWaysToPost;

import org.testng.annotations.Test;

import Variables_library.ProjectController;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectUsingPojo {
	
	@Test
	public void usingpojo() {
		
		Random ran=new Random();
		int random=ran.nextInt(100);
		
		baseURI="http://localhost";
		port=8084;
		
		//Create Data
		ProjectController plib=new ProjectController("Arsh", "Xylem"+random, "Created", 10);
		
		
		//send the request and validate response
		
		given()
		.body(plib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
		
	}

}
