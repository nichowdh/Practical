//example or array 
public class ArrayEg2 { // class
	public static void main(String[] args) { // main method
		int a[] = new int[5]; // declaration & initialization
		// instantiation
		a[0] = 2;
		a[1] = 9;
		a[2] = 5;
		a[3] = 7;
		a[4] = 1;
		// int a[] = { 2, 9, 5, 7, 1 }; // declaration,initialization,
		// for (int i : a)
		for (int i = 0; i < a.length; i++) // length is onr of property of array
			System.out.println(a[i]);
	}

}
