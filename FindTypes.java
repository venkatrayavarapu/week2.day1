package week2.day2.assignement;

public class FindTypes {

	/*
	 * Pseudo Code: a) Convert the String to character array b) Traverse through
	 * each character (using loop) c) Find if the given character is what type using
	 * (if) i) Character.isLetter ii) Character.isDigit iii)Character.isSpaceChar
	 * iv) else -> consider as special character
	 */
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;

		// Here is what the count you need to find
		char[] strToChar = test.toCharArray();
		for (int i = 0; i < strToChar.length; i++) {

			// Build the logic to find the count of each
			if (Character.isLetter(strToChar[i])) {
				letter++;
			} else if (Character.isDigit(strToChar[i])) {
				num++;
			} else if (Character.isSpaceChar(strToChar[i])) {
				space++;
			} else {
				specialChar++;
			}
		}
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
