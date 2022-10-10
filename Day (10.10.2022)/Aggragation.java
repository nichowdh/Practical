package com;

class Circle { // class1
	int Square(int r) {
		return r * r;
	}
}

//area of circle pi*r*r

class Aggragation { // class 2
	Circle c; // obj entity reff.
	double pi = 3.14;

	double area(int radius) {
		c = new Circle();
		int psquare = c.Square(radius);
		return pi * psquare;
	}

	public static void main(String[] args) {
		Aggragation ag = new Aggragation();
		double result = ag.area(5);
		System.out.println(result);
	}
}
