package colection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCompareEg {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("Rose");
		a1.add("Sunflower");
		a1.add("Lily");
		a1.add("Daisy");
		a1.add("MariGold");
		a1.add("Tulip");
		a1.add("Jasmine");
		System.out.println(a1); // show 1st array list
		List<String> a2 = new ArrayList<String>();
		a2.add("Rose");
		a2.add("Sunflower");
		a2.add("Lily");
		a2.add("Daisy");
		a2.add("MariGold");
		a2.add("Tulip");
		a2.add("Jasmine");
		System.out.println(a2); // show 2nd array list
		// compare array list
		boolean b = a1.equals(a2);
		System.out.println(b);
		a1.add("red rose"); // add new element
		System.out.println("Updated Array List: " + a1); // new arraylist to 1st arraylist
		boolean b1 = a1.equals(a2);
		System.out.println(b1);

	}

}
