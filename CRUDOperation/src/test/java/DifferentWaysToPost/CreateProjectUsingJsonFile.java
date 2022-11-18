package DifferentWaysToPost;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectUsingJsonFile {
	
	@Test
	
	
	public void usingJsonFile() {
		
		baseURI="http://localhost";
		port=8084;
		
		//create data
		File fi=new File("./TestData/data.json");
		
		//send the request and validate the responce
		given()
		.body(fi)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then().log().all();
		
	}

}
