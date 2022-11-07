//primitive to Wrapper (obj)
public class Wrapper {
	public static void main(String[] args) {
		int a = 10; // primitive type
		Integer i = Integer.valueOf(a); // converting int tot Integer
		Integer j = a; // now compiler will write Integer.value of (a) autoboxing
		System.out.println(a + " " + i + " " + j);
	}

}
