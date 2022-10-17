//we can take no.of arguments
public class VarargsEg {
	static void show(String... text) {
		System.out.println("show method invoke");
		for (String s : text) {
			System.out.println(s);
		}
	}

	public static void main(String... args) { // main method
		show(); // zero arguments
		show("hi"); // one argument
		show("i", "love", "coding"); // three arguments
	}
}
