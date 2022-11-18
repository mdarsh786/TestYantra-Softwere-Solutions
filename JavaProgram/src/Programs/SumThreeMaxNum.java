package Programs;

public class SumThreeMaxNum {

	public static void main(String[] args) {
		int []a= {40,10,50,20,30};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		//50 40 30 20 10
		//0  1  2  3  4
		int sum=0; //102
		for(int i=0; i<3;i++) {
			
			sum=sum+a[i];// 0+50+40+30=120
		}
		System.out.println(sum);
	}

}
