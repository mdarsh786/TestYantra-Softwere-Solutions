package DataDrivenTesting;

import org.testng.annotations.Test;

import Variables_library.Category;
import Variables_library.PojoForPetStore;
import Variables_library.Tags;
import static io.restassured.RestAssured.*;

public class PetStoreTest {
	
	@Test
	 public void petStore() {
		
		
		Category ct=new Category(15, "Arshad");
		String[] purl= {"google","Firefox"};
		Tags t1=new Tags(11, "Ankur");
		Tags t2=new Tags(12, "Amaan");
		
		Object[] tg= {t1,t2};
		
		//PojoForPetStore pp=new PojoForPetStore(123, ct, "Aarun", purl, tg, "available");
		//given()
		
	}

}
