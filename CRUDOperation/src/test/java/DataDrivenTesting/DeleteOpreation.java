package DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteOpreation {
	
	@DataProvider(name="DataForDelete")
	public Object[] deleteData(){
		return null;
		
		

	}
	@Test(dataProvider = "DataForDelete")
	public void deleteProject(String projectId) {
		
		baseURI="http://localhost";
		port=8084;
		
		when()
		.delete("/projects/{projectId}")
		.then().statusCode(200);
	}

}
