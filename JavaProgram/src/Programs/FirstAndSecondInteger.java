package Programs;

public class FirstAndSecondInteger {

	public static void main(String[] args) {
		
int a[]= {30,20,50,40,10};
		
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
		System.out.println(a[0]+","+a[1]);

	}

}
