package group_1;

public class MissingNumber {

	public static void main(String[] args) {

		int[]a= {1,2,3,4,5,7,8,9};
		int ar=a.length+1;
		int sum=(ar*(ar+1))/2;
		
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum-a[i];
		}
		System.out.println("missing number is "+sum);
	}

}
