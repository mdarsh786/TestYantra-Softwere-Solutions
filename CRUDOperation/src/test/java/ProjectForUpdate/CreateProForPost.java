package ProjectForUpdate;

import static io.restassured.RestAssured.given;
import java.util.Random;
import org.testng.annotations.Test;
import Variables_library.ProjectController;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class CreateProForPost {
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
