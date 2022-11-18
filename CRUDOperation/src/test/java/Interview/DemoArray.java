package Interview;

public class DemoArray {
	public static void main(String[] args) {
		int ar1[] = { 5, 7, 9 };
		int ar2[] = { 5, 4 };
		int arr[] = new int[ar1.length];
		for (int i = 0; i < arr.length; i++) {
			if (ar2.length > i)
				arr[i] = ar1[i] + ar2[i];
			else
				arr[i] = ar1[i];
		}
		for (int i = 0; i < arr.length; i++) {
			element(arr[i]);
		}
	}

	public static void element(int n) {
		while (n > 0) {
			int r = n % 10;
			System.out.print(r+" ");
			n = n / 10;
		}
	}

}
