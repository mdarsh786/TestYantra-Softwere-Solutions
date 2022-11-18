package pojoForSerializationAndDeSerialization;

/**
 * 
 * @author Asus
 *
 */

public class EmployeeDetails {
	//Step-1:Declare all the necessary variables as global
	
	String name;
	String Id;
	String Email;
	int Phone;
	String Designation;
	
	//step-2: Create a constructor to Initialize these varriables
	public EmployeeDetails(String name, String id, String email, int phone, String designation) {

		this.name = name;
		Id = id;
		Email = email;
		Phone = phone;
		Designation = designation;
	}
	
	// Create a costructor for Deserialization
	public EmployeeDetails() {
		
	}

	//Step-3: Provide getter and setter methodes to access
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}
	

}
