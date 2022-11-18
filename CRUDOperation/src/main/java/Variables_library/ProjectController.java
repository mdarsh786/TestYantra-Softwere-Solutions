package Variables_library;

public class ProjectController {
	//declare all the variables as Global variable
	String createdBy;
	String projectName;
	String status;
	int teamSize;
	
	//Create Cunstructor to initialize the variables
	public ProjectController(String createdBy, String projectName, String status, int teamSize) {
		
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	
	//Create getter and setter method
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}	

}
