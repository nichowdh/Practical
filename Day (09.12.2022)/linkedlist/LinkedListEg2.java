// Adding data to the Linked List  
package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg2 {

	public static void main(String[] args) {
		// create list 1
		LinkedList<String> l = new LinkedList<String>();
		l.add("Niladri");
		l.add("Soumya");
		l.add("Nisha");
		l.add("Abhishek");
		l.add("Misbah");

		// System.out.println(l);
		Iterator<String> itr = l.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		// adding in a specific position
		l.add(2, "Subhajit");
		System.err.println("Updated list 1 after adding: " + l);
		// creating list 2
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Peso");
		l1.add("Atif");
		l1.add("Elijah");
		System.out.println("Current list 2 elements: " + l1);
		// adding list 1 & list 2
		l.addAll(l1);
		System.err.println("New List 1 is: " + l);
		// adding list 2 in list 1 at 2nd position
		l.addAll(2, l1);
		System.err.println("Updated List at 2nd position is: " + l);
		// adding to first position of list 2
		l1.addFirst("Subhajit");
		System.out.println(l1);
		// adding to the last position of list 2
		l1.addLast("Shruti");
		System.out.println(l1);

	}

}
