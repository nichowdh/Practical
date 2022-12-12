package vector;

import java.util.Vector;

public class VectorEg1 {

	public static void main(String[] args) {
		// creating vector
		Vector<String> vc = new Vector<String>(4);
		// adding elements to vector
		vc.add("dog");
		vc.add("cat");
		vc.add("tiger");
		vc.add("lion");
		System.out.println("Vector is: " + vc);
		// checking size and capacity
		System.out.println("size " + vc.size());
		System.out.println("capacity " + vc.capacity());// old cap *3/2+1
		// add more elements
		vc.addElement("cow");
		vc.addElement("goat");
		System.out.println("after adding elements " + vc);
		// checking size and capacity
		System.out.println("size " + vc.size());
		System.out.println("capacity " + vc.capacity()); // old cap *3/2+1
		// checking "cat" is present in the vector or not
		System.out.println("\"cat\" is present in the vector or not");
		if (vc.contains("cat")) {
			System.out.println("element present");
		} else {
			System.out.println("element not present");
		}
		// getting 1st element
		System.out.println(vc.firstElement());
		// checking index of specified element
		System.out.println("index: " + vc.indexOf("cat"));

	}

}
