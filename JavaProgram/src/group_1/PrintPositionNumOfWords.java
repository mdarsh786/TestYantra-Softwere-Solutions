package group_1;

import java.util.LinkedHashSet;

public class PrintPositionNumOfWords {

	public static void main(String[] args) {

		String str="Welocome to India and TYSS";
		String[] st=str.split(" ");

		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		for(int i=0; i<st.length;i++)
		{
			lhs.add(st[i]);
		}
		for(String word:lhs)
			for(int i=0; i<st.length;i++)
			{
				if(word.equals(st[i])) {
					//System.out.println(st[i]+"="+(i+1));
					System.out.println(word+"="+(i+1));
					break;
				}
			}
		
		//this for the position of same word in string
//				for(int i=0;i<st.length;i++) {
//							System.out.println(st[i]+"="+(i+1));
	}
}


