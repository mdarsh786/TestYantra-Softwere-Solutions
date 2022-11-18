package CRUDOperationWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProject {
	
	@Test
	public void deleteproject() {
		baseURI="http://localhost";
		port=8084;
		when()
		 .delete("/projects/TY_PROJ_205")
		 .then()
		 .assertThat().log().all();
	}

}
