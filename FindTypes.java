package week2.day1.string.assignments;

public class FindTypes{
	
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
		*/
       int length = test.length();
       
       for(int i=0;i<length;i++) {
    	 if ( Character.isLetter(test.charAt(i)))
    		 letter++;
    	 if(Character.isDigit(test.charAt(i)))
    		 num++;
    	 if(Character.isSpaceChar(test.charAt(i)))
    		 space++;
    	 else 
    		 specialChar =test.length() - test.replaceAll("\\$","").length();
       }
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	
	}


}