package com;

//final method can't be over ride
public class FinalMethod {
	final void display() { // create final method
		System.out.println("This is final method");
	}

	/*
	 * class Main extends FinalMethod { final void display() { // try to over
	 * ridefinal method System.out.println("This is final method"); } }
	 */

	public static void main(String[] args) {
		FinalMethod obj = new FinalMethod();
		obj.display();
	}

}
