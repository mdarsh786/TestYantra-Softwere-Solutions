package group_1;

import java.util.LinkedHashSet;

public class NumOfOccurenceEachWord {

	public static void main(String[] args) {
		String s="I Love my India and i Love Jharkhand";
		String[] str=s.split(" ");
		//Step-1 To add all the character into set type of collection
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		for(int i=0; i<str.length;i++)
		{
			lhs.add(str[i]);
		}
		//step-2 compare each and every element of the set with all the char of string
		for(String st:lhs)
		{
			int count=0;
			for(int i=0; i<s.length();i++)
			{
				if(st.equals(lhs))
				{
					count++; // if matching increament the count
				}
			}
			System.out.println(st+"   "+count);
		}

	}

}
