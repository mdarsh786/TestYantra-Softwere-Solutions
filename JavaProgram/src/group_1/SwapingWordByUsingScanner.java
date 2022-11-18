package group_1;

import java.util.Scanner;

public class SwapingWordByUsingScanner {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String str=sc.nextLine();

		String[] st=str.split(" "); 
		// Using temp swap for to first to last
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;

		for(int i=0;i<st.length;i++) {

			System.out.print(st[i]+" ");
		}
	}

}
