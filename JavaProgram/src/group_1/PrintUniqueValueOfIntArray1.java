package group_1;

import java.util.LinkedHashSet;

public class PrintUniqueValueOfIntArray1 {

	public static void main(String[] args) {

		int[] a={10,20,30,40};
		int[] b ={20,30,50};
		int[] merge =new int[a.length+b.length];
		int i=0,k=0,j=0;
		while(i <a.length)
		{
			merge[k]= a[i];
			k++;
			i++;
		}
		while(j<b.length)
		{
			merge[k]=b[j];
			k++;
			j++;
		}
		LinkedHashSet<Integer> set =new LinkedHashSet<Integer>();
		for(int m=0;m<merge.length;m++)
		{
			set.add(merge[m]);
		}
		for(Integer in : set)
		{
			int count=0;
			for(int n=0;n<merge.length;n++)
			{
				if(in==merge[n])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(in+",");
			}
		}
	}

}

