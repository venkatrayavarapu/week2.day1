package week2.day2.assignement;

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
		if (text1.length() == text2.length()) {
			char[] char1 = text1.toCharArray();
			char[] char2 = text2.toCharArray();
			Arrays.sort(char1);
			Arrays.sort(char2);
			for (int i = 0; i < char1.length; i++) {
				if(char1[i]==char2[i]) {
					System.out.println("Both the arrays are same");
				}else {
					System.out.println("Both the arrays are not same");
				}

			}
		}
	}

}
