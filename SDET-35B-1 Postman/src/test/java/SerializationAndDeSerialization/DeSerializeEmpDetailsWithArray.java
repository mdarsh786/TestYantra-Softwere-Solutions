package SerializationAndDeSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeSerialization.EmployeeDetailsWithArray;

public class DeSerializeEmpDetailsWithArray {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper obj=new ObjectMapper();
		EmployeeDetailsWithArray empa=obj.readValue(new File("./EmployeeDetailsWithArray.json"), EmployeeDetailsWithArray.class);
		System.out.println(empa.getPhone()[0]);
	}

}
