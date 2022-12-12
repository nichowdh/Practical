package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEg2 {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("pallabi");
		dq.add("subhajit");
		dq.add("mamta");
		dq.add("monami");
		dq.offerFirst("anju");
		System.out.println("after offer first");
		dq.offerLast("monalisha");
		System.out.println("after offer last");
		System.out.println("new list");
		// traversing
		for (String str1 : dq) {
			System.out.println(str1);
		} // deque.peek() & deque.peekFirst() same as peek
		System.out.println("peek: " + dq.peekLast());
		System.out.println("after peek last");
		System.out.println("new list after removal");
		for (String str2 : dq) {
			System.out.println(str2);
		} // deque.ppoll() & deque.pollFirst() same as poll
		System.out.println("pole: " + dq.pollLast());
		System.out.println("after poll last");
		for (String str3 : dq) {
			System.out.println(str3);
		}
	}

}
