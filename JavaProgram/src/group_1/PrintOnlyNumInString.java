package group_1;

public class PrintOnlyNumInString {

	public static void main(String[] args) {
		
		String str="a354sdf&6ty";
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				int n=str.charAt(i)-48; //48 is ascii value of 0
				System.out.println(n);
			
			}
		}
	}

}
