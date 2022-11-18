package ProjectForUpdate;

import org.testng.annotations.Test;

import Variables_library.ProjectController;

import static io.restassured.RestAssured.*;

public class ProjectControllerForGet {
	
	@Test
	public void usingPojoForGet() {
		
		baseURI="http://localhost";
		port=8084;
		
		ProjectController plib=new ProjectController(DEFAULT_SESSION_ID_VALUE, DEFAULT_PATH, DEFAULT_BODY_ROOT_PATH, DEFAULT_PORT);
		when()
		.get("/projects")
		.then()
		.assertThat().log().all();
	}

}