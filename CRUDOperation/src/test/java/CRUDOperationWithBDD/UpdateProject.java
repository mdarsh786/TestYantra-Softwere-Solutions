package CRUDOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProject {
	
	@Test
	public void updateproject() {
		
		baseURI="http://localhost";
		port=8084;
		
		JSONObject job=new JSONObject();
		job.put("createdBy", "Ankur");
		job.put("projectName", "Qspidre");
		job.put("status", "Created");
		job.put("teamSize", 15);
		
		given()
		 .body(job)
		 .contentType(ContentType.JSON)
		 .when()
		  .put("/projects/TY_PROJ_205")
		 .then()
		  .assertThat().statusCode(200).log().all();
	}

}
