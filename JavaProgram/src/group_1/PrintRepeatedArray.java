package group_1;

import java.util.LinkedHashSet;

public class PrintRepeatedArray {

	public static void main(String[] args) {
		int[] n= {1,1,2,3,3,4,5,6,6};
		
		//Step-1 To add all the character into set type of collection
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		for(int i=0; i<n.length;i++)
		{
			lhs.add(n[i]);
		}
		//step-2 compare each and every element of the set with all the char of string
		for(Integer in:lhs)
		{
			int count=0;
			for(int i=0; i<n.length;i++)
			{
				if(in==n[i])
				{
					count++; // if matching increament the count
				}
			}
			if(count>1) {
			System.out.println(in+"   "+count);
			}
		}

	}

}
