package Programs;

public class ThirdMaxNumWithoutBubbleSort {

	public static void main(String[] args) {
		
		int[] arr= {30,10,50,40,20};
		int fmax=arr[0];
		int smax=arr[0];
		int tmax=arr[0];
		
		for(int i=1; i<arr.length;i++)
		{
			if(fmax<arr[i]) {
			tmax=smax;
			smax=fmax;
			fmax=arr[i];
			}
			else if(smax<arr[i])
			{
				smax=fmax;
				fmax=arr[i];
				
			}
			else if(tmax<arr[i])
			{
				tmax=arr[i];
			}
			
		}
System.out.println(tmax);
	}

}
