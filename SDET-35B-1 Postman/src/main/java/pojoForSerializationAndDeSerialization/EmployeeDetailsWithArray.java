package pojoForSerializationAndDeSerialization;

public class EmployeeDetailsWithArray {
	
	String name;
	String id;
	String email;
	String Degignation;
	int [] Phone;
	
	public EmployeeDetailsWithArray(String name, String id, String email, String degignation, int[] phone) {
		
		this.name = name;
		this.id = id;
		this.email = email;
		Degignation = degignation;
		Phone = phone;
	}
	
	EmployeeDetailsWithArray()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDegignation() {
		return Degignation;
	}

	public void setDegignation(String degignation) {
		Degignation = degignation;
	}

	public int[] getPhone() {
		return Phone;
	}

	public void setPhone(int[] phone) {
		Phone = phone;
	}
	
	
	
}
