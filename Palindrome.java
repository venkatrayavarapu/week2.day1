package week2.day2.assignement;

public class Palindrome {

	// Build a logic to find the given string is palindrome or not

	/*
	 * Pseudo Code
	 * 
	 * a) Declare A String value as"madam"
	 * 
	 * b) Declare another String rev value as "" c) Iterate over the String in
	 * reverse order d) Add the char into rev e) Compare the original String with
	 * the reversed String, if it is same then print palinDrome
	 * 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
	 */
	public static void main(String[] args) {

		String str1 = "madam";
		String revStr = "";
		char[] charArray = str1.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			revStr = revStr + charArray[i];
		}
		if (str1.equals(revStr)) {
			System.out.println("Given string is palindrome : " + revStr);
		} else {
			System.out.println("Given string is not a palindrome : " + revStr);
		}

	}

}
