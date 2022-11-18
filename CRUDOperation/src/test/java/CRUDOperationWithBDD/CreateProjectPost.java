package CRUDOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectPost {
	
	
	@Test
	public void createProject() {
		
		Random ran = new Random();
		int rand=ran.nextInt(100);
		
		baseURI="http://localhost";
		port=8084;
		
	JSONObject job=new JSONObject();
	job.put("createdBy", "Ankur");
	job.put("projectName", "Qspidre"+rand);
	job.put("status", "Going on");
	job.put("teamSize", 15);
	
	given()
	 .body(job)
	 .contentType(ContentType.JSON)
	 .when()
	  .post("/addProject")
	 .then()
	  .assertThat().statusCode(201).log().all();
		
	}

}
