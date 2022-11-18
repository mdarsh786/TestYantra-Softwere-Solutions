 package group_1;

public class Asssssss {

	public static void main(String[] args) {

		String st="aaaabbbbsssaaaeee";//output a4b4s3a3e3
		
		for (int i = 0; i < st.length(); i++) {
			
			int count=1;
			
			for (int j = i+1; j < st.length(); j++) {
				
				if(st.charAt(i)==st.charAt(j)) {
					
					count++;
					i++;
				}
				else {
					break;
				}	
			}
			System.out.print(st.charAt(i)+""+count);
		}	

	}

}
