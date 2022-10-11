package com;

//2--> reffter immidiate parent class method
class Shape1 { // parent class
	void print() { // parent class method
		System.out.println("Print circle");
	}
}

class Size1 extends Shape1 { // child class
	void print() { // same method of paent class(child class method )
		System.out.println("Print Triangle");
	}

	void display() { // new method of child class
		System.out.println("Print nothing");
	}

	void show() { // final method
		super.print(); // reffer to immidiate paent method
		display();
		print();
	}
}

public class SuperMethod {
	public static void main(String[] args) {
		Size1 obj = new Size1();
		obj.show();
	}

}
