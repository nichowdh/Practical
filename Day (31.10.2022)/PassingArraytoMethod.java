//creating a method which pass an array as parameters
public class PassingArraytoMethod {
	static void maximumNo(int array[]) { // method name maximumNo
		int max = array[0];
		for (int i = 1; i < array.length; i++)
			if (max < array[i])
				max = array[i];
		System.out.println(max);
	}

	public static void main(String[] args) {
		int a[] = { 5, 7, 9, 2, 3 }; // declaring & initialize
		maximumNo(a); // passing array to a method
	}

}
