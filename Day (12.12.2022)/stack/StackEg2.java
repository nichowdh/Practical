package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEg2 {

	public static void main(String[] args) {
		// create stack
		Stack<Integer> s = new Stack<>();
		System.out.println("stack is: " + s);
		// using pushelement method
		pushelements(s, 15);
		pushelements(s, 45);
		pushelements(s, 20);
		pushelements(s, 30);
		pushelements(s, 40);
		// popping elements
		popelements(s);
		popelements(s);
		try {
			popelements(s);
		} catch (EmptyStackException e) {
			System.err.println("stack empty");
		}
	}

//puch operation of a stack
	private static void pushelements(Stack<Integer> s, int i) {
		// invoke push() method
		s.push(new Integer(i));
		System.out.println("push: " + i);
		System.out.println("stack is " + s); // modified stack

	}

//pop operation of a stack
	private static void popelements(Stack<Integer> s) {
		// invoke pop() method
		Integer i = (Integer) s.pop();
		System.out.println("Pop : " + i);
		System.out.println("stack is " + s); // modified stack
	}

}
