package group_1;

import java.util.LinkedHashSet;

public class FirstReverseThenRemoveDuplicate {

	public static void main(String[] args) {
		
		String str="arshad ansari";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println(" ");
		
		LinkedHashSet<Character> ch=new LinkedHashSet<Character>();
		
		
	}

}
