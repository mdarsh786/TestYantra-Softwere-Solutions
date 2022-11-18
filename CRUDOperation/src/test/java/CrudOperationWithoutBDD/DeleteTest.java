package CrudOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteTest {
	@Test
	
	public void deletetest() {
		
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_202");
		
		ValidatableResponse Validate = resp.then();
		Validate.log().all();
		
	}

}
