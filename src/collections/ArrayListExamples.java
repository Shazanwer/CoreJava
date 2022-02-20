package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExamples {

	public static void main(String[] args) {

		ArrayList<String> arrayList1 = new ArrayList<String>();

		arrayList1.add("Sha0"); // starts from 0 index
		arrayList1.add("Sha1");
		arrayList1.add("Sha2");
		arrayList1.add("Anwer");
		arrayList1.add("Sha3");

		System.out.println("Size of array list is: " + arrayList1.size());
		System.out.println(arrayList1); // print the array list

		arrayList1.get(2); // get the string at index 2
//		arrayList1.remove(2); // remove the data at index 2

		arrayList1.set(2, "Sha22");

		// to iterate the array list one by one
		for (int i = 0; i < arrayList1.size(); i++) {

			System.out.println(arrayList1.get(i));
		}

		// another way to iterate
		for (String name : arrayList1) {
			System.out.println("array list: " + name);

		}

		// using iterator
		Iterator<String> itr = arrayList1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Sorting Array List in ascending order
		Collections.sort(arrayList1);
		System.out.println("Sorting in asc:" + arrayList1);

		// To do - Sort the list in descending order
		Collections.reverse(arrayList1);
		System.out.println("Sorting in desc:" + arrayList1);

		
	}
}
