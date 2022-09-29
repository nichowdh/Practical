package com;

// Multi level Inheritance
class Vehicle1 { // parent class
	void running() {
		System.out.println("running mode on");
	}

}

class Bike1 extends Vehicle1 { // child class 1
	void run() {
		System.out.println("bike run mode");
	}

}

class Car extends Bike1 { // child class 2
	void speed() {
		System.out.println("speeed is very high");
	}
}

public class Multilvl {
	public static void main(String[] args) {
		Car c = new Car(); // calling the objet of child class
		c.run();
		c.running();
		c.speed();
	}

}
