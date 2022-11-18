package Programs;

public class TwoSameMinValue {

	public static void main(String[] args) {

		String str[]= {"hello","hi","abc","am","welcome","tyss"};
		String min=str[0];
		for(int i=1;i<str.length;i++)
		{
			if(min.length()>str[i].length())
			{
				min=str[i];
			}

		}

		for(int i=0;i<str.length;i++)
		{
			if(min.length()==str[i].length())
			{
				System.out.println(str[i]);
			}
		}
	}

}
