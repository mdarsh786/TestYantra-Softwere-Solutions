package group_1;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			int a=num*i;
			System.out.println(num+" * "+i+" = "+a);
//			System.out.print("  ");
//			int b=num*i;
//			System.out.print(num+" * "+i+" = "+b);
//			System.out.println();

		}
	}
}
 