package Programs;

public class PrintAllChar {
	
	public static void main(String[] args) {
		String s="welcometotyss";
		int j=1;
		int k=1;
		for(int i=0; i<s.length();) { 
			String s1="";
			try {
			s1=s.substring(i, j);
			}
			catch (Exception e) {
				System.out.println(s.substring(i));
				break;
			}
			if(s1.length()<=3)
			{
				System.out.println(s1);
				
				i=j;
				j++;
				j=j+k;
				k++;
			}
			else
			{
				k=1;
				j=i+k;
			}
			
		}

	}

}
