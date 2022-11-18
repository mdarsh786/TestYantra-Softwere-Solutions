package group_1;

public class MultipleMissingNumber {

	public static void main(String[] args) {

		
		int [] a={10,7,4,3,1};
	
		for(int i=0; i<a.length-1; i++)
		{
			while(a[i]-a[i+1]>1)
			{
				a[i]--;
				
				System.out.println(a[i]+" ");
				
			}
		}
		
	}

}
