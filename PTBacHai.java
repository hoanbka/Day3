package day3;

import java.util.Scanner;

public class PTBacHai {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Giai PT : ax^2+bx+c=0");
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a :");
		double a = input.nextDouble();
		System.out.println("Please input b :");
		double b = input.nextDouble();
		System.out.println("Please input c :");
		double c = input.nextDouble();

		if (a == 0) {
			if ((b != 0) && (c != 0)) {
				System.out.println("PT co nghiem don : " + -b / c);
			} else if (c == 0) {
				System.out.println("PT co vo so nghiem");
			} else
				System.out.println("PT vo nghiem");
		} else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("PT vo nghiem");
			} else if (delta == 0) {
				System.out.println("PT co nghiem kep : " + -b / (2 * a));
			} else {
				System.out.println("PT co 2 nghiem phan biet : "
						+ (-b + Math.sqrt(delta)) / (2 * a) + " & "
						+ (-b - Math.sqrt(delta)) / (2 * a));
			}
		}

	}

}
