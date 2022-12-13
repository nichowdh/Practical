package setin;

import java.util.LinkedHashSet;

public class LinkedHasSetEg {

	public static void main(String[] args) {
		// creating HashSet and adding elements
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Two");
		lhs.add("One");
		lhs.add("Three");
		lhs.add("Four");
		lhs.add("Five");
		System.out.println("original list: " + lhs);
		// removing specified element from the above mentioned list
		System.out.println(lhs.remove("Two"));
		System.out.println("updated list: " + lhs);
		// six is not present
		System.out.println(lhs.remove("Six")); // return false

	}

}
