package CrudOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class ReadTest {
	
	@Test
	public void getTest() {
		Response resp=RestAssured.get("http://localhost:8084/projects");
		
		ValidatableResponse Validate = resp.then();
		Validate.log().all();
		
	}

}
