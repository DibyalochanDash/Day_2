package Day_2;

public class UnsortedArray_Merge { // merge 3 Array

	public static void main(String[] args) {
	   
		int ar1[] = {1,2,3};
		int ar2[] = {4,5,6};
		int ar3[] = {4,6,8,9};
		
		int result[] = MergeArray(ar1,ar2,ar3);
        for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

	private static int[] MergeArray(int[] ar1, int[] ar2, int[] ar3) {
		int i = 0 , k = 0;
		
		int res[] = new int[ar1.length + ar2.length +ar3.length];
		
		while (k < res.length) {
			if (i < ar1.length) {
				res[k++]= ar1[i];
			}
			if (i < ar2.length) {
				res[k++]= ar2[i];
			}
			if (i < ar3.length) {
				res[k++]= ar3[i];
			
		}
			i++;
		}
		return res;
	
	}
	}
