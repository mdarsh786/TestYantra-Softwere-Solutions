package RequestChaning;

import Variables_library.ProjectController;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateProjectPostAndUpdate {
	@Test
	public void reqprojectpost() {
		
		Random ran=new Random();
		int random=ran.nextInt(100);

		baseURI="http://localhost";
		port=8084;

		//TY_PROJ_408
		ProjectController proj=new ProjectController("Abhisek", "Amdoc"+random, "Created", 15);

		Response resp = given().body(proj).contentType(ContentType.JSON).when().post("/addProject");
				String pid = resp.jsonPath().get("projectId");
				Reporter.log(pid,true);
				
		ProjectController proj2=new ProjectController("Abhisek", "Amdoc"+random, "Completed", 15);
		given().body(proj2).contentType(ContentType.JSON)
		.pathParam("proId", pid)
		.when().put("/projects/{proId}")
		.then().assertThat().statusCode(200).log().all();

	}

}
