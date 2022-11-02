// clonning Array
public class ClonningArray {
	public static void main(String[] args) {
		int[] arr = { 44, 4, 5, 6 }; // declaring & initialize
		System.out.println("Print the actual array");
		for (int i : arr) // for each for loop print
			System.out.println(i); // print
		System.out.println("Print the clone array");
		int carr[] = arr.clone(); // creating clone
		for (int j : carr) // for each loop for cloning array
			System.out.println(j);
		System.out.println("Both are equal or not");
		System.out.println(arr == carr); // checking
	}
}
