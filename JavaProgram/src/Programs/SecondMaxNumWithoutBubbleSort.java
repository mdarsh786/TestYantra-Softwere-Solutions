package Programs;

public class SecondMaxNumWithoutBubbleSort {

	public static void main(String[] args) {
		
		int a[]= {30,10,50,40,20};
		int Fmax=a[0];
		int Smax=a[0];
		for(int i=1; i<a.length;i++)
		{
			if(Fmax>a[i])
			{
				Smax=Fmax;
				Fmax=a[i];
			}
			else if(Smax<a[i])
			{
				Smax=a[i];
			}
		}
		System.out.println(Smax+" "+Fmax);

	}

}
