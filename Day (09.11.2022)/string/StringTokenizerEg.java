package string;

import java.util.StringTokenizer;

//simple way to break a String (java.util.StringTokenizer)
public class StringTokenizerEg {
	public static void show() {
		StringTokenizer str = new StringTokenizer("Anudip foundation skill & career development center");
		while (str.hasMoreTokens()) { // boolean method to checks if there is more token availale or not
			System.out.println(str.nextToken(" ")); // String method, its returns the next token from String tokenizer
													// object
			StringTokenizer str1 = new StringTokenizer("I'm Niladri, and from Chinsurah");
			while (str1.hasMoreTokens()) {
				System.out.println();
				System.out.println(str1.nextToken(","));
			}
		}
	}

	public static void main(String[] args) {
		show();
	}

}
