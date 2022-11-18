package Programs;

public class MaxNumWithoutBubbleSort {

	public static void main(String[] args) {

		int a[]= {30,10,50,40,20};
		int max=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];//50
			}
		}
		System.out.println(max);
	}

}
