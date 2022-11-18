package SerializationAndDeSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeSerialization.AdhaarDetails;

public class AdhaarSerializationEmpDEtails {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		AdhaarDetails adh=new AdhaarDetails("Md Arshad Ansari", 12345678, 12/03/12, "Bangalore");
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./Adhaardetails"), adh);

	}

}
