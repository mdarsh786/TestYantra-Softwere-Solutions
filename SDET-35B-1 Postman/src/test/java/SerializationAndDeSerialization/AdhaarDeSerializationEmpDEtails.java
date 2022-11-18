package SerializationAndDeSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeSerialization.AdhaarDetails;

public class AdhaarDeSerializationEmpDEtails {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper obj=new ObjectMapper();
		AdhaarDetails adh=obj.readValue(new File("./Adhaardetails"), AdhaarDetails.class);
		
		System.out.println(adh.getDOB());

	}

}
