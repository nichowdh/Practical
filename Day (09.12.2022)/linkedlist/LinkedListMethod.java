// Methods of Linked List
package linkedlist;

import java.util.LinkedList;

public class LinkedListMethod { // class

	public static void main(String[] args) { // main method
		// creating a List
		LinkedList<String> l = new LinkedList<String>();
		l.add("Niladri");
		l.add("Soumya");
		l.add("Nisha");
		l.add("Abhishek");
		l.add("Misbah");
		l.add("sourav");
		System.err.println("List 1 elements: " + l);

		// Retriving the 1st element of list by default using peek() method

		System.out.println(l.peek());
		// Retriving the 1st element of list
		System.out.println(l.peekFirst());
		// Retriving the last element of list
		System.out.println(l.peekLast());

		// Retrive and remove 1st element by default using poll() method
		System.out.println(l.poll());
		System.out.println("New list 1 element: " + l);
		// Retrive and remove 1st element
		System.out.println(l.pollFirst());
		System.out.println("New list 1 element: " + l);
		// Retrive and remove last element by default
		System.out.println(l.pollLast());
		System.out.println("New list 1 element: " + l);

		// Retrive and remove 1st element by default using pop() method
		System.out.println(l.pop());
		System.out.println("New list 1 element: " + l);

	}

}
