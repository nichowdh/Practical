//Two MAtrix Multiplication
public class MultiplicationMatrix {
	public static void main(String[] args) {
		// create matrix
		int a[][] = { { 1, 2 }, { 1, 2 } };
		int b[][] = { { 1, 2 }, { 1, 2 } };
		// for storing result creating another matrix
		int c[][] = new int[2][2];
		// logic and printing multiplying 2 matrix
		for (int i = 0; i < 2; i++) { // printing row
			for (int j = 0; j < 2; j++) {// printing column
				// c[i][j] = 0; // initializing the matrix value as 0
				for (int k = 0; k < 2; k++) { // printing the multiplication
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}

				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
