package group_1;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		
		String s="My name is Arsh";
		String[] st=s.split(" ");
		
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]+" ");
		}

	}

}
