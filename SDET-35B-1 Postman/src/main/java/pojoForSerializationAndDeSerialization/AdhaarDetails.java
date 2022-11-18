package pojoForSerializationAndDeSerialization;

public class AdhaarDetails {
	
	String Adhaarname;
	int AdhaarId;
	int DOB;
	String Address;
	
	public AdhaarDetails(String adhaarname, int adhaarId, int dOB, String address) {

		Adhaarname = adhaarname;
		AdhaarId = adhaarId;
		DOB = dOB;
		Address = address;
	}
	
	AdhaarDetails(){
		
	}

	public String getAdhaarname() {
		return Adhaarname;
	}

	public void setAdhaarname(String adhaarname) {
		Adhaarname = adhaarname;
	}

	public int getAdhaarId() {
		return AdhaarId;
	}

	public void setAdhaarId(int adhaarId) {
		AdhaarId = adhaarId;
	}

	public int getDOB() {
		return DOB;
	}

	public void setDOB(int dOB) {
		DOB = dOB;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
}
