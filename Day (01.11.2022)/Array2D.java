//Multi dimentional array
public class Array2D { // class
	public static void main(String[] args) { // main method
		// declearing & initializing the 2D array
		int arr[][] = { { 2, 5, 6 }, { 4, 6, 8 } };
		for (int i = 0; i < 2; i++) { // for printing the row
			for (int j = 0; j < 3; j++) { // for printing column
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
