package ResponceValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class StaticResponceValidation {
	
	@Test
	public void staticresponse() {
		
		baseURI ="http://localhost";
		port=8084;
		
		String expData = "TY_PROJ_002";
		
		//send request and validate response
		Response resp = when()
				.get("/projects");
				
		//validate
		String actData = resp.jsonPath().get("[0].projectId");
		//Assert.assertEquals(actData, expData);
		Assert.assertEquals(expData, actData);
		resp.then().log().all();
		
		
	}

}
