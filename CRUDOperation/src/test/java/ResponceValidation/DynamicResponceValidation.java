package ResponceValidation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponceValidation {
	
	@Test
	
	public void dynamicresponse() {
		
		baseURI="http://localhost:8084";
		//port=8084;
		
		String expData = "TY_PROJ_003";
		
		Response resp=when().get("/projects");
		
		//validate respone
		Boolean flag=false; 
		List<String> list = resp.jsonPath().get("projectId");
		for(String s:list)
		{
			if(s.equalsIgnoreCase(expData))
			{
				flag=true; //flag rising
				break;
			}
		}
		Assert.assertTrue(flag);
	}

}
