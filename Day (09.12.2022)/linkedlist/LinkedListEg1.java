//Linked List Examples
package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg1 { // class

	public static void main(String[] args) { // main method
		// create list
		LinkedList<String> l = new LinkedList<String>();
		l.add("Niladri");
		l.add("Soumya");
		l.add("Nisha");
		l.add("Abhishek");
		l.add("Misbah");
		l.add("Atif");
		// System.out.println(l);
		Iterator<String> itr = l.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
