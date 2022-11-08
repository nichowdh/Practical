package string;

import java.util.Scanner;

public class StringEquality { // class
	public static void main(String[] args) {// Main method
		String str1, str2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st String: ");
		str1 = sc.nextLine(); // 1st user input

		System.out.println("Enter 2nd String: ");
		str2 = sc.nextLine();// 2nd user input
//comparing two input string
		if (str1.equals(str2))
			System.out.println("Equal String");
		else
			System.out.println("Not Equal");
	}

}
