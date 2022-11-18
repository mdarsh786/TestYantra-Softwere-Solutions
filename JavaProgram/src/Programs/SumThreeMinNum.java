package Programs;

public class SumThreeMinNum {

	public static void main(String[] args) {
		
		int a[]= {30,10,50,40,20};
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		//10 20 30 40 50
		// 0  1  2  3  4
		int sum=0;
		for(int i=0; i<3;i++)
		{
			sum=sum+a[i];//0+10+20+30
		}
		System.out.println(sum);
	}

}
