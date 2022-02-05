package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>(); // insertion order not necessary will be
																			// maintained

		hmap1.put(3, "Shah"); // insert data in map
		hmap1.put(4, "Anwer");
		hmap1.put(2, "John");
		hmap1.put(1, "John");
		System.out.println(hmap1);

		hmap1.put(3, "Neil");
		System.out.println(hmap1); // Update the data in map
		System.out.println("get" + hmap1.get(1)); // fetch value based on its key

		hmap1.remove(3);
		System.out.println("HashMap" + hmap1); // remove data from map

		for (Entry<Integer, String> entry1 : hmap1.entrySet()) { // iterate through the hash map using entry set
			System.out.println(entry1.getKey() + " " + entry1.getValue());
//			System.out.println(entry1.getValue());
		}

		for (Integer key : hmap1.keySet()) { // get the keys
			System.out.println("Key is: " + key);
			System.out.println("Value is: " + hmap1.get(key));
		}

		for (String val : hmap1.values()) { // get the values
			System.out.println("Value is: " + val);
		}

		// Linked Hash Map
		LinkedHashMap<Integer, String> lhmap1 = new LinkedHashMap<Integer, String>(); // insertion order will be
																						// maintained

		lhmap1.put(11, "Shah"); // insert data in map
		lhmap1.put(20, "Anwer");
		lhmap1.put(3, "John");
		lhmap1.put(4, "John");
		System.out.println(hmap1);

		lhmap1.put(3, "Neil");
//		System.out.println(lhmap1); // Update the data in map

//		lhmap1.remove(3);
		System.out.println("LinkedHashMap" + lhmap1); // remove data from map

		// Tree Map
		TreeMap<Integer, String> tmap1 = new TreeMap<Integer, String>(); // insertion order will be maintained and in
																			// ascending order

		tmap1.put(11, "Shah"); // insert data in map
		tmap1.put(2, "Anwer");
		tmap1.put(323, "John");
		tmap1.put(14, "John");
		System.out.println(tmap1);

		tmap1.put(333, "Neil");
		System.out.println("TreeMap" + tmap1); // Update the data in map

//		lhmap1.remove(3);
//		System.out.println(tmap1); // remove data from map

		// to do: occurrence of each word in the string

		String text = "Love Clean India Green India Love India";
		TreeMap<String, Integer> tmap2 = new TreeMap<String, Integer>();
		String[] str = text.split(" ");
		int cnt = 0;
		for (String str1: str) {
			for (String str2: str) {
				if (str1.equals(str2)) {
					cnt = cnt + 1;
				}
			}
			tmap2.put(str1, cnt);
			cnt = 0;
		}
		System.out.println("Occurrence of each word in the string:" + tmap2);
		for (Entry<String, Integer> entry2 : tmap2.entrySet()) { // iterate through the hash map using entry set
			System.out.println(entry2.getKey() + " " + entry2.getValue());			
		}
		
		

	}

}
