package RequestChaning;

import org.testng.Reporter;
import org.testng.annotations.Test;
import Variables_library.ProjectController;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import java.util.Random;

public class PostAndtGetAndDeleteProject{
	
	@Test
	public void requestChainig() {
	
	// create the project
	Random ran=new Random();
	int random=ran.nextInt(100);

	baseURI="http://localhost";
	port=8084;

	//TY_PROJ_408
	ProjectController proj=new ProjectController("Abhisek", "Amdoc"+random, "Created", 15);

	Response resp = given().body(proj).contentType(ContentType.JSON).when().post("/addProject");
	
	//Retrive the projectId using jsonpath() from response
			String pid = resp.jsonPath().get("projectId");
			Reporter.log(pid,true);
			
	//Use the projectId to Get() and log it in response	
			given()
			.pathParam("proId", pid)
			.get("/projects/{proId}")
			.then().log().all();
//			when()
//			.get("/projects"+proId);
			
	//Use the same projectId to delete() and verify the Status Code
		given()
		.pathParam("proId", pid)
		.when()
		.delete("/projects/{proId}")
		.then().assertThat().log().all();
	}


}