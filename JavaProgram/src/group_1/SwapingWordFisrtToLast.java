package group_1;

public class SwapingWordFisrtToLast {

	public static void main(String[] args) {

		String st="My name is Arshad";
		//split so that I can get them in array
		String[] str=st.split(" "); 
		// Using temp swap for to first to last
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;

		for(int i=0;i<str.length;i++) {

			System.out.print(str[i]+" ");

		}
		System.out.print("------------------------");

		String s="India is great";
		String[] st1=s.split(" ");

		for (int i = 0; i < st1.length/2; i++) {

			String temp1=st1[i];
			st1[i]=st1[st1.length-i-1];
			st1[st1.length-i-1]=temp1;

			for(int i1=0; i1<st1.length;i1++) {
				System.out.print(st1[i1]+" ");

			}
		}

		System.out.println("---------------");

		String s1= "Welcome to tyss";

		String rev= "";

		String[] str1 = s1.split(" ");
		for(int i=0;i<str1.length;i++) {

			rev=str1[i]+" "+rev+" ";



		}
		System.out.println(rev);

	}

}
