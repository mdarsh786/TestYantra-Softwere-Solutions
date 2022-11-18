package group_1;

import java.util.LinkedHashSet;

public class NumOfOccurenceEachNumber {

	public static void main(String[] args) {
		
		String s="India";
		//Step-1 To add all the character into set type of collection
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for(int i=0; i<s.length();i++)
		{
			lhs.add(s.charAt(i));
		}
		//step-2 compare each and every element of the set with all the char of string
		for(char ch:lhs)
		{
			int count=0;
			for(int i=0; i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++; // if matching increament the count
				}
			}
			System.out.println(ch+"   "+count);
		}
		
	}

}
