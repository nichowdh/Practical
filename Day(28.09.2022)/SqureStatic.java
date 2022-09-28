package com;

public class SqureStatic {
	static int square(int x) { // static method
		return x * x;
	}

	public static void main(String[] args) {
		int result = SqureStatic.square(2);
		System.out.println(result);
	}

}
