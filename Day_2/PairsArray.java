package Day_2;

import java.util.Scanner;

public class PairsArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		PairsArray(arr);
	}

	private static void PairsArray(int[] arr) {
		 for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if ((arr[i] + arr[j])== 5 ) {
				
					System.out.println(arr[i]+" "+arr[j]);
				}
				}
		}
		
	}

}
