package test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// While Loop to print 1 to 10

		int i = 1;

		while (i <= 10) {
			if (i == 5) {
				i = i + 1;
				continue; // this will skip the particular value and continue
			}
			System.out.println("While Loop " + i);
			i = i + 1;
		}

		// For Loops
		for (int Count = 1; Count <= 10; Count++) {
			if (Count == 5) {
//				continue; //to skip 5
				break; // to stop execution when it reaches 5
			}
			System.out.println(Count);
		}

		// For Loops to print 10 to 1
		for (int Count = 10; Count >= 1; Count--) {
			if (Count == 5) {
				continue; // to skip 5
//						break; //to stop execution when it reaches 5
			}
			System.out.println("For Loop " + Count);
		}

		// Arrays with Loop
		int[] arr1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		for (int index = 0; index < arr1.length; index++) {
			System.out.println("Array " + arr1[index]);
		}

		// for each loop cannot be used with break or continue
		for (int value : arr1) {
			System.out.println("For Each Loop " + value);
		}

	}
}
