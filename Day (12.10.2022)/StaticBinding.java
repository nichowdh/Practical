package com;
//undersanding type--1 variable type-- int a=50;

// reference type--
// class bank
//psvm(string args[])
//bank obj;
//object type--> bank obj=new bank();

class StaticBinding { // static binding
	private void display() {
		System.out.println("Samjhe?");
	}

	public static void main(String[] args) {
		StaticBinding obj = new StaticBinding(); // object type
		obj.display();
	}

}
