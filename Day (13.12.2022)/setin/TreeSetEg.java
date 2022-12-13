package setin;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEg {

	public static void main(String[] args) {
		// Tree set creation
		TreeSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("N");
		set.add("D");
		set.add("P");
		set.add("Q");
		set.add("S");
		set.add("T");
		set.add("J");
		set.add("F");
		set.add("G");
		set.add("V");
		set.add("C");
		set.add("R");
		set.add("B");
		System.out.println("Origilan Set: " + set);
		// traversing elements through Iterator in decending order
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("lowest value: " + set.pollFirst());
		System.out.println("updated list after pole first " + set);
		System.out.println("highest value: " + set.pollLast());
		System.out.println("updated list after pole last " + set);
		System.out.println("Reverse set " + set.descendingSet());
		// sorted set operation
		System.out.println("Head Set " + set.headSet("D"));
		System.out.println("Sub Set " + set.subSet("C", "N"));
		System.out.println("Tail Set " + set.tailSet("O"));
	}

}
