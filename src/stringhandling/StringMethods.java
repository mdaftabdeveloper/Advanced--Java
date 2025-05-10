package stringhandling;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = " I am studying ";
		String s2 = " in the college.";

		// gives the length of the string
		System.out.println("Length: " + s1.length());

		// concatenate or joins the two strings
		System.out.println("Concatenations: " + s1.concat(s2));

		// dynamically format the string
		System.out.println("Formatted String: " + String.format("My name is %s and age is %d", "Aftab", 23));

		// returns the character at the index
		System.out.println("Character at: " + s1.charAt(9));

		// matches the content of two string
		if (s1.equals(s2)) {
			System.out.println("String Matched..");
		} else {
			System.out.println("Not Matched..");
		}

		// return the index of the specific character
		System.out.println("Index of: " + s1.indexOf('y'));
		// if character is not present in the string
		System.out.println("Index of: " + s1.indexOf('z'));
		// if character is present multiple times at many indices
		// the first match of the index is returned
		System.out.println("Index of: " + s1.indexOf('i'));

		// replace a character or a sequence of characters of a string
		System.out.println("Replace: " + s1.replace('s', 'z'));
		System.out.println("Replace: " + s1.replace("am", "was"));

		// split the string into multiple elements
		String ar[] = s1.split(" ");
		Arrays.asList(ar).forEach(s -> System.out.println(s));

		// makes the substring
		System.out.println("Substring: " + s1.substring(1, 5));

		// removes the extra space from starting and ending of the string
		System.out.println("Trim: " + s1.trim());

	}

}
