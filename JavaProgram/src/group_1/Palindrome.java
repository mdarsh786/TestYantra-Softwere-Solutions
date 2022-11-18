
 package group_1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {	
		
		String st="Madam";
		String str="";
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		st=sc.nextLine();
		
		for(int i=st.length()-1;i>=0;i--)
		{
			str=str+st.charAt(i);
		}
		if(st.equalsIgnoreCase(str)) { 
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
