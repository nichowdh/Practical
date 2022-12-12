package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEg {

	public static void main(String[] args) {
		PriorityQueue<String> qu = new PriorityQueue<String>();
		qu.add("akash");
		qu.add("babai");
		qu.add("sanku");
		qu.add("hasan");
		qu.add("bumba");
		qu.add("tonmoy");
		qu.add("nisha");

		System.out.println("Head " + qu.element());
		System.out.println("Queue is " + qu);
		System.out.println("Head " + qu.peek());
		System.out.println("Queue is " + qu);
		System.out.println("Iterating the elements");
		Iterator itr = qu.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Head " + qu.poll());
		System.out.println("Queue is " + qu);
		System.out.println("Head " + qu.remove());
		System.out.println("Queue is " + qu);
		System.out.println("After Removing");
		Iterator itr1 = qu.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
