package com;

// run-time polymorphism-- method overriding
class TestRunTimePoly {
	int val = 50;

	void show() { // parent class method
		System.out.println("show anything");
	}

}

class RunTimePoly extends TestRunTimePoly {
	int val = 70; // we can't over ride data type

	void show() { // child class method (method override)
		System.out.println("show nothing");
	}

	// reference variable of parent class refers to the object of child class
	public static void main(String[] args) {
		TestRunTimePoly obj = new RunTimePoly();
		obj.show();
		System.out.println("value is: " + obj.val);
	}

}
