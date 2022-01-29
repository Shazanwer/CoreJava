package oops;

public class MethodOverloadingExample {
	
	//this method will be used within the same class
	
	public void sum(int x, int y) {
		int sum = x+y;
		System.out.println("sum of x + y is " + sum);
	}
	
	public void sum(int x, int y, int z) {
		int sum = x+y+z;
		System.out.println("sum of x + y + z is " + sum);
	}

}
