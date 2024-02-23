package Day_2;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "missim";

		PalindromeString(str);
	}

	private static void PalindromeString(String str) {
		int i = 0;
		int j = str.length()-1;
		while (i<j) {
			if (str.charAt(i)!= str.charAt(j)) {
				System.out.println("Not Palindrome");
				return;
			}
				i++;
				j--;
		}
		System.out.println("Palindrome");
		
	}

}
