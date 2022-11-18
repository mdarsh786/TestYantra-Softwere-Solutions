package Generic_Lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class File_lib {
	
	public String getPropertyFile(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./Data/Flipkart.properties");
		Properties p=new Properties();
		p.load(fis);
		 String  data= p.getProperty(key);
		return data;
	}

}
