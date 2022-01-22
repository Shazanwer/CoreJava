package test;

public class DataTypesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 25;
		int sum = num1 + num2;
		int sub = num2 - num1;
		int mul = num1 * num2;
		float div = (float)num2 / num1;
		
		String result = "Sum of two numbers is " + sum;
		System.out.println(result);
		System.out.println("Diff of two nos is " + sub);
		System.out.println("Mul of two nos is " + mul);
		System.out.println("Div of two nos is " + div);
		
		String text = "Clean India Green India";
		
		System.out.println("Total no of char are " + text.length());
		
		char char1 = text.charAt(4);
		char char2 = text.charAt(text.length()-1);
		System.out.println("Char at position5 is " + char1);
		System.out.println("Charcter at last position is " + char2 );
		System.out.println("The text in uppercase is " + text.toUpperCase());
		System.out.println("The text in uppercase is " + text.toLowerCase());

	}

}
