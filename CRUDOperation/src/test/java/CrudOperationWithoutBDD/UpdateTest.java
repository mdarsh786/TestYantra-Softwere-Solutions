package CrudOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateTest {
	
	@Test
	public void updatetest() {
		
		JSONObject job=new JSONObject();
		job.put("createdby", "Arshad Ansari");
		job.put("projectname", "CRM110");
		job.put("status", "Going on");
		job.put("teamsize", 10);
		
		RequestSpecification req = RestAssured.given();
		req.body(job);
		req.contentType(ContentType.JSON);
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_202");
		
		ValidatableResponse Validate = resp.then();
		Validate.log().all();
		
	}
	
}
