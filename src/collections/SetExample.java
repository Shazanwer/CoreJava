package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>(); // use to return unique elements and does not maintain order
													// does not save duplicate value
													// retrieval is slow

		hs.add("john");
		hs.add("Sam");
		hs.add("Anwer");
		hs.add("Neil");
		hs.add("Anwer");
		hs.add(null);
		hs.add(null);

		System.out.println(hs);

		LinkedHashSet<String> lhs = new LinkedHashSet<String>(); // data is stored in the form of linked list and
																	// maintain order it is stored
																	// retrieval is fast
																	// does not save duplicate value

		lhs.add("john");
		lhs.add("Sam");
		lhs.add("Anwer");
		lhs.add("Neil");
		lhs.add("Anwer");
		lhs.add(null);
		lhs.add(null);

		System.out.println(lhs);

		TreeSet<String> ts = new TreeSet<String>(); // data is stored in the form of linked list and
													// maintain order it is stored and also store in ascending order
													// does not save duplicate value

		ts.add("john");
		ts.add("Sam");
		ts.add("Anwer");
		ts.add("Neil");
		ts.add("Anwer");

		System.out.println(ts);

		// to do remove duplicate words Green World Clean World

		String text = "Green World Clean World";
		String[] arrText = text.split(" ");

		TreeSet<String> ts1 = new TreeSet<String>();
		for (int i = arrText.length - 1; i >= 0; i--) {
			ts1.add(arrText[i]);
		}
		System.out.println(ts1);		
		for (Object i: ts1.toArray()) {
			  System.out.print(i);
			  System.out.print(" ");
			}
			System.out.println();

	}

}
