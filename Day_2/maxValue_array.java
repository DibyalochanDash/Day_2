package Day_2;

public class maxValue_array {
	
	public static void main(String[] args) {
		
		int n[] = {3,5,4,5,1,5,2,-6};
	
	int res = maxArray(n);

	System.out.println(res);
	
	
	}

	private static int maxArray(int[] n) {
		if (n == null || n.length == 0) {
			
			return -1;
		}
		
		int index = 0;
		int maxValue = n[0];
		for (int i = 1; i < n.length; i++) {
			if (n[i] >= maxValue) {
				maxValue = n[i];
				index = i;
			}
		}
		return index;
	}

}
