package Day_2;

public class TwoD_Array_Element_Find {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},
				      {4,5,6},
				      {7,8,9}};
           int find = 7;
           
           boolean search =  FindElement(arr,find);
           if (search) {
			System.out.println("Element are " + search);
		} else {
            System.out.println("Not found "+search);
		}
	}

	private static boolean FindElement(int[][] arr, int find) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j]==find) {
					return true;
				}
			}
		}
		return false;
	}

}
