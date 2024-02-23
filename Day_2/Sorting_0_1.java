package Day_2;

public class Sorting_0_1 {

	public static void main(String[] args) {
		
		int arr[] = {0,1,1,0,1,0,1,0,1,0,0,1,0} ;
		
		Sorting(arr); 
		for (int num : arr) {
			System.out.print(num+" ");
		}
		

	}

	private static void Sorting(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		
		while (i < j) {
			if (arr[i]==1 && arr[j]==0) {
				
				
				swap(arr,i,j);
				i++;j--;
			}
			
		
		if (arr[i]==0) {
			i++;
		}
		if (arr[j]==1) {
			j--;
		}
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
