//Example of single dimentonal Array
public class ArrayExample { // class
	public static void main(String[] args) { // main method
		// declaration
		String[] names = { "pallabi", "Niladri", "shifa", "soumya", "Nisha", "Akshaya" };
		// for loop
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		// declaration
		int[] phone = { 123, 456, 567, 789, 333, 111, 2345, 7890 };
		// for each loop
		for (int n : phone) {
			System.out.println(n);
		}
	}

}
