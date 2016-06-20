package day3;

import java.util.Scanner;

public class MonthOfTheYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please input the year :");
		int year = input.nextInt();
		System.out.println("Please input the month of the year :");
		int month = input.nextInt();
		int maxdays[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
			maxdays[2] = 29;
		}
		System.out.println("Month " + month + " of " + " Year " + year + " has"
				+ " " + maxdays[month] + " days ");
	}

}
