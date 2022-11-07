import java.util.ArrayList;

//Wrapper to Primitive
public class UnboxingEg {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		// autoboxing
		a1.add(5);
		a1.add(2);
		System.out.println("ArrayList: " + a1);
		// Unboxing
		int a = a1.get(0);
		int b = a1.get(1);
		System.out.println("Value of index 0 & 1 is: " + a + " " + b);
	}

}
