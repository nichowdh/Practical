package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEg {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("ram");
		dq.add("kran");
		dq.add("mamta");
		dq.add("shyam");
		dq.add("priya");
		dq.add("ajay");
		System.out.println(dq);
		dq.addFirst("sree");
		dq.addLast("riya");
		System.out.println("new list");
		for (String s1 : dq) {
			System.out.println(s1);
		}
		dq.removeFirst();
		dq.removeLast();
		System.out.println("new list after removal");
		for (String s2 : dq) {
			System.out.println(s2);
		}

	}

}
