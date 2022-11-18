package SerializationAndDeSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeSerialization.EmpDetailsWithObject;

public class DeSerializeEmpDetailsWithObject {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper obj=new ObjectMapper();
		EmpDetailsWithObject emp=obj.readValue(new File("./EmpDetailsWithObject.json"), EmpDetailsWithObject.class);
		System.out.println(emp.getSpouse());
		
		System.out.println(emp.getPhone()[1]);
	}

}
