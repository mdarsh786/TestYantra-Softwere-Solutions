package DifferentWaysToPost;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectUsingHashMap {

	@Test

	public void usingHashmap() {
		
		Random ran=new Random();
		int rand=ran.nextInt(100); 
		
		baseURI="http://localhost";
		port=8084;

		HashMap hsm=new HashMap();
		hsm.put("createdBy", "Arshad");
		hsm.put("projectName", "Qspidre34"+rand);
		hsm.put("status", "Going on");
		hsm.put("teamSize", 15);

		given()
		.body(hsm)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();

	}

}
