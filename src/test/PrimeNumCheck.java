package test;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;
		boolean flag = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Num is not a prime no.");
		} else {
			System.out.println("Num is a prime no.");
		}
	}

}
