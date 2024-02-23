package Day_2;

public class Even_Odd_sum {
	public static void main(String[] args) {
		
		int n = 372518;
		
		SumNumber(n);
	}

	private static void SumNumber(int n) {
		
		int rem = 0;
		int even_sum = 0;
		int odd_sum = 0;
		while (n > 0) {
			rem = n%10;
			if (rem%2 == 0) {
				even_sum += rem; 
			} else {
				odd_sum += rem;

			}
			n = n/10;
		}
		System.out.println(odd_sum - even_sum);
		
	}

}
