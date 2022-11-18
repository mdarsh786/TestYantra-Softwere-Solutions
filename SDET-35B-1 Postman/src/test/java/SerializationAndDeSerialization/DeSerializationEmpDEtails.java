package SerializationAndDeSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeSerialization.EmployeeDetails;

public class DeSerializationEmpDEtails {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		//Step-1: Create Object of objectMapper
		ObjectMapper objm=new ObjectMapper();
		
		//Step-2: call the readValue
		EmployeeDetails emp=objm.readValue(new File(".\\EmployeeDetails.json"), EmployeeDetails.class);
		System.out.println(emp.getName());
		System.out.println(emp.getPhone());
	}

}
