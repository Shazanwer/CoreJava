package test;

import java.util.Scanner;

public class NoCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Number");
		int Number = scanner.nextInt();

		if (Number % 2 == 0) {
			System.out.println("No is even");
		} else {
			System.out.println("No is odd");
		}

		scanner.close();
	}

}
