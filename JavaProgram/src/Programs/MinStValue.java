package Programs;

public class MinStValue {

	public static void main(String[] args) {

		String str[]= {"hello","hi","abc","welcome","tyss"};
		String min=str[0];
		for(int i=1;i<str.length;i++)
		{
			if(min.length()>str[i].length())
			{
				min=str[i];
			}
		}
		System.out.println("minimum String length value is " +min);
	}

}
