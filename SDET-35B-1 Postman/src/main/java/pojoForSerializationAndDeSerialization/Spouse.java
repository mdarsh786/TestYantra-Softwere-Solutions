package pojoForSerializationAndDeSerialization;

public class Spouse {
	
	String Sname;
	String Semail;
	int Sphone;
	
	public Spouse(String sname, String semail, int sphone) {
		
		Sname = sname;
		Semail = semail;
		Sphone = sphone;
	}
	
	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getSemail() {
		return Semail;
	}

	public void setSemail(String semail) {
		Semail = semail;
	}

	public int getSphone() {
		return Sphone;
	}

	public void setSphone(int sphone) {
		Sphone = sphone;
	}

	

}
