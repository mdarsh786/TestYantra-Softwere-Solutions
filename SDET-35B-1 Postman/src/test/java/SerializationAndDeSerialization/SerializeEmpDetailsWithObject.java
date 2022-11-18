package SerializationAndDeSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeSerialization.EmpDetailsWithObject;
import pojoForSerializationAndDeSerialization.Spouse;

public class SerializeEmpDetailsWithObject {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		int [] a= {12345,567889};
		Spouse sp=new Spouse("sita", "sita@gmail.com", 1234);
		
		EmpDetailsWithObject  empo=new EmpDetailsWithObject("Arshad", "tyss123", "arsh@gmail.com", "QA", a, sp);
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./EmpDetailsWithObject.json"), empo);

	}

}
