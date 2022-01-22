package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Age");
		int Age = scanner.nextInt();
		
		if(Age>17) {
			System.out.println("You are eligible to vote.");
		} else if(Age==17){
			System.out.println("You are eligible to vote next year.");
		} else {
			System.out.println("You are not eligible for voting.");
		}
		
		scanner.close();
	}

}
