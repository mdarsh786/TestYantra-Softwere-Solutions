package Programs;

public class FindPrimeNumber {

	public static void main(String[] args) {
		int n=3;
		int i=1; //int i=2;
		int count =0;
		while(n>=i)
		{
			if(n%i==0)
			{
				count++;  //break;
			}
			{
				i++;
			}
		}
		if(count==2)//(i==j)
		{
			System.out.println("prime number");
		} 
		else
		{
			System.out.println("Not a prime number");
		}
	}

}
