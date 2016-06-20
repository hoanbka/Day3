package day3;

import java.util.Scanner;

public class Calculator {

	public static double tinhTong(double x, double y) {
		double tong = 0;
		tong = x + y;
		return tong;
	}

	public static double tinhHieu(double x, double y) {
		double tong = 0;
		tong = x - y;
		return tong;
	}

	public static double tinhTich(double x, double y) {
		double tich = 0;
		tich = x * y;
		return tich;
	}

	public static double tinhThuong(double x, double y) {
		double thuong = 0;
		if (y == 0) {
			System.out.println("Phep chia khong hop le");
		} else
			thuong = x / y;
		return thuong;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter x :");
		double x = input.nextDouble();
		System.out.println("Please enter y :");
		double y = input.nextDouble();

		System.out.println("Tong cua 2 so la " + tinhTong(x, y));
		System.out.println("Hieu cua 2 so la " + tinhHieu(x, y));
		System.out.println("Tich cua 2 so la " + tinhTich(x, y));
		if (y != 0) {
			System.out.println("Thuong cua 2 so la " + tinhThuong(x, y));
		}
		else 
			System.out.println("Phep chia khong hop le hehe");
	}

}
