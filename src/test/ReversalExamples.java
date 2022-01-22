package test;

public class ReversalExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Reverse a string
		String text = "Clean India Green India";
		String reverseText = "";

		for (int i = text.length() - 1; i >= 0; i--) {
			reverseText = reverseText + text.charAt(i);
		}
		System.out.println(reverseText);

		// Reversal of Array

		int[] Arr2 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int[] revArr2 = null;
//		int[] revArr2 = new int[10];
		for (int i = Arr2.length - 1; i >= 0; i--) {
			revArr2 = Arr2;
			System.out.println("reversal of array is " + revArr2[i]);
		}

		// reversal of no

		int Number = 123456789;
		int revNumber = 0;
		while (Number != 0) {
			int Digit = Number % 10;
			revNumber = revNumber * 10 + Digit;
			Number = Number / 10;
		}
		System.out.println("Reversed integer is " + revNumber);

		// reversal of no

		int Num = 123456789;
		String newNum = Integer.toString(Num);
		String revNum = "";
		int reversedNum;
		 
		for (int i = newNum.length() - 1; i >= 0; i--) {
			revNum = revNum + newNum.charAt(i);
		}
		reversedNum = Integer.valueOf(revNum);
		System.out.println(reversedNum);

		// find no of vowels in a string

		String Text1 = "Green India Clean India";
		String toLowerText1 = Text1.toLowerCase();
		int vCount = 0;
		char var;
		for (int i = 0; i < toLowerText1.length(); i++) {
			var = toLowerText1.charAt(i);
			if (var == 'a' || var == 'e' || var == 'i' || var == 'o' || var == 'u') {
				vCount = vCount + 1;
			}
		}
		System.out.println("Total no of vowels in the given string is " + vCount);

	}

}
