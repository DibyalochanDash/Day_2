package Day_2;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello World";

		ReverseString(str);
	}

	private static void ReverseString(String str) {
		String t ="";
		int i= str.length()-1;
		while (i>=0) {
			t = t + str.charAt(i);
			i--;
		}
		System.out.println(t);
	}

}
