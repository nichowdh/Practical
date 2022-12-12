package stack;

import java.util.Stack;

public class StackEg1 {

	public static void main(String[] args) {
		// create stack
		Stack<Integer> s = new Stack<>();
		// checking stack is empty or not
		boolean result = s.isEmpty();
		System.out.println("is the stack empty? " + result);
		// adding element using push() method
		s.push(10);
		s.push(20);
		s.push(11);
		s.push(40);
		s.push(55); // 1
		s.push(90);// 0
		System.out.println("Stack elements: " + s);
		Integer Digit = s.peek();// access element from top of stack
		System.out.println("top element: " + Digit);
		System.out.println("current stack" + s);
		Integer Digit2 = s.pop(); // remove element from the top of stack
		System.out.println("top element: " + Digit2);
		System.out.println("current stack" + s);
		int digit1 = s.search(20); // search any element using search() method
		System.out.println("search element: " + digit1);
		int x = s.size(); // find the size of stack using size() method
		System.out.println("stack size: " + x);
		result = s.empty();
		System.out.println("is the stack empty?" + result);

	}

}
