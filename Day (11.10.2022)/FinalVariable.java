package com;

//final keyword --> cant cahnge the value of final variable
// final variable, final class, final method
public class FinalVariable {
	final int value = 50;

	void display() { // create final method
		System.out.println(value);
	}

	public static void main(String[] args) {
		FinalVariable fv = new FinalVariable();
		fv.display();
	}

}
