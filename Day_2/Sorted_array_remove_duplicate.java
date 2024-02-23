package Day_2;

public class Sorted_array_remove_duplicate {
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,3,4,4,4,5};
		
		RemoveDuplicate(arr);
		UniqueNumbercount(arr);
	}

	private static void UniqueNumbercount(int[] arr) {
		int count = 1;
		int uniqcount = 0;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i+1]) {
				count++;
			} else {
				if (count ==1) {
					uniqcount ++;
				}
			
			 count = 1;
			}	
		}
		if (count == 1 ) {
			uniqcount ++;
		}
		
		System.out.println("Number of UniqueElement are : " +uniqcount);
		
	}

	private static void RemoveDuplicate(int[] arr) {
		int count = 1;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i+1]) {
				count ++;
				
			} else {
				if (count ==1 ) {
					System.out.println(arr[i]+" ");
					
				}
				
				count = 1;

			}
		}
		if (count == 1) {
			System.out.println(arr[arr.length-1]+" ");
		}
			
		
		
	}

}
