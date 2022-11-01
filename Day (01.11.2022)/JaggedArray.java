// odd numbers of columns known as jagged array
public class JaggedArray {
	public static void main(String[] args) {
		// declearing 2d array
		// declaeare no of row 3 but column blank
		int arr[][] = new int[3][];
		// defining column 5+7+9;
		arr[0] = new int[5];
		arr[1] = new int[7];
		arr[2] = new int[9];
		// initialize the jagged array
		int count = 0;
		for (int i = 0; i < arr.length; i++) // row
			for (int j = 0; j < arr[i].length; j++) // column
				arr[i][j] = count++;
		// printing thew jagged array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
