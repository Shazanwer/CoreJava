package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq1 = new PriorityQueue<String>(); // it does not maintain the order of queue

		pq1.add("John");
		pq1.add("Shah");
		pq1.add("Bob");
		pq1.add("Shaz");

		System.out.println(pq1);
		System.out.println(pq1.peek()); //display the first value
		System.out.println(pq1.poll());
		System.out.println("Inside pq1:" + pq1);

		ArrayDeque<String> adq1 = new ArrayDeque<String>();  //it maintains the order of the array list

		adq1.add("Sam");
		adq1.add("Neil");
		adq1.add("Anwer");
		adq1.add("Shaz");

		System.out.println(adq1);
		System.out.println(adq1.peek());
		System.out.println(adq1.peekFirst());  //peek and peekFirst both are same
		System.out.println(adq1.peekLast());
		System.out.println(adq1.poll());  //remove the first value of the list
		System.out.println(adq1);

	}

}
