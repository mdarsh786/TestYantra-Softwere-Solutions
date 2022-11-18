package Programs;

public class ReverseStringWithoutlengtVarAndlengthMethod {

	public static void main(String[] args) {
		
		String s="India";
		char[] ch=s.toCharArray();
		String rev="";
		for (char c : ch)
		{
			//rev=rev+c;
			rev=c+rev;
		}
		System.out.println(rev);
	}
}
