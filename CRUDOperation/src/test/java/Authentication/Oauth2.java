package Authentication;

import org.testng.Reporter;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Oauth2 {
	
	@Test
	public void oauth2Test(){
		
		baseURI="http://coop.apps.symfonycasts.com";
		
		//Create a post request with client id and client secret
		Response resp = given()
				.formParam("client_id", "Blue Avis")
				.formParam("client_secret", "9e7f5335e3d793996401d769b67a0982")
				.formParam("grant_type", "client_credentials")
				.formParam("redirect_uri", "http://arshad.com")
				.formParam("code", "authorization_code")
				.when()
				.post("/token");
				//.then().log().all();
		
		//Capture the access thetoken in response
			String token = resp.jsonPath().get("access_token");
		Reporter.log(token,true);
		
		//Use that access token to any of the APIs
		given()
		.auth().oauth2(token)
		.pathParam("USER_ID", 3525)
		.when()
		//.post("/api/{USER_ID}/barn-unlock")
		//.post("/api/{USER_ID}/toiletseat-down")
		//.post("/api/{USER_ID}/chickens-feed")
		//.post("	/api/{USER_ID}/eggs-collect")
		.post("	/api/{USER_ID}/eggs-count")
		.then().log().all();
		
	}
	
	
	
	

}
