package pojoForSerializationAndDeSerialization;

public class EmpDetailsWithObject {
	
	String name;
	String id;
	String email;
	String Degignation;
	int [] Phone;
	Object spouse;
	
	public EmpDetailsWithObject(String name, String id, String email, String degignation, int[] phone, Object spouse) {
		this.name = name;
		this.id = id;
		this.email = email;
		Degignation = degignation;
		Phone = phone;
		this.spouse = spouse;
	}
	
	
	EmpDetailsWithObject()
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
	public Object getSpouse() {
		return spouse;
	}
	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	
	

}
