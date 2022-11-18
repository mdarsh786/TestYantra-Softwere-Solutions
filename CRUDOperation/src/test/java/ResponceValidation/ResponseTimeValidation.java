package ResponceValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidation {

	@Test
	
	public void responseTime() {
		 
		baseURI="http://localhost";
		port=8084;
		
		Response resp = when().get("/projects");
		
		//Hamcrest Matchers-Tool which help to validate response time
		//Hamcrest Matchers has a class called Matchers which has method like lessthan(),greaterthan()
		//lessthanorEqual()
		
		resp.then().assertThat().time(Matchers.lessThan(900L),TimeUnit.MILLISECONDS)
		.log().all();
	
	}
}
