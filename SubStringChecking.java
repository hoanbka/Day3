package day3;

import java.util.Scanner;

public class SubStringChecking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter String 1 :");
		String string1 = input.nextLine();
		System.out.println("Please enter String 2 :");
		String string2 = input.nextLine();

		if (string1 != null && string2 != null
				& string2.length() <= string1.length()
				& string1.contains(string2)) {
			System.out.println("String 2 is a substring of String 1");
		} else
			System.out.println("String 2 is NOT a substring of String 1");

	}

}
