package Programs;

public class incremental {
	public static void main(String[] args) {
		String s="abcdefghijklmn";
		int k=1;
		int j=1;
		for(int i=0; j<s.length();) {
			String res="";
			res=s.substring(i, j);
			
			if(res.length()<=3)
			{
				System.out.println(res);
				i=j;
				j++;
				j=j+k;
				k++;
			}
			else
			{
				k=1;
				j=i+k;
			}
		}

	}
}
