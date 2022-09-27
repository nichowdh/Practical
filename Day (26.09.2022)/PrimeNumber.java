package com;

//wheather a numbe is prime or not
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int num, i, count = 0;
		Scanner sc = new Scanner(System.in);// syntax of scanner
		System.out.println("Enter a number: ");
		num = sc.nextInt();// taking user input
		for (i = 2; num > i; i++) {// to check the number prime or not
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0)
			System.out.println(" is a prime number");
		else
			System.out.println(" is not a prime number");
	}

}
