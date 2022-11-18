package DifferentWaysToPost;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingJsonObj {
	
	@Test
	 public void createProUsingJsonObj() {
		
		baseURI="http://localhost";
		port=8084;
		
		JSONObject job=new JSONObject();
		
		job.put("createdBy", "Arshad");
		job.put("projectName", "Qspidre");
		job.put("status", "Going on");
		job.put("teamSize", 20);
		
		given()
		 .body(job)
		 .contentType(ContentType.JSON)
		 .when()
		  .post("/addProject")
		 .then()
		  .assertThat().statusCode(201).log().all();
		
	}

}
