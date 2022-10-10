package com;

//Method overloading- same name method with different argument
//two way we can overload the method
//1. changing the no. of argument
public class OverloadingChangingtype {
	static int sum(int a, int b) { // 2 arguments
		return a + b; // integer type argument
	}

	static int sum(int a, int b, int c) { // 3 arguments
		return a + b + c;// integer type argument
	}

	static Double sum(double a, double b, double c) { // 3 arguments
		return a + b + c; // double type argument
	}

	public static void main(String[] args) {
		System.out.println(OverloadingChangingtype.sum(4, 5));
		System.out.println(OverloadingChangingtype.sum(6, 5, 4));
		System.out.println(OverloadingChangingtype.sum(6.2, 5.5, 4.3));
	}

}
