package CrudOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateTest {
	@Test
	public void testPost() {
		//Step-1: Create the required data
		JSONObject job=new JSONObject();
		job.put("createdBy", "Arshad");
		job.put("projectName", "CRM113");
		job.put("status", "created");
		job.put("teamSize", 10);
		
		//Step-2: Send the Request
		RequestSpecification req = RestAssured.given();
		req.body(job);
		req.contentType(ContentType.JSON);
		Response resp = req.post("http://localhost:8084/addProject");
		
		//Step-3: Validate the data
		//System.out.println(resp.asString());
		//System.out.println(resp.prettyPrint());
		//System.out.println(resp.prettyPeek());
		System.out.println(resp.getContentType());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getTime());
		ValidatableResponse validate = resp.then();
		validate.log().all();
		
	}

}
