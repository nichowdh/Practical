//Has Set Example
package setin;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>(); // creating hash set
		hs.add("Ac"); // duplicate value not allowed
		hs.add("pencil");
		hs.add("Mouse");
		hs.add("Phone");
		hs.add(null);
		hs.add("Ac");
		hs.add("Bottle");
		hs.add("Earphone");
		hs.add("Pen");
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
