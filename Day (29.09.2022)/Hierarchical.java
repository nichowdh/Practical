package com;
// Hierarchical inheritance

class Vehicle2 { // parent class
	void running() {
		System.out.println("running mode on");
	}

}

class Bike2 extends Vehicle2 { // child class 1
	void run() {
		System.out.println("bike run mode");
	}

}

class Car1 extends Vehicle2 { // child class 2
	void speed() {
		System.out.println("speeed is very high");
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		Bike2 b = new Bike2(); // calling the object of 1st child class
		b.run();
		b.running();
		Car1 c = new Car1(); // calling the object of 2nd child class
		c.speed();
		c.running();
	}

}
