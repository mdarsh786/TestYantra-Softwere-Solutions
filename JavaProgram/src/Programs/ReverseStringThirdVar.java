package Programs;

public class ReverseStringThirdVar {

	public static void main(String[] args) {

		String s="India is great";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev+" ");
		
		
		String[] txt = s.split(" ");
		System.out.println(txt[0]+" "+txt[1]+" "+txt[2]);
		
		for(int i=0;i<txt.length;i++) {
			
			for(int j=txt[i].length()-1;j>=0;j--)
			{
				System.out.print(txt[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}

//output
// aidni si taerg
