package Day_2;

public class Rearrenge_Number_0 {
	
	public static void main(String[] args) {
		
		int arr[] = {0,2,0,1,3,6,0,1,0,2,4,0};
		
		Rearrenge(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}

	private static void Rearrenge(int[] arr) {
		int  i = arr.length-1;
		int j = arr.length-1;
		
		while (i >= 0) {
			if (arr[i] != 0) {
			arr[j] = arr[i];
			j--;
		}
			i--;
		}
		while (j >= 0) {
			arr[j] = 0;
			j--;
		}
		
	}
}
