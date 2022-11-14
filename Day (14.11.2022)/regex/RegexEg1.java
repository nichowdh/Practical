package regex;

import java.util.regex.Pattern;

// Email pattern
public class RegexEg1 {
	public static void main(String[] args) {
		boolean b1 = Pattern.matches("^[a-z0-9+_.-]*@[a-z]*+\\.[a-z]{3}", "niladri123@gmail.com");
		System.out.println("Email: " + b1);
		boolean b2 = Pattern.matches("[a-zA-Z0-9+_.@]{11,}", "niladri@123");
		System.out.println("Pass: " + b2);
	}
}