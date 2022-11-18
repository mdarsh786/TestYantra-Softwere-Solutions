package Variables_library;

import java.util.Random;

public class Java_Utility {
	
	public int getRandomNum() {
		
		/**
		 * This method will generate the random number
		 * @return
		 */
			Random ran = new Random();
			int random = ran.nextInt(200);
			return random;
		}
		

}
