package week2.day1.string.assignments;

public class Palindrome {
	// Build a logic to find the given string is palindrome or not

	/*
	 * Pseudo Code
	 * 
	 * a) Declare A String value as"madam" b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order d) Add the char into rev e)
	 * Compare the original String with the reversed String, if it is same then
	 * print palinDrome
	 * 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
	 */

	public static void main(String[] args) {
		String Str = "madam";
		String rev = "";
		int len = Str.length();

		for (int i = len - 1; i > 0; i--) {
			rev = rev + Str.charAt(i);
		}
		if (Str.equals(rev))
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is a Palindrome");

	}

}
