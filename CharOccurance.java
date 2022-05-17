package week2.day1.string.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		String str = "welcome to chennai";
		// declare and initialize a variable count to store the number of occurrences
		// convert the string into char array
		// get the length of the array
		// traverse from 0 till the array length
		// Check the char array has the particular char in it
		// if is has increment the count
		// print the count out of the loop
		
		int size = str.length();
		int count = 0;

		for (int i = 0; i < size; i++) {
			char charAt = str.charAt(i);
		 //  System.out.println(charAt[i]);
			if (charAt == 'e')
				count = count + 1;
			
		}
		System.out.println("Number of occurences of a char 'e' is " + count);
	}

}
