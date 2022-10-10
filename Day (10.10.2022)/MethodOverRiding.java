package com;

//1. same name method
//2. same parameter
//3. Is-A relationship 
class MethodOverRiding1 { // parent class
	void run() {
		System.out.println("Running mode on");
	}

}

class MethodOverRiding extends MethodOverRiding1 { // creating child class
	void run() {
		System.out.println("Running mode off");
	}

	public static void main(String[] args) {
		MethodOverRiding m = new MethodOverRiding(); // creating object
		m.run();
	}
}
