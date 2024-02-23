package Day_2;

public class Consicutive_SubArray {
	public static void main(String[] args) {
		
		int arr[] = {5,11,12,13,9,2,3,4,5,8};
		
		ConsicutiveSubArray(arr);
		ConsicutiveSubArrayCount(arr);
		ConsicutiveSubArrayMax(arr);
	}

	private static void ConsicutiveSubArrayMax(int[] arr) {
		
		int count = 1, max = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1]-arr[i]==1) {
				count++;
			} else {
				if (count > max) {
					max = count;
				}
				 count = 1;

			}
		}
		System.out.println(max);
		
	}

	private static void ConsicutiveSubArrayCount(int[] arr) {
	  int count = 1;
	  for (int i = 0; i < arr.length-1; i++) {
		if (arr[i+1] - arr[i] == 1) {
			count ++;
		} else {
			System.out.println(count);
			count = 1;

		}
		
	  }
		System.out.println(count);
	
		
	}

	private static void ConsicutiveSubArray(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1] -arr[i]==1) {
				System.out.print(arr[i]+" ");
			} else {
               System.out.print(arr[i]+" ");
               System.out.println();
			}
		}
		System.out.println(arr[arr.length-1]);
	}

}
