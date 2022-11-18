package Programs;

public class aaaa {

	public static void main(String[] args) {
		int n=131; //141
		int sum=0;
		while(n>0) {
			int rem=n%10;
			if(rem>1) {
				rem++;
			}
			sum=sum*10+rem;
			n=n/10;
		}
		System.out.println(sum);
	}

}
