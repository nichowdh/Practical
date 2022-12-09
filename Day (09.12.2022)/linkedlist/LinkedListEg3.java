//Removing data  from a linked List
package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg3 { // class

	public static void main(String[] args) { // main method
		// create list 1
		LinkedList<String> l = new LinkedList<String>();
		l.add("Niladri");
		l.add("Soumya");
		l.add("Nisha");
		l.add("Abhishek");
		l.add("Misbah");
		System.out.println("List 1 elements: " + l);

//				Iterator<String> itr = l.iterator();
//				while (itr.hasNext())
//					System.out.println(itr.next());

		// Removing from a specific element
		l.remove("Nisha");
		System.err.println("Updated list 1 after adding: " + l);
		// creating list 2
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Peso");
		l1.add("Atif");
		l1.add("Elijah");
		System.out.println("list 2 elements: " + l1);
		// adding 2 list
		l.addAll(l1);
		System.err.println("Upated list " + l);
		// Removing from a specific position
		l.remove(1);
		System.out.println("New List 1: " + l);
		// remove all the elements of list 2
		l.removeAll(l1);
		System.err.println("After removimng list 2 from list 1 :" + l);
		// Remove 1st element from the list
		l.removeFirst();
		System.out.println("After removing 1st: " + l);
		// Remove Last element from the list
		l.removeLast();
		System.out.println("After removing last: " + l);
		// adding new elements to list 1
		l.add("Shruti");
		l.add("Elina");
		l.add("pallabi");
		l.add("Elina");
		l.add("Sreeprasad");
		System.out.println("new updated list is: " + l);
		// remove first occurance of element
		l.removeFirstOccurrence("Elina");
		System.err.println("Current list 1 after removing 1st occurance: " + l);
		// remove last occurance of element
		l.removeLastOccurrence("Elina");
		System.err.println("Current list 1 after removing last occurance: " + l);
		// Traversing the list of elements in reverse order
		Iterator<String> itr = l.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// Remove all elements
		l.clear();
		System.err.println("Current list 1 is: " + l);
		Iterator<String> i = l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
