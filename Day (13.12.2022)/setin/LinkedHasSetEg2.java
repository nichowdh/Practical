package setin;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSetEg2 {

	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>(); // creating hash set
		hs.add("Pen"); // duplicate value not allowed
		hs.add("pencil");
		hs.add("Mouse");
		hs.add("Phone");
		hs.add(null);
		hs.add("Ac");
		hs.add("Bottle");
		hs.add("Earphone");
		hs.add("Pen"); // not allowing duplicate
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
