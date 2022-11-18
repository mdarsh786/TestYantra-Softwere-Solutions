package Programs;

public class MxtStValue {

	public static void main(String[] args) {

		String str[]= {"hello","hi","abc","welcome","tyss"};
		String max=str[0];
		for(int i=1; i<str.length; i++)
		{
			if(max.length()<str[i].length())//
			{
				max=str[i];
			}
		}
		System.out.println("maximum String length value is " +max);
	}

}
