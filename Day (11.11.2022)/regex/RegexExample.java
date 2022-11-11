package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String[] args) {
		// three way to represent pattern & matche

		// 1st way
		Pattern p = Pattern.compile(".a");
		// cpmpile regular expression into pattern
		Matcher m = p.matcher("ma"); // .a dot represent single char m
		boolean b = m.matches();// opt for b//true
		// 2nd way
		boolean bb = Pattern.compile("..m").matcher("am").matches();

		// 3rd way
		boolean b1 = Pattern.matches(".a", "sa");// true
		System.out.println(b + " " + bb + " " + b1);

		// character class
		// [abc]=a,b,c, [^abc]=any char abc [a-zA-Z]=either upper/lower case and both
		boolean b2 = Pattern.matches("[a-zA-Z]", "A");
		boolean b3 = Pattern.matches("[Pqr]", "pqr");
		boolean b4 = Pattern.matches("[^abc]", "r");
		System.out.println(b2 + " " + b3 + " " + b4);

		// Quantifiers
		// x? -x occurs once or not at all x+ -- occure once or more than one
		// x* -- x occure zero or more time x(n) -- x occure n time x{7} only 7 char
		// x{n,} -- x occur n or more time x{7,} only 7 cahr or more
		boolean b5 = Pattern.matches("[a-zA-Z0-9]{12,}", "Anupid123ppp");
		System.out.println("For Password: " + b5);

		// for E-mail
		boolean b6 = Pattern.matches("^[a-zA-Z0-9+_.-]+@(.+)${20,}", "niladri123@gmail.com");
		System.out.println("For Email id: " + b6);
		// for phone number
		boolean b7 = Pattern.matches("[6789]{1}[0-9]{9}", "7980907919");
		System.out.println("Phone No. " + b7);

	}
}
