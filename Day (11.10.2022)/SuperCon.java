package com;

//3--> reffer immidiate parent class constructor
class Shape2 { // parent class
	public Shape2() { // constructor of parent class
		System.out.println("hello");
	}
}

class Size2 extends Shape2 { // child class
	Size2() { // constructor of child class
		super();
		System.out.println("hi");
	}
}

public class SuperCon { // main class
	public static void main(String[] args) {
		Size2 obj = new Size2(); // creating object
	}
}
