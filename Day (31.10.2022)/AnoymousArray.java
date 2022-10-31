
public class AnoymousArray {
	// static print method receives an array as a array method
	static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		// passing anoymous array to method
		print(new int[] { 10, 20, 30, 40, 50, 70, 80 });
	}
}
