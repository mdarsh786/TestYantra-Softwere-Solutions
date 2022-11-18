package group_1;

import java.util.LinkedHashSet;

public class PrintNumAndVowel {

	public static void main(String[] args) {
		
		String str="Md Arshad Ansari";
		String str1="education";
		String sd = str.concat(str1);
		String[] df = sd.split(" ");
		String tr="";
		for (int i = 0; i < df.length; i++) {
			
			tr=tr+df[i];
			
		}
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
	    
			for(int i=0;i<tr.length();i++)
			{
				lhs.add(tr.charAt(i));
			}
			for(Character ch:lhs)
			{
				  int count=0;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
					System.out.println(count+"="+ch);
				}
				
			}
	}
}
