package SerializationAndDeSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeSerialization.EmployeeDetails;

public class SerializationEmpDetails {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		//Step-1: Create object of pojo class and initialize
		EmployeeDetails emp=new EmployeeDetails("Arshad", "TYSS123", "arshad@gmail.com", 123456789, "QA Engg");
		
		//Step-2: Create object of objectMapper class
		ObjectMapper objm=new ObjectMapper();
		
		//Step-3: from the objectmapper call the writeValue()
		objm.writeValue(new File("./EmployeeDetails.json"), emp);
		
	}

}
