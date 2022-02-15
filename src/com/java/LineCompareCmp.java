package com.java;

import java.util.Scanner;

public class LineCompareCmp {
	public static int lineLengthCal() {
		int x1, y1, x2, y2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter lines : x1,x2,x3,x4");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		int lineLength = (int) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return lineLength;

	}

	public static void equalityCheck(int lineOneLength, int lineTwoLength) {
		if (lineOneLength == lineTwoLength) {
			System.out.println("Lines are Equal");
		} else if (lineOneLength > lineTwoLength) {
			System.out.println("Line1 is greater than Line2 ");
		} else {
			System.out.println("Line2 is greater than Line1 ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line_check" + "Comparison Computation" + "Program on Master Branch");
		int lineOneLength = lineLengthCal();
		int lineTwoLength = lineLengthCal();
		System.out.println("The length of line 1 is: " + lineOneLength);
		System.out.println("The length of line 2 is: " + lineTwoLength);
		equalityCheck(lineOneLength, lineTwoLength);

	}

}