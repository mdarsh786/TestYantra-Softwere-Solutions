package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {
	
	@Test
	
	public void bearerTokenTest() {
	
		baseURI="https://api.github.com";
		JSONObject job=new JSONObject();
		job.put("name", "SDET-35 RestAssured");
		job.put("Description", "Full RestAssured testing");
		
		given()
		.auth().oauth2("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")
		.body(job)
		.contentType(ContentType.JSON)
		.when()
		.post("/user/repos")
		.then().assertThat().statusCode(201).log().all();
		
	}

}
