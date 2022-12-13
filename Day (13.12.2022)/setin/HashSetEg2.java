package setin;

import java.util.HashSet;

public class HashSetEg2 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>(); // creating set 1
		hs.add("Ram");
		hs.add("Rima");
		hs.add("Shyam");
		hs.add("Ram");
		hs.add("Ramesh");
		System.out.println("Original list: " + hs);
		// remove specified element
		hs.remove("Ram");
		System.out.println("after ibvoking Remove: " + hs);
		HashSet<String> hs1 = new HashSet<String>(); // creating set 2
		hs1.add("Pallabi");
		hs1.add("Rahul");
		System.out.println("New Set: " + hs1);
		hs.addAll(hs1);
		System.out.println("Updated List " + hs);
		// remove all new elements
		hs.removeAll(hs1);
		System.out.println("New list after Remove: " + hs);
		// remove all elements
		hs.clear();
		System.out.println("present list: " + hs);

	}

}
