package Day_2;

public class Rearrenge_Number {

	public static void main(String[] args) {
		
		int arr[] = {2,-1,5-1,6,4,8,-1,3,-1};
		
		RearrengeNumber(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void RearrengeNumber(int[] arr) {
		int i = arr.length-1;
		int j = arr.length-1;
		
		while (i >= 0) {
			if (arr[i]== -1 ) {
				i--; 
			}else {
				arr[j] = arr[i];
				j--; i--;
			}
		}
		while (j >= 0) {
			arr[j]= -1;
			j--;
		}
		
	}

}
