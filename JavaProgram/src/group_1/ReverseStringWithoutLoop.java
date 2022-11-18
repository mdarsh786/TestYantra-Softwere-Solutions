package group_1;

public class ReverseStringWithoutLoop {
	
	public static void printRev(String a,int b){
		
		if(b>-1) {
			
			System.out.print(a.charAt(b));
			printRev(a, b-1);
		}
		
	}

	public static void main(String[] args) {
		String s="Welcome";
		printRev(s,s.length()-1);

	}

}
