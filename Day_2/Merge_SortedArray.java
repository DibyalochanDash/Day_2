package Day_2;

public class Merge_SortedArray {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4};
		int arr2[] = {3,4,5,6,7,8,9};
		
		int[] result = MergeArray(arr1,arr2);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print (result[i]+" ");
		}

	}

	private static int[] MergeArray(int[] arr1, int[] arr2) {
		int i = 0,j= 0,k=0;
		int res[] = new int[arr1.length+arr2.length];
		
		while (i<arr1.length && j<arr2.length) {
			if (arr1[i]<= arr2[j]) {
				res[k] = arr1[i];
				i++ ;k++;
			}else {
				res[k] =arr2[j];
				j++;k++;
			}
		}
		while (i<arr1.length) {
			res[k] = arr1[i];
			i++;k++;
			
		}
		while (j<arr2.length) {
			res[k] = arr2[j];
			j++ ;k++;
		}	
		return res;
	}
	

}
