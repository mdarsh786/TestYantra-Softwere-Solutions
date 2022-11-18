package SerializationAndDeSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationAndDeSerialization.EmployeeDetailsWithArray;

public class SerializeEmpDetailsWithArray {

	public static void main(String[] agrs) throws JsonGenerationException, JsonMappingException, IOException
	{
		
		int[] a= {1234,5678};
		
		EmployeeDetailsWithArray empa=new EmployeeDetailsWithArray("Arsh", "tyss123", "arsh@gmail.com", "QA", a);
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./EmployeeDetailsWithArray.json"), empa);

	}

}
