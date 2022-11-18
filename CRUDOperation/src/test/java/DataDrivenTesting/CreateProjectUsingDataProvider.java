package DataDrivenTesting;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingDataProvider {
	
	@DataProvider(name="DataForPost")
public Object[][] daataTest(){
	
	Object[][] data=new Object[5][4];
	
	data[0][0] = "Vaibhav B";
	data[0][1] = "Infosys";
	data[0][2] = "Created";
	data[0][3] = 10;
	
	data[1][0] = "Sujit M";
	data[1][1] = "ITC";
	data[1][2] = "Created";
	data[1][3] = 15;
	
	data[2][0]= "Madhu";
	data[2][1]= "Medicine MR";
	data[2][2]= "Going On";
	data[2][3]= 20;
	
	data[3][0] = "Sudan";
	data[3][1] = "TCS_1";
	data[3][2] = "Created";
	data[3][3] = 10;
	
	data[4][0] = "Sonu";
	data[4][1] = "InfoTech";
	data[4][2] = "Completed";
	data[4][3] = 20;
	
	return data;
	}
	
	@Test(dataProvider = "DataForPost")
	public void usingDataPorvider(String createdBy,String projectName,String status,int teamSize) {
		
		JSONObject js=new JSONObject();
		js.put("createdBy", createdBy);
		js.put("projectName", projectName);
		js.put("status", status);
		js.put("teamSize", teamSize);
		
		baseURI="http://localhost";
		port=8084;
		given()
			.body(js)
			.contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		 .then()
		 .assertThat().statusCode(201).log().all();
		
	}
}

