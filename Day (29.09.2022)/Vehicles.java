package com;

// Single inheritance
class Vehicle { // parent class
	void running() {
		System.out.println("running mode on");
	}

}

class Bike extends Vehicle { // child class
	void run() {
		System.out.println("bike run mode");
	}

}

public class Vehicles { // main class
	public static void main(String[] args) {
		Bike b = new Bike(); // calling onject of child class
		b.run(); // child class output
		b.running();// parent class output
	}
}
