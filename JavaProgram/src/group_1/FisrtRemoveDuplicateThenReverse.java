package group_1;

import java.util.LinkedHashSet;

public class FisrtRemoveDuplicateThenReverse {

	public static void main(String[] args) {
		
		String st="arshad ansari";
		//String str=" ";
		
		 LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		 
		 for (int i = 0; i < st.length(); i++) {
			 
			 lhs.add(st.charAt(i));
			
		}
		 String rev="";
		 for(char ch:lhs) { 
			 System.out.print(ch);
			 rev=ch+rev;
			 }
		 System.out.println(" ");
		 System.out.println(rev);
		 
	}

}
