package Day_2;

public class TwoArrayEqual {
    public static void main(String[] args) {

        int arr1[] = {3, 5, 6, 8, 9};
        int arr2[] = {8, 8, 7, 6, 4, 3, 2};

        EqualElement(arr1, arr2);
        System.out.println("------------------");
        EqualsElement(arr1,arr2);
    }

    private static void EqualsElement(int[] arr1, int[] arr2) {
    	  int i = 0, j = arr2.length-1;
          while (i < arr1.length && j >= 0) {
              if (arr1[i] == arr2[j]) {
                  System.out.println(arr2[j] + " ");
                  i++;
                  j--;
              } else if (arr1[i] > arr2[j]) {
                  j--;
              } else {
                  i++;
              }
            
          }
      
		
	}

	private static void EqualElement(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i]+" ");
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
    }
}

