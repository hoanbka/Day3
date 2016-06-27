package day3;

import java.util.Scanner;

public class Calculator {

	public static double add(double x, double y) {
		double answer = 0;
		answer = x + y;
		return answer;
	}

	public static double subtract(double x, double y) {
		double answer = 0;
		answer = x - y;
		return answer;
	}

	public static double multiply(double x, double y) {
		double answer = 0;
		answer = x * y;
		return answer;
	}

	public static double divide(double x, double y) {
		double answer = 0;
		if (y == 0) {
			System.out.println("Invalid division");
			return -1;
		} else
			answer = x / y;
		return answer;
	}

	public static void main(String[] args) {
		double answer = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter x :");
		double x = input.nextDouble();

		char operator = input.next().charAt(0);

		System.out.println("Please enter y :");
		double y = input.nextDouble();
		switch (operator) {
		case '+':
			answer = add(x, y);
			break;
		case '-':
			answer = subtract(x, y);
			break;
		case '*':
			answer = multiply(x, y);
			break;
		case '/':
			answer = divide(x, y);
			break;
		}

		System.out.println(answer);
	}
}
