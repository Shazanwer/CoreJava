package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int[] Array1 = { 1, 2, 3, 4 };
		try {
			int result = num / 0; // It will throw exception
			System.out.println(Array1[10]);
		} catch (ArithmeticException e) {
			System.out.println("Inside Arithmetic Block");
		}  catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside Array Out of Bounds exception Block");
		}	catch (Exception e) {
			System.out.println("Inside Catch Block");
		}	finally {
			System.out.println("Inside Finally");
		}

		System.out.println("After try and catch");

	}

}
