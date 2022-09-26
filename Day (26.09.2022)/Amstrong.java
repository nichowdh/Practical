//WAP to check Amstrong Number
package com;

public class Amstrong {
	public static void main(String args[]) {
		int num = 153, original_num, rem, result = 0;
		original_num = num;
		while (original_num != 0) // using while loop
		{
			rem = original_num % 10;// 153%10=reminder=1
			result += Math.pow(rem, 3);// result =result+Math.pow(reminder,3)
			original_num /= 10;
		}
		if (result == num)// to check the result equal to number or not
			System.out.println(num + " is an amstrong number");
		else
			System.out.println(num + " is not an amstrong number");

	}

}
