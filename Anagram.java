package week2.day1.string.assignments;

import java.util.Arrays;

public class Anagram {
	/*
	 * Pseudo Code
	 * 
	 * Declare a String String text1 = "stops"; Declare another String String text2
	 * = "potss"; a) Check length of the strings are same then (Use A Condition) b)
	 * Convert both Strings in to characters c) Sort Both the arrays d) Check both
	 * the arrays has same value
	 * 
	 */
public static void main(String[] args) {
	String text1 = "stops";
	String text2 = "potss";
	int x= text1.length();
	int y= text2.length();
	
	if( x==y) {
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		System.out.println(charArray1);
		System.out.println(charArray2);
		
		boolean Comp = Arrays.equals(charArray1, charArray2);
		if (Comp)
		System.out.println(text1 +" and " + text2 + " are anagrams");
		else
		System.out.println(text1 +" and " + text2 + " are not anagrams");
	}
}
}
