package com;

//super keyword ->reference variable which reffer immidiate parent calss
//3 useage of super key word 
// 1 reffer immidiate parent clas instance variable
class Shape { // parent class
	String name = "Triangle"; // data member of parent class
}

class Size extends Shape { // child class
	String name = "Circle";// data member ofchild class

	void print() {
		System.out.println(name);
		System.out.println(super.name); // (super.age)
	}
}

public class SuperKey {
	public static void main(String[] args) {
		Size s = new Size();
		s.print();
	}

}
