package Programs;

public class SecondMinNumWithoutBubbleSort {

	public static void main(String[] args) {

		int a[]= {30,100,500,40,20};
		int Fmin=a[0];
		int Smin=a[0];
		for(int i=1; i<a.length;i++)
		{
			if(Fmin>a[i])
			{
				Smin=Fmin;
				Fmin=a[i];
			}
			else if(Smin>a[i])
			{
				Smin=a[i];
			}
		}
		System.out.println(Smin+" "+Fmin);
	}

}
