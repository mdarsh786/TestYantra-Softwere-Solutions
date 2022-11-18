package Programs;

public class ReverseValueWithSameCharNum {

	public static void main(String[] args) {

		String s="My name is Md Arshad Ansari";
		String rev="";

		for(int i=s.length() -1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

		rev=rev.replace(" ", "");
		System.out.println(rev);

		String[] str=s.split(" ");
		int in=0;
		for(int i=0;i<str.length;i++)
		{
			int n=str[i].length();
			while(n>0) {
				System.out.print(rev.charAt(in));
				n--;
				in++;
			}
			System.out.print(" ");
		}
	}

}
