package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack1 = new Stack<Integer>();
		
		stack1.push(4);
		stack1.push(14);
		stack1.push(24);
		stack1.pop(); //it removes the value at the top of this stack
		stack1.add(34);
		
		System.out.println(stack1);
		System.out.println(stack1.peek());  //print the top value (last value) of the stack
		
		System.out.println(stack1.firstElement()); //it is part of vector
	}

}
