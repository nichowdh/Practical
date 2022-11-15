package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//input mismatch exception
public class NestedException { // calss
	public static void main(String[] args) { // main method
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Two numbers"); // user input
		try {
			int x = s.nextInt(); // 1st input
			int y = s.nextInt();// 2nd input
			System.out.println(" " + (x / y));
		} catch (InputMismatchException e) { // input Mis match exception occurence
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
