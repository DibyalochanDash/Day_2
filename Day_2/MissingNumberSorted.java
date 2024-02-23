package Day_2;

public class MissingNumberSorted {
	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6};
		
		missingNumber(arr);
	}

	private static void missingNumber(int[] arr) {
		int n = arr.length +1;
		int sum1 = n * (n+1)/2;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum2 +=arr[i]; 
		}
		
		System.out.println(sum1-sum2);
	}

}
