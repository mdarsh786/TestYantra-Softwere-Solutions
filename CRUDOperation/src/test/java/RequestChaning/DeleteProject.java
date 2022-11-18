package RequestChaning;


import static io.restassured.RestAssured.when;

import static io.restassured.RestAssured.*;

public class DeleteProject {
	
	public void deleteproject() {
		
		baseURI="http://localhost";
		port=8084;
		when()
		 .delete("/projects/TY_PROJ_205")
		 .then()
		 .assertThat().log().all();
	}
}
